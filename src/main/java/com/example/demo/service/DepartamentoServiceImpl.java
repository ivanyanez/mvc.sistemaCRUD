package com.example.demo.service;


import com.example.demo.dao.DepartamentoDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.web.domain.Departamento;

@Service @Transactional(readOnly=false)
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoDao departamentodao;
	

@Override
public void salvar(Departamento departamento) {
    	departamentodao.save(departamento);
}

@Override
public void editar(Departamento departamento) {
	departamentodao.update(departamento);
}

@Override
public void excluir(Long id) {
		departamentodao.delete(id);
}

@Override @Transactional(readOnly=true)
public Departamento buscarPorID(Long Id) {
	return departamentodao.findById(Id);
}

@Override @Transactional(readOnly=true)
public List<Departamento> buscarTodos() {
	
	return departamentodao.findAll();
}

}
