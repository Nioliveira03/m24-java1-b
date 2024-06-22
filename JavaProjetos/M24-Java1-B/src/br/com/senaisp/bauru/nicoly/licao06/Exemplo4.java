package br.com.senaisp.bauru.nicoly.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo4 {
 public static void main (String[] args) {
	 
	  Scanner sc = new Scanner (System.in);
	 try {
		
	 System.out.println("Digite um valor: ");
	 int vl01 = sc.nextInt();
	 System.out.println("Digite um valor: ");
	 int vl02 = sc.nextInt();
		int vl03 = vl01/vl02;
		 System.out.println("Resultando: " +vl03);
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("Ocorreu uma " + "divisão por zero!");
	}  catch (InputMismatchException e) {
		System.out.println("Digitar somente" + "números inteiros!");
	}
	 sc.close();
 }
}