package interfaceGrafica;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;



public class MeuFrame extends JFrame {
	
	public MeuFrame() {
		
		super("Minha Janela");
		 
		Container c = getContentPane();
		
		c.add(BorderLayout.NORTH, new JButton ("Botão Superior"));
		c.add(BorderLayout.SOUTH, new JButton ("Botão Inferior"));
		c.add(BorderLayout.CENTER, new JButton ("Botão CENTRAL"));
		c.add(BorderLayout.EAST, new JButton ("Botão Direito"));
		c.add(BorderLayout.WEST, new JButton ("Botão Esquerdo"));
		
		//getContentPane().add(new JButton("Botão GERAL"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MeuFrame();
	}

}
