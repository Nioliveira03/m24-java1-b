package br.com.senaisp.bauru.nicoly.licao07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhoSwing extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		//Seteando a cor de prenencimento do desenho
		g.setColor(Color.BLUE);
		//Desenhando um quadrado na posicao x=50, y = 50
		g.fillRect(50, 50, 150, 150);
		//Circulo
		g.setColor(Color.GREEN);
		g.fillOval(300, 50, 150, 150);
		//Tringulo
		g.setColor(Color.RED);
		;
		int [] xpontos = {600,525,675};
		int [] ypontos = {50, 200, 200};
		g.fillPolygon(xpontos, ypontos, 3);
	}
}
