package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.CargoDao;
import com.example.demo.web.domain.Cargo;

public class CargoServiceImpl implements CargoService {


	@Autowired
	private CargoDao cargodao;
	
	
	@Override
	public void salvar(Cargo cargo) {
		cargodao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		cargodao.update(cargo);		
	}

	@Override
	public void excluir(Long id) {
		cargodao.delete(id);
		
	}

	@Override
	public Cargo buscarPorID(Long Id) {
		
		return cargodao.findById(Id);
	}

	@Override
	public List<Cargo> buscarTodos() {
		
		return cargodao.findAll();
	}

}
