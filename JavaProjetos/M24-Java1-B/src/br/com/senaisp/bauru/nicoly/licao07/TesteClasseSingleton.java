package br.com.senaisp.bauru.nicoly.licao07;

public class TesteClasseSingleton {

	public static void main(String[] args) {
		ClasseSingleton obj01 = ClasseSingleton.getInstancia();
		ClasseSingleton obj02 = ClasseSingleton.getInstancia();
		//Alterando os dados
		System.out.println(obj01);
		System.out.println(obj02);
		//
		obj01.setNome("Roderval");
		System.out.println(obj02.getNome());
	}

}
