package com.oop.aula02;

import java.util.Scanner;

public class Pratica01 {

	public static int fatorial(int n) {
		int aux = 1;
		for (int i = 1; i <= n ; i++) {
			aux = aux * i;
			// System.out.println("Aux:"+aux);
			// System.out.println("i:"+i);
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Função Fatorial\nDigite um número:");
		int n = ler.nextInt();
		System.out.println(fatorial(n));
		
		ler.close();
	}

}
