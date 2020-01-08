package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.FuncionarioDao;
import com.example.demo.web.domain.Funcionario;

public class FuncionarioServiceImpl implements FuncionarioService {

	
	@Autowired
	private FuncionarioDao funcionariodao;
	
	@Override
	public void salvar(Funcionario funcionario) {
		funcionariodao.save(funcionario);
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		funcionariodao.update(funcionario);
	}

	@Override
	public void excluir(Long id) {
		funcionariodao.delete(id);		
	}

	@Override
	public Funcionario buscarPorID(Long Id) {
		
		return funcionariodao.findById(Id);
	}

	@Override
	public List<Funcionario> buscarTodos() {

		return funcionariodao.findAll();
	}

}
