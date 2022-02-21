package org.iesalixar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityEjemploController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}
