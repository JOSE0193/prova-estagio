package br.dev.limaconsultoria.teste.estagiario.questao2;

public class Main {
	
	public static void main(String[] args) {
		int mult = 400;
		int [] fim = new int[4200];
			
		for (int i = 0; i<= fim.length ; i++) {
			mult++;
			if (mult %3 ==0) {
				System.out.println(mult);
		
				}
			}
	}
}
