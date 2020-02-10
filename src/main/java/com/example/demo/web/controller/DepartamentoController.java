package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.DepartamentoService;
import com.example.demo.web.domain.Departamento;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Departamento departamento) {
		return "/departamento/cadastro";
	}

	@GetMapping("/listar")
	public String Listar(ModelMap model) {
		model.addAttribute("departamentos",service.buscarTodos());
		return "departamento/lista";
		
	}
	
	@PostMapping("/salvar")
	public String salvar(Departamento departamento) {
		service.salvar(departamento);
		
		return "redirect:/departamentos/cadastrar";
		
	}
}

