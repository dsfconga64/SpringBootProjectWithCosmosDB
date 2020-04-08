package com.cenfotec.FincaProyecto.web;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cenfotec.FincaProyecto.domain.Empleado;
import com.cenfotec.FincaProyecto.repository.EmpleadoRepository;

@Controller
public class EmpleadoController {
	
	@Autowired
	EmpleadoRepository repo;
	
	
	@RequestMapping("/registrarEmpleado/{id}")
	public String index(Model model, @PathVariable Long id) throws ParseException {
		Empleado empleado = new Empleado();
		empleado.setIdFinca(id);
		model.addAttribute("empleado", new Empleado());
		model.addAttribute("empleado", empleado);
		return "registrarEmpleado";
	}
	
	
	@PostMapping("/empleado/registrar/{id}")
	public String empleadoSubmit(@Valid Empleado empleado, @PathVariable Long id, BindingResult result, Model model) {
		empleado.setIdFinca(id);
		repo.save(empleado);
		model.addAttribute("finca", repo.findAll());
		return "redirect:/fincaListar/";
	}
	
	@GetMapping("/empleadoListar")
	public String empleadoList(Model model) {
		model.addAttribute("empleadoLista", repo.findAll());
		model.addAttribute("empleado", new Empleado());
		return "empleadolistar";
	}
	
	@PostMapping("/update/empleado/{id}")
	public String updateEmpleado(@PathVariable Long id, @Valid Empleado empleado, BindingResult result, Model model) {
		repo.save(empleado);
		model.addAttribute("empleado", repo.findAll());
		return "redirect:/empleadoListar/";
	}
	
	@GetMapping("/edit/empleado/{id}")
	public String showUpdateForm(@PathVariable Long id, Model model) {
		Empleado empleado = repo.findById(id).get();
		model.addAttribute("empleado", empleado);

		return "actualizarEmpleado";
	}
	
	@GetMapping("/delete/{id}")
	public String elminarEmpleado(@PathVariable("id") Long id, Model model) {
      
		repo.deleteById(id);
		model.addAttribute("empleados", repo.findAll());
		return "redirect:/empleadoListar/";
	}

}
