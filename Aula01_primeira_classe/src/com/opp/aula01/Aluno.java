package com.opp.aula01;

public class Aluno {
	
	private String nome;	// Atributo da classe Aluno
	
	Aluno(String n){		// M�todo construtor da classe Aluno
		this.nome = n;
	}
	
	String getNome() {		// M�todo acessor de leitura
		return this.nome;
	}
	
	void setNome(String n) {	// M�todo acessor de configura��o
		this.nome = n;
	}

}
