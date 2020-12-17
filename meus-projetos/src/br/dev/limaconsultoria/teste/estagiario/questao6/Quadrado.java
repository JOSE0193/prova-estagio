package br.dev.limaconsultoria.teste.estagiario.questao6;

public class Quadrado extends FormaBidimensional {

	
	private int lado1;
	private int lado2;
	

	public int getlado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado1() {
		return lado1;
	}

	@Override
	public double calcularArea() {
		
		return lado1 * lado2 ;
	}
	

	
}

