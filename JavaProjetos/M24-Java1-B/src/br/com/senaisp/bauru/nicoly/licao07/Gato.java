package br.com.senaisp.bauru.nicoly.licao07;

public class Gato extends Mamifero {

	private boolean quadrupede;
	//Constructor com parametro (tipo, String)
	public Gato(String nome) {
		setNome(nome);
	}
	//Constructor com diferente quantidade de parametro, diferente do que está cima
	public Gato (int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
	//Constructor em parametro
	public Gato() {
		setIdade(0);
		setNome("Gato sem nome");
		setCor("Gato sem cor");
	}
	
	//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	@Override
	public void falar() {
		System.out.println("Miau Miau");
	}
	
}
