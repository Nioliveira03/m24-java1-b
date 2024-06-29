package br.com.senaisp.bauru.nicoly.licao07;

public class ShapeJava {
	protected double altura;
	private double largura;
	//COnstructor
	public ShapeJava(double alt, double larg) {
		altura = alt;
		largura = larg;
		String cor; //Default (Um private quase protected, acessa como privado e acessa o pacote como o protected)
	}
	//Getters e setters
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	//Classde dentro de outra class
	public class apoio{
		public void chamarApoio() {
			ShapeJava sp2 = new ShapeJava (2,2);
			sp2.altura = 10;
		}
	}
	//Metodo estatico d e cdriacao do objeto
	public static ShapeJava getInstancia(double v1, double v2) {
		ShapeJava ret = new ShapeJava(1 , v2);
		ret.altura = 15;
		return ret;
	}
	
}
