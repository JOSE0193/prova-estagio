package br.dev.limaconsultoria.teste.estagiario.questao5;

import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) {
		
	ArrayList<Integer> lista = new ArrayList<>(); 

	
	for (int i = 1; i<=1000 ; i++) {
		lista.add(i); 

		lista.sort((a, b) -> b.compareTo(a));
		
	}
	
	
	System.out.println(lista.toString() );

	}

}
