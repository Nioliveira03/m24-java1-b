package br.com.senaisp.bauru.nicoly.licao07;

public class Cachorro extends Mamifero {
	//campos/fields
	private boolean quadrupede;
	//constructor
	//getters setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//metodos
	public void falar() {
		System.out.println("Au au au!");
	}
	@Override
	public String toString() {
		
		return super.toString() + "Quadrupede: " + quadrupede + "\n";
	}
}
