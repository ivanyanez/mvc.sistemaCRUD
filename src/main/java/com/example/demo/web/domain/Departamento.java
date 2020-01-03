package com.example.demo.web.domain;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class Departamento extends AbstractEntity<Long> {
	
	
	
	@Column(name="nome" , nullable = false, unique = true , length = 60)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	
}
