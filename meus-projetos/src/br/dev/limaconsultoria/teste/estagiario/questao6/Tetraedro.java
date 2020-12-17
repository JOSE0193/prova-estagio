package br.dev.limaconsultoria.teste.estagiario.questao6;

public class Tetraedro extends FormaTridimensional {

	private double aresta;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularArea() {
		
		return (Math.sqrt(3) * Math.pow(aresta, 2));
	}

	@Override
	public double calcularVolume() {
		
		return (Math.sqrt(2) / 12)* Math.pow(aresta, 3);
	}
}
