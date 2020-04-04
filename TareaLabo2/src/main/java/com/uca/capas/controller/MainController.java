package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;


@Controller
public class MainController {
	@GetMapping("/login")
	public String enviarForm(User user) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(User user) {
		if(user.getUsername().equals("admin") && user.getPassword().equals("root")) {
			return "mostrarMensajeV";
		}else {
			return "mostrarMensajeF";
		}
		
	}

}
