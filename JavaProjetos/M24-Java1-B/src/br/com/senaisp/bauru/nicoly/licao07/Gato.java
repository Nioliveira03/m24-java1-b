package br.com.senaisp.bauru.nicoly.licao07;

public class Gato extends Mamifero {

	private boolean quadrupede;

	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//metodos
	@Override
	public void falar() {
		System.out.println("Miau Miau");
	}
	
}
