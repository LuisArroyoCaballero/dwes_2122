package org.iesalixar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CompanyController {
	@RequestMapping("/")
	public String index(Model model) {
		
		model.addAttribute("company", "INICIO");
		
		return "index";
	}
	
	@RequestMapping("/servicios")
	public String servicios(
			@RequestParam(name = "name", required = false, defaultValue="Nombre Servicios")String name,
			@RequestParam(name = "brand", required = false, defaultValue = "Marca Servicios")String brand,
			@RequestParam(name = "category", required = false, defaultValue = "Categoria Servicios")String category,
			Model model) {
		
		model.addAttribute("company", "SERVICIOS");
		model.addAttribute("name", name);
		model.addAttribute("brand", brand);
		model.addAttribute("category", category);
		
		return "servicios";
	}
	@RequestMapping("/productos")
	public String productos(
			@RequestParam(name = "name", required = false, defaultValue="Nombre Producto")String name,
			@RequestParam(name = "brand", required = false, defaultValue = "Marca Producto")String brand,
			@RequestParam(name = "category", required = false, defaultValue = "Categoria Producto")String category,
			Model model) {
		
		model.addAttribute("company", "PRODUCTOS");
		model.addAttribute("name", name);
		model.addAttribute("brand", brand);
		model.addAttribute("category", category);
		
		return "productos";
	}
	@RequestMapping("/sobreNosotros")
	public String sobreNosotros(
			@RequestParam(name = "name", required = false, defaultValue="Nombre About")String name,
			@RequestParam(name = "brand", required = false, defaultValue = "Marca About")String brand,
			@RequestParam(name = "category", required = false, defaultValue = "Categoria About")String category,
			Model model) {
		
		model.addAttribute("company", "SOBRE NOSOTROS");
		model.addAttribute("name", name);
		model.addAttribute("brand", brand);
		model.addAttribute("category", category);
		
		return "sobreNosotros";
	}
}
