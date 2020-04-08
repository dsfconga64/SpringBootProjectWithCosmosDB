package com.cenfotec.FincaProyecto.web;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.cenfotec.FincaProyecto.domain.Produccion;
import com.cenfotec.FincaProyecto.repository.ProduccionRepository;

@Controller
public class ProduccionController {
	
	@Autowired
	ProduccionRepository repo;
	
	
	@RequestMapping("/registrarProduccion/{id}")
	public String callToProduccion(Model model, @PathVariable Long id) throws ParseException {
		Produccion produccion = new Produccion();
		produccion.setIdFinca(id);
		model.addAttribute("produccion", new Produccion());
		model.addAttribute("produccion", produccion);
		return "registrarProduccion";
	}
	
	@PostMapping("/produccion/registrar/{id}")
	public String empleadoSubmit(@Valid Produccion produccion, @PathVariable Long id, BindingResult result, Model model) {
		produccion.setIdFinca(id);
		repo.save(produccion);
		model.addAttribute("produccion", repo.findAll());
		return "redirect:/fincaListar/";
	}
	
	@GetMapping("/produccionListar")
	public String produccionList(Model model) {
		model.addAttribute("produccionLista", repo.findAll());
		model.addAttribute("produccion", new Empleado());
		return "produccionlistar";
	}
	
	@PostMapping("/update/produccion/{id}")
	public String updateProduccion(@PathVariable Long id, @Valid Produccion produccion, BindingResult result, Model model) {
		repo.save(produccion);
		model.addAttribute("produccion", repo.findAll());
		return "redirect:/produccionListar/";
	}
	
	@GetMapping("/edit/produccion/{id}")
	public String showUpdateForm(@PathVariable Long id, Model model) {
		Produccion produccion = repo.findById(id).get();
		model.addAttribute("produccion", produccion);

		return "actualizarProduccion";
	}
	
	

}