package br.com.senaisp.bauru.nicoly.licao01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//Solicitar a entrada via teclado pelo usuario
		System.out.println("Digíte a quantidade de galões: ");
		galoes = sc.nextDouble();
		sc.close();
		//Fazendo as contas 
		litros = galoes * gal2lt;
		//resultado
		System.out.println(galoes + " galões equvalem a " + litros+ "litros");
		
		
		
		
		
		
		
		
	}

}
