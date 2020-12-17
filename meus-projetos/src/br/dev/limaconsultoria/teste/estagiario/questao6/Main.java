package br.dev.limaconsultoria.teste.estagiario.questao6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Escolha uma forma: ");
		System.out.println("1 = Triângulo ");
		System.out.println("2 = Quadrado ");
		System.out.println("3 = Circulo ");
		System.out.println("4 = Cubo ");
		System.out.println("5 = Tetraedro ");
		System.out.println("6 = Esfera ");
		
		System.out.println();
		
		System.out.println("Forma: ");
		int forma = scan.nextInt();
		
		switch (forma) {
		
		case 1: 	
			System.out.println("Entre com o valor da base e da altura: ");
			Triangulo f1 = new Triangulo();
			System.out.print("Base: ");
			f1.setBase(scan.nextInt());
			System.out.print("Altura: ");
			f1.setAltura(scan.nextInt());
			System.out.println("A área do triângulo: " + f1.calcularArea());
			break;
			
		case 2: 	
			System.out.println("Entre com o valor da aresta 1 e 2:  ");
			Quadrado f2 = new Quadrado();
			System.out.print("Aresta 1:  ");
			f2.setLado1(scan.nextInt());
			System.out.print("Aresta 2:  ");
			f2.setLado2(scan.nextInt());
			System.out.println("A área do quadrado : " + f2.calcularArea());
			break;
			
		case 3: 	
			System.out.println("Entre com o valor da raio: ");
			Circulo f3 = new Circulo();
			System.out.print("Raio:  ");
			f3.setRaio(scan.nextInt());
			System.out.println("A área do circulo: " + f3.calcularArea());
			break;
			
		case 4: 	
			System.out.println("Entre com a aresta ");
			Cubo f4 = new Cubo();
			System.out.print("Aresta:   ");
			f4.setAresta(scan.nextInt());
			System.out.println("A área do cubo : " + f4.calcularArea());
			System.out.println("O volume do cubo: " + f4.calcularVolume());
			break;
			
		case 5: 	
			System.out.println("Entre com a aresta ");
			Tetraedro f5 = new Tetraedro();
			System.out.print("Aresta:   ");
			f5.setAresta(scan.nextInt());
			System.out.println("A área do Tetraedro : " + f5.calcularArea());
			System.out.println("O volume do Tetraedro: " + f5.calcularVolume());
			
			break;
			
		case 6: 	
			System.out.println("Entre com o raio:  ");
			Esfera f6 = new Esfera();
			System.out.print("Raio:   ");
			f6.setRaio(scan.nextDouble());
			System.out.println("A área do Esfera : " + f6.calcularArea());
			System.out.println("O volume do Esfera: " + f6.calcularVolume());
			
			break;
			
			default:
			break;
		}
		
		
		
	

	}

}
