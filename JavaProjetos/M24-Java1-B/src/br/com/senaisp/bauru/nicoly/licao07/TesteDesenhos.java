package br.com.senaisp.bauru.nicoly.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteDesenhos {

	public static void main(String[] args) {
		//Criando a janela 
		JOptionPane janela = new JOptionPane();
		JDialog dlg = janela.createDialog("Desenhos");
		dlg.setSize(800, 600);
		DesenhoSwing desenho = new DesenhoSwing();
		dlg.setContentPane(desenho);
		dlg.setVisible(true);

	}

}
