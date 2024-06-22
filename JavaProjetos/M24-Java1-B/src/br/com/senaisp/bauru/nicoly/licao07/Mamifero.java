package br.com.senaisp.bauru.nicoly.licao07;

public abstract class Mamifero {
	//campos ou variaveis de instancias ou fields 
	private String nome;
	private String cor;
	private int idade;//constructor
			
			
			
	//getters setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodos
	public void falar() {
		System.out.println("Mamifero falando");
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Idade" + idade + "\n";
	}
}
