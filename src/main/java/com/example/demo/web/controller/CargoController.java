package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CargoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	
	@GetMapping("/cadastrar")
	public String cadastrar(){
		 return "/cargo/cadastro";
		
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/cargo/lista";
		
	}
	
	
	public String salvar() {
		return null;
	
	}
}
