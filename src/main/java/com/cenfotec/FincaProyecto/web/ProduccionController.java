package com.cenfotec.FincaProyecto.web;

import java.text.ParseException;
import java.util.List;

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
import com.cenfotec.FincaProyecto.service.ProduccionService;

import reactor.core.publisher.Mono;

@Controller
public class ProduccionController {
	
	@Autowired
	ProduccionService servProd;
	
	
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
		servProd.saveProduccion(produccion);
		model.addAttribute("produccion", servProd.getAllProducciones());
		return "redirect:/fincaListar/";
	}
	
	@GetMapping("/produccionListar")
	public String produccionList(Model model) {
		model.addAttribute("produccionLista", servProd.getAllProducciones());
		model.addAttribute("produccion", new Empleado());
		return "produccionlistar";
	}
	
	@PostMapping("/update/produccion/{id}")
	public String updateProduccion(@PathVariable String id, @Valid Produccion produccion, BindingResult result, Model model) {
		servProd.saveProduccion(produccion);
		model.addAttribute("produccion", servProd.getAllProducciones());
		return "redirect:/produccionListar/";
	}
	
	@GetMapping("/edit/produccion/{id}")
	public String showUpdateForm(@PathVariable String id, Model model) {
		List<Produccion> produccion = servProd.getProduccionesById(id);
		model.addAttribute("produccion", produccion);

		return "actualizarProduccion";
	}
	
	

}
