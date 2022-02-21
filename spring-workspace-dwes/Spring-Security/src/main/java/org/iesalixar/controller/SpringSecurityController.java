package org.iesalixar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/customers")
	public String customers() {
		return "customers";
	}
	
	@GetMapping("employees")
	public String employees() {
		return "employees";
	}
}
