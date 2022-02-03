package org.iesalixar.controller;

import org.iesalixar.dto.MatriculaDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forms")
public class SimpleFormController {
	@GetMapping("/matriculaForm")
	public String getMatriculaForm(Model model) {
		
		MatriculaDTO matricula = new MatriculaDTO();
		model.addAttribute("matricula",matricula);
		
		return "forms/matriculaForm";
	}
	
	@PostMapping("/matriculaForm")
	public String postMatriculaForm(@ModelAttribute  MatriculaDTO matricula, Model model) {
		
		model.addAttribute("matricula",matricula);
		
		return "forms/matriculaForm";
	}
	
	
}
