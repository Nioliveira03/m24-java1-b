package br.com.senaisp.bauru.nicoly.licao07;

public class TesteMultiplosArgumentos {

	public static void main(String[] args) {
		System.out.println("Soma de 2  valores: " + calcularSoma(10,20));
		System.out.println("Soma de 4 valores: " + calcularSoma(10,20,30,40));
	}
	public static int calcularSoma(int ... itens 	) {  //Pode ter varios parametros ou nao mas do mesmo tipo
	int ret =0;
	for (int v1 : itens) {
		ret+= v1;
	}
	return ret;
}
}
