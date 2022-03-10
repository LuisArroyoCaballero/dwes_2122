package org.iesalixar.controller;

import java.util.List;
import java.util.Optional;

import org.iesalixar.model.Grado;
import org.iesalixar.services.GradoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/grados")
public class GradoController {

	@Autowired
	GradoServiceImpl gradoService;

	@GetMapping("/")
	public String grados(@RequestParam(required = false, name = "error") String error, Model model) {

		List<Grado> grados = gradoService.getAllGrados();
		model.addAttribute("grados", grados);
		if (error != null) {
			model.addAttribute("error", "Error al visualizar las asignaturas");
		}

		return "grados";

	}

	@GetMapping("/asignaturas")
	public String asignaturas(@RequestParam(required = false, name = "codigo") String codigo, Model model) {

		if (codigo == null) {
			model.addAttribute("error", "Error a la hora de ver las asignaturas");
			return "redirect:/grados/?error=Error";
		}

		Optional<Grado> grado = gradoService.findGradoById(Long.parseLong(codigo));
		model.addAttribute("grado", grado.get());
		return "asignaturas";
	}

	@GetMapping("/addGrado")
	public String addGradoGet(@RequestParam(required = false, name = "error") String error, Model model) {

		Grado grdo = new Grado();

		model.addAttribute("grdo", grdo);
		model.addAttribute("error", error);
		return "addGrado";
	}
	
	@PostMapping("/addGrado")
	public String addDepartmentPost(@ModelAttribute Grado grdo,Model model) {
		
		Grado gradoBD = new Grado();
		gradoBD.setNombre(grdo.getNombre());
		
		if (gradoService.addGrado(gradoBD)==null) {
			return "redirect:/grados/addGrado?error=Existe&dpto="+grdo.getNombre();
		}
		
		return "redirect:/grados/";
	}
	
	

}
