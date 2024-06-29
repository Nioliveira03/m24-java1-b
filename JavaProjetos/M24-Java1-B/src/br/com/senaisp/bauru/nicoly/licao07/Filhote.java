package br.com.senaisp.bauru.nicoly.licao07;

public class Filhote {
	private static int nSeg =0;
	private int id;
	private String nome;
	//Constructor
	public Filhote(String nome) {
		id = ++nSeg;
		this.nome = nome;
		}
	//getters e setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	
}	
