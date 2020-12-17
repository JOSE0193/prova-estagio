package br.dev.limaconsultoria.teste.estagiario.questao4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {


	public static void main(String[] args) {


		ArrayList<Integer> lista = new ArrayList<>(); 


		for (int i = 1; i<=1000 ; i++) {
			lista.add(i); 
		

		Collections.sort(lista , new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int lista1 = o2.compareTo(o1);

				return lista1;
			} 
		});
		}
		System.out.println(lista);



	}	
}
