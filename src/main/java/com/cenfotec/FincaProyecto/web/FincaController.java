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

import com.cenfotec.FincaProyecto.domain.Finca;
import com.cenfotec.FincaProyecto.repository.FincaRepository;
import com.cenfotec.FincaProyecto.service.FincaService;

import reactor.core.publisher.Mono;

@Controller
public class FincaController {

	@Autowired
	FincaService serviceFinca;

	@RequestMapping("/")
	public String index(Model model) throws ParseException {
		model.addAttribute("finca", new Finca());
		return "index";
	}
	
	 @PostMapping("/finca/registrar")
	    public String addUser(@Valid Finca finca, BindingResult result, Model model) {
		 	serviceFinca.save(finca);
	        model.addAttribute("finca", serviceFinca.findAll());
	        return "redirect:/fincaListar";
	        
	    }
	 
		@GetMapping("/fincaListar")
		public String fincaList(Model model) {
			model.addAttribute("fincaLista", serviceFinca.findAll());
			model.addAttribute("finca", new Finca());
			return "fincalistar";
		}
		
		@PostMapping("/update/{id}")
		public String updateFinca(@PathVariable("id") long id, @Valid Finca finca, BindingResult result, Model model) {
			if (result.hasErrors()) {
				finca.setId(id);
				return "update-finca";
			}
			serviceFinca.save(finca);
			model.addAttribute("finca", serviceFinca.findAll());
			return "redirect:/fincaListar/";
		}
		
		@GetMapping("/edit/{id}")
		public String showUpdateForm(@PathVariable Long id, Model model) {
			Mono<Finca> finca = serviceFinca.findById(id);
			model.addAttribute("finca", finca);

			return "actualizarFinca";
		}
		
		


}
