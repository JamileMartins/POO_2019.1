package com.opp.aula01;

public class AlunoTest {

	public static void main(String[] args) {
		// Dois objetos Aluno s�o criados
		Aluno aluno1 = new Aluno("Maria Carolina");
		Aluno aluno2 = new Aluno("Enzo Gabriel");
		
		// Impress�o dos nomes
		System.out.println("Alunos criados:");
		System.out.println(aluno1.getNome());
		System.out.println(aluno2.getNome());
		
		// Altera��o nos Nomes
		aluno1.setNome("Maria Carolina da Silva");
		aluno2.setNome("Enzo Rafael");
		
		// Reimpress�o dos nomes
		System.out.println("\n\nAlunos:");
		System.out.println(aluno1.getNome());
		System.out.println(aluno2.getNome());
	}

}
