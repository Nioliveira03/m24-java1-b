package br.com.senaisp.bauru.nicoly.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		// TODO Terminar o código
		//Criando um estudante
		Estudante est01 = new Estudante();
		est01.setNome("Nicoly");
		est01.setId(1);
		est01.setMedia(5.5f);
		
	//Monstrando o valor
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: " + est01.getDocumento());
		//Obtendo o objeto como representação textual
		System.out.println(est01.toString());
		
		//Criando um novo estudante
		Estudante est02 = new Estudante(2, "Alicia", "881639600", 9.6f, 1700.00, true);
		System.out.println(est02.toString());

	
	
	
	
	}
}
