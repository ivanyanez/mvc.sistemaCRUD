package com.example.demo.service;


import com.example.demo.dao.DepartamentoDaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.web.domain.Departamento;

@Service @Transactional(readOnly=false)
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoDaoImpl departamentodaoImpl;
	

@Override
public void salvar(Departamento departamento) {
    	departamentodaoImpl.save(departamento);
}


@Override
public void editar(Departamento departamento) {
	departamentodaoImpl.update(departamento);
}

@Override
public void excluir(Long id) {
		departamentodaoImpl.delete(id);
}

@Override @Transactional(readOnly=true)
public Departamento buscarPorID(Long Id) {
	return departamentodaoImpl.findById(Id);
}

@Override @Transactional(readOnly=true)
public List<Departamento> buscarTodos() {
	
	return departamentodaoImpl.findAll();
}

}
