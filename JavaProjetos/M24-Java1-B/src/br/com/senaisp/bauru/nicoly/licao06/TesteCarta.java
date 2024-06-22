package br.com.senaisp.bauru.nicoly.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		Carta ct;
		try {
			ct = new Carta(4, 9);
			System.out.println(ct.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
