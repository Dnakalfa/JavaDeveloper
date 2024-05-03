package interfaceGrafica;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuFrameEventos extends JFrame implements ActionListener{
	
	public MeuFrameEventos() {
		super ("Meus Eventos");
		 
		JButton botao = new JButton("Clique Aqui");
		botao.addActionListener(this);
		
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MeuFrameEventos();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Voçê Clicou!!");
	}

}
