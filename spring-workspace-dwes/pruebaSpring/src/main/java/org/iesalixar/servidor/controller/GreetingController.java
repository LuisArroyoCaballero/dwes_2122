package org.iesalixar.servidor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users/")
public class GreetingController {
	@GetMapping("/greetings")
	public String greetings(@RequestParam(name = "name", required = false, defaultValue = "World")String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "greetings";
	}

	@GetMapping("/bye")
	public String bye(@RequestParam(name = "name", required = false, defaultValue = "World")String name, Model model) {
		
		model.addAttribute("name", name);
		
		return "bye";
	}
}
