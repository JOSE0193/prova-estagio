package br.dev.limaconsultoria.teste.estagiario.questao6;

public class Circulo extends FormaBidimensional{

	private int raio;

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		
		return Math.PI * Math.pow(raio, 2);
	}
}
