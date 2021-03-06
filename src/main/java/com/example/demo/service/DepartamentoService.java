package com.example.demo.service;

import java.util.List;

import com.example.demo.web.domain.Departamento;

public interface DepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	 Departamento buscarPorID (Long Id);
	
	 List<Departamento> buscarTodos();


	boolean departamentoTemCargos(Long id);
			
		}
