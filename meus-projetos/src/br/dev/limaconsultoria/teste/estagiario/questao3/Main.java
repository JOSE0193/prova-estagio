package br.dev.limaconsultoria.teste.estagiario.questao3;

public class Main {

	public static void main(String[] args) {
		
		SingletonEnum login = SingletonEnum.INSTANCE;
		
		login.entrar("Usuário2");
		login.entrar("Usuário2");

	}

}
