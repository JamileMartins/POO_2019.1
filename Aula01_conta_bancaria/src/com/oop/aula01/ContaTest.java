package com.oop.aula01;

public class ContaTest {

	
	public static void main(String[] args) {
		System.out.println("Exercício Conta Bancária");

		ContaBancaria contaCorrente = new ContaBancaria("Maria da Silva", 100);
		System.out.println("Nome:" + contaCorrente.getNome());
		System.out.println("Saldo da conta corrente:");
		System.out.println(contaCorrente.getSaldo());
		
		contaCorrente.deposito(-23.54);
		System.out.println("Retirada de valores:" + contaCorrente.getSaldo());
		
		contaCorrente.deposito(1200);
		System.out.println("Depósito de valores:"+ contaCorrente.getSaldo());
		
		contaCorrente.deposito(-1500);
		System.out.println("Retirada de valores:" + contaCorrente.getSaldo());
		
		contaCorrente.setNome("Maria da Silva de Oliveira");
		System.out.println("Nome alterado:" + contaCorrente.getNome());
	}

}
