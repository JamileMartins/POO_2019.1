package com.ifce.oop;

public class SequenciasMatematicas {

	public static int questao1_fatorial(int n) {
		int aux = 1;
		for(int i = 1; i <= n; i++) {
			aux = aux * i;
		}
		return aux;
	}
	
	public static float questao2_harmonica(int n) {
		float aux = 0.0f;
		for(int j = 1; j<=n; j++) {
			aux = aux + (float)1/j;
		}
		return aux;
	}
	
	public static void questao3(int n) {
		int aux = n;
		while(aux != 1) {
			if(aux % 2 ==0) {
				aux = aux/2;
			}else {
				aux = aux*3 + 1;
			}
			System.out.print(aux + "-> ");
		}
		System.out.println("");
	}
	
	public static void questao4(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i;j++) {
				double aux = Math.pow((double)i, (double)j);
				System.out.print((int)aux+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		int n = 6;
		System.out.println("Questão 1 ************************");
		System.out.println("Fatorial:"  + questao1_fatorial(n));
		System.out.println("Questão 2 ************************");
		System.out.println("Harmônica:"  + questao2_harmonica(n));
		System.out.println("Questão 3 ************************");
		questao3(13);
		System.out.println("Questão 4 ************************");
		questao4(5);
	}

}
