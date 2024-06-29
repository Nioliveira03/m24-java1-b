package br.com.senaisp.bauru.nicoly.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		Baralho ba = new Baralho();
		Carta ct = ba.sortearCarta();
		System.out.println(ct.toString());
	}

}
