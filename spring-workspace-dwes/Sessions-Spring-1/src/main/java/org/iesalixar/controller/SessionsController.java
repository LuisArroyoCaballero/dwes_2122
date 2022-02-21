package org.iesalixar.controller;

import javax.servlet.http.HttpSession;

import org.iesalixar.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionsController {

	@GetMapping("/")
	public String indexGet(Model model) {

		UserDTO user = new UserDTO();
		model.addAttribute("user", user);

		return "index";

	}

	@PostMapping("/")
	public String indexPost(@ModelAttribute UserDTO user, Model model, HttpSession session) {

		if (user.getUserName().equals("usuario") && user.getUserPassword().equals("usuario")) {

			session.setAttribute("role", "usuario");
			return "redirect:/home/user";

		} else if (user.getUserName().equals("admin") && user.getUserPassword().equals("admin")) {

			session.setAttribute("role", "admin");
			return "redirect:/home/admin";
		}

		return "redirect:/";

	}

	@GetMapping("/home/user")
	public String homeUser(Model model, HttpSession session) {
		
		if (session.isNew() || !session.getAttribute("role").equals("usuario")) {
			session.invalidate();
			return "redirect:/";
		}
		return "user";

	}

	@GetMapping("/home/admin")
	public String homeAdmin(Model model, HttpSession session) {
		
		if (session.isNew() || !session.getAttribute("role").equals("admin")) {
			session.invalidate();
			return "redirect:/";
		}
		return "admin";

	}
	
	@GetMapping("/logout")
	public String logout(Model model, HttpSession session) {
		
		session.invalidate();
		return "redirect:/";
		
	}
	
	@GetMapping("/imageZone")
	public String imagenZone(Model model, HttpSession session) {
		
		if (session.isNew() || (!session.getAttribute("role").equals("admin") && !session.getAttribute("role").equals("usuario"))) {
			session.invalidate();
			return "redirect:/";
		}
		
		return "imagen";
		
	}
}
