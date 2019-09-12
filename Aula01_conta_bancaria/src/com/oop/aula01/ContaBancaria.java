package com.oop.aula01;

public class ContaBancaria {

	// Atributos da Classe
	private String nome;
	private double saldo;

	// Métodos da Classe
	// Método construtor
	public ContaBancaria(String nome, double saldo) {
		this.nome = nome;
		if(saldo >= 0) {
			this.saldo = saldo;
		}else {
			this.saldo = 0.0;
		}
		
	}

	public void deposito(double depositoConta) {
		this.saldo = this.saldo + depositoConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

}
