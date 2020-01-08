package com.example.demo.web.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
	
	@Column(nullable= false, unique = true)
	private String nome;
	
	@Column(name="salario" ,nullable=false , columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name="dt_entrada" , nullable = false , columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@Column(name="dt_saida" , nullable = true , columnDefinition = "DATE")
	private LocalDate dataSaida;
	
	/*
	private Endereco endereco;
	
	private Cargo cargo;
	
	*/
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
/*
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	*/
	
	
	
	

}
