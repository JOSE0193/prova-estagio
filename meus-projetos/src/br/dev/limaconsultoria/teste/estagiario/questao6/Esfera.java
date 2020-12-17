package br.dev.limaconsultoria.teste.estagiario.questao6;

public class Esfera extends FormaTridimensional {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		
		return (4 * Math.PI) * Math.pow(raio, 2);
	}

	@Override
	public double calcularVolume() {
		
		return (4 * Math.PI * Math.pow(raio, 2)) / 3 ;
	}
	
}
