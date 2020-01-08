package com.example.demo.service;

import java.util.List;

import com.example.demo.web.domain.Funcionario;

public interface FuncionarioService {
	
void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	 Funcionario buscarPorID (Long Id);
	
	 List<Funcionario> buscarTodos();

}
