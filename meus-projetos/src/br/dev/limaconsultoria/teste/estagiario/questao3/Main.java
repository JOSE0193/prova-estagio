package br.dev.limaconsultoria.teste.estagiario.questao3;

public class Main {

	public static void main(String[] args) {
		
		SingletonEnum login = SingletonEnum.INSTANCE;
		
		login.entrar("Usu�rio2");
		login.entrar("Usu�rio2");

	}

}
