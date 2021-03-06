package org.iesalixar.servidor.controller;

import java.util.List;

import org.iesalixar.servidor.model.Alumno;
import org.iesalixar.servidor.services.AlumnoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlumnoController {

	@Autowired
	AlumnoServiceImpl alumnoService;
	
	@RequestMapping("/alumnos")
	public String alumno(Model model) {
	
		List<Alumno> alumnos = alumnoService.getAllAlumns();
		
		model.addAttribute("alumnos",alumnos);
		return "alumnos";
	}
}
