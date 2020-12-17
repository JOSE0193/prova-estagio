package br.dev.limaconsultoria.teste.estagiario.questao3;

import java.util.ArrayList;

public enum SingletonEnum {
	
	INSTANCE;


	ArrayList <String> singleton = new ArrayList<>();



	SingletonEnum () {
		this.singleton = new ArrayList();
		singleton.add("Usu�rio1");
		singleton.add("Usu�rio2");
		singleton.add("Usu�rio3");
		singleton.add("Usu�rio4");
		
	}
	

		
	

	public boolean usuarioLogado (String usuario) {
		
	return 	singleton.remove(usuario);
	
	}

	public static void entrar(String usuario) {
		SingletonEnum entrar = SingletonEnum.INSTANCE;
		System.out.println(entrar.usuarioLogado(usuario));
	}
	
	
	

}
