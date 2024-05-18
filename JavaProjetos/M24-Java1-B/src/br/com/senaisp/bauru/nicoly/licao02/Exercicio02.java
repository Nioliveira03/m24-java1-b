package br.com.senaisp.bauru.nicoly.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		//Mostrando a mensagem para o usuário
		System.out.println("Digíte seu nome completo: ");
		nome = sc.nextLine(); 
		//Vamos separar nome de sobrenome
		String primNome = nome.substring(0, (nome+ " ").indexOf(" "));
		//Pegar o ultimo sobrenome
		String lastName = nome.substring(nome.lastIndexOf(" ")+1);
		//Mostrando o nome
		System.out.println(primNome);
		System.out.println(lastName);
		//fechando scanner
		sc.close();
		

	}

}
