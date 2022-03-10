package org.iesalixar.controller;

import java.util.List;
import java.util.Optional;

import org.iesalixar.model.Asignatura;
import org.iesalixar.model.Departamento;
import org.iesalixar.model.Profesor;
import org.iesalixar.services.AsignaturaServiceImpl;
import org.iesalixar.services.DepartamentoServiceImpl;
import org.iesalixar.services.ProfesorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/profesores")
public class ProfesorController {
	
	@Autowired
	ProfesorServiceImpl profService;
	
	@Autowired
	DepartamentoServiceImpl deptService;
	
	@Autowired
	AsignaturaServiceImpl asigService;
	
	@GetMapping("")
	public String profesores(@RequestParam(required = false, name = "error") String error, Model model) {

		List<Profesor> profesores = profService.getAllProfesor();
		model.addAttribute("profesores", profesores);
		if (error != null) {
			model.addAttribute("error", "Error al visualizar las asignaturas");
		}

		return "profesores";

	}
	
	@GetMapping("/asignaturas")
	public String asignaturas(@RequestParam(required = false, name = "codigo") String codigo, Model model) {

		if (codigo == null) {
			model.addAttribute("errorAsignatura", "PROFESOR NO SELECCIONADO");
			return "asignaturas";
		}

		Optional<Profesor> profesor = profService.findProfesorById(Long.parseLong(codigo));
		model.addAttribute("profesor", profesor.get());
		
		if (profesor.get().getAsignaturas().isEmpty()) {
			model.addAttribute("errorAsignatura", "PROFESOR SIN ASIGNATURAS ASIGNADAS");
			return "asignaturas";
		}
		return "asignaturas";
	}
	
	@GetMapping("/addProfesor")
	public String addProfesorGet(@RequestParam(required = false, name = "error") String error, Model model) {

		Profesor prof = new Profesor();
		
		List<Departamento> departamentos = deptService.getAllDepartments();
		model.addAttribute("departamentos", departamentos);
		
		model.addAttribute("prof", prof);
		model.addAttribute("error", error);
		return "addProfesor";
	}
	
	@PostMapping("/addProfesor")
	public String addProfesorPost(@ModelAttribute Profesor prof,Model model) {
		
		Profesor profBD = new Profesor();
		
		profBD.setNif(prof.getNif());
		profBD.setNombre(prof.getNombre());
		profBD.setApellido1(prof.getApellido1());
		profBD.setApellido2(prof.getApellido2());
		profBD.setCiudad(prof.getCiudad());
		profBD.setDireccion(prof.getDireccion());
		profBD.setTelefono(prof.getTelefono());
		profBD.setFechaNacimiento(prof.getFechaNacimiento());
		profBD.setSexo(prof.getSexo());
		profBD.setDepartamento(prof.getDepartamento());
		
		if (profService.addProfesor(profBD)==null) {
			return "redirect:/profesores/addProfesor?error=Existe&dpto="+prof.getNombre();
		}
		
		return "redirect:/profesores/";
	}
	
	@GetMapping("/addAsignatura")
	public String addAsignaturaGet(@RequestParam(required = false, name = "error") String error, Model model) {

		Profesor prof = new Profesor();
		
		List<Asignatura> asignaturas = asigService.getAllAsignatura();
		model.addAttribute("asignaturas", asignaturas);
		
		List<Profesor> profesores = profService.getAllProfesor();
		model.addAttribute("profesores", profesores);
		
		model.addAttribute("prof", prof);
		model.addAttribute("error", error);
		return "addAsignatura";
	}
	
	@PostMapping("/addAsignatura")
	public String addAsignaturaPost(@ModelAttribute Profesor prof,Model model) {
		
		Profesor profBD = new Profesor();
		
		profBD.setNif(prof.getNif());
		profBD.setNombre(prof.getNombre());
		profBD.setApellido1(prof.getApellido1());
		profBD.setApellido2(prof.getApellido2());
		profBD.setCiudad(prof.getCiudad());
		profBD.setDireccion(prof.getDireccion());
		profBD.setTelefono(prof.getTelefono());
		profBD.setFechaNacimiento(prof.getFechaNacimiento());
		profBD.setSexo(prof.getSexo());
		profBD.setDepartamento(prof.getDepartamento());
		
		if (profService.addProfesor(profBD)==null) {
			return "redirect:/profesores/addProfesor?error=Existe&dpto="+prof.getNombre();
		}
		
		return "redirect:/profesores/";
	}

}
