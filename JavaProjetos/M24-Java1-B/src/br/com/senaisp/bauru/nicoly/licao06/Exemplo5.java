package br.com.senaisp.bauru.nicoly.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo5 {
 public static void main (String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int vlr01, vlr02;
	 //Garantindo a entrada do primeiro valor
	 do {
		 System.out.println("Digite o"+ " primeiro valor:");
		 try {
			vlr01 = sc.nextInt();
		} catch (InputMismatchException e) {
			
			System.out.println("Valor deve " +"ser inteiro!");
			sc.nextLine();//captura do enter
			vlr01 = 0;
		}	
		 }while(vlr01 <= 0);
 }
}
