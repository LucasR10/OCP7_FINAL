package br.com.ocjp7.theads.contador;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Relogio {

	static JFrame  frame = new JFrame("Relogio");
	static JLabel label ;
	 public static void main(String[] args) {
	   
		   JFrame frame = new JFrame("JFrame Example");

			JPanel panel = new JPanel();
			FlowLayout l = new FlowLayout();
			panel.setLayout( l );
			
			

			 label = new JLabel("Tempo  :" );
			
           
			JTextField tempoDigitadoPeloUsuario = new JTextField();
            tempoDigitadoPeloUsuario.setSize(40, 20);
            
			JButton button = new JButton();
			button.setText("Press me");
            
			button.addActionListener( new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ContadorMinutos c = new ContadorMinutos(4);
					Thread th = new Thread(c);
					th.start();
					
					label = new JLabel("Tempo  :" + c.getTempoAcumulado() );
				}
			});
            
			panel.add(label);
			panel.add(tempoDigitadoPeloUsuario);
			panel.add(button);

			frame.add(panel);
			frame.setSize(400, 500);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			


	}
	
}
