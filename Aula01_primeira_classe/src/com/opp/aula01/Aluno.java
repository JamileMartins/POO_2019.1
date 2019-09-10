package com.opp.aula01;

public class Aluno {
	
	private String nome;	// Atributo da classe Aluno
	
	Aluno(String n){		// Método construtor da classe Aluno
		this.nome = n;
	}
	
	String getNome() {		// Método acessor de leitura
		return this.nome;
	}
	
	void setNome(String n) {	// Método acessor de configuração
		this.nome = n;
	}

}
