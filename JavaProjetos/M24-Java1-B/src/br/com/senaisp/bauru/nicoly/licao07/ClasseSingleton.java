package br.com.senaisp.bauru.nicoly.licao07;

public class ClasseSingleton {
	private static ClasseSingleton instancia = null;
	private static int nSegInstancia = 0;
	private int id;
	private String nome;
	
	//Constructor suprido (invisivel)
	private ClasseSingleton() {
		id = ++nSegInstancia;
		nome = null;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	//Metodos
	public static ClasseSingleton getInstancia() {
		if (instancia == null) {
			instancia = new ClasseSingleton();
		}
	return instancia;
	} 
	
}
