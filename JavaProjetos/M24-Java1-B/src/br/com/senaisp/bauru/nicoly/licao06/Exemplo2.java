package br.com.senaisp.bauru.nicoly.licao06;
import java.util.Scanner;

public class Exemplo2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[][] cinema = new String[10][10];
	//inicializando o cinema
	for(int i=0;i<cinema.length;i++) { //fileiras
		for (int j=0;j<cinema[i].length;j++) {//poltrona
			cinema[i][j] = "-";
		}
	}
	//Comprando os ingressos
	String term;
	mostrarPoltronas(cinema);
	do {
		System.out.println("Qual fileira vc deseja?");
		int fl = sc.nextInt();
		System.out.println("Qual a poltrona vc deseja?");
		int po = sc.nextInt();
		//Verificando se está disponível
		try {
			if (cinema[fl-1][po-1].equals("-")) {
				cinema[fl-1][po-1] = "X";
			} else {
				System.out.println("Não disponível!");
			}
		} catch (Exception e) {
			System.out.println("Valor digitado é inválido!");
		}
		//Mostrando as poltronas como ficou
		mostrarPoltronas(cinema);
		System.out.println("Deseja continuar(S/N)?");
		sc.nextLine();//remover o enter
		term = sc.nextLine();
	} while(!term.equalsIgnoreCase("N"));
	sc.close();
}

private static void mostrarPoltronas(String[][] cinema) {
	for(int i=0;i<cinema.length;i++) { //fileiras
		System.out.print("FL "+ (i<9 ? " ": "") + 
								(i+1)+ " ");
		for (int j=0;j<cinema[i].length;j++) {//poltrona
			System.out.print(cinema[i][j] + " ");
		}
		System.out.println();
	}
}
}

	

