package br.com.treinaweb.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.treinaweb.java.eventos.JTextFieldEvento;

public class Programa {


	
	
	
	public static void main(String[] args) {

		JFrame frame = new JFrame(); 
		frame.setSize(400, 130);
		frame.setLocation(100, 300);
		frame.setTitle("Exemplo de Utilização do Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel("Texto:");
		label.setBounds(10, 10, 60, 20);
		panel.add(label); //adcionar o lbl no painel
		
		
		JTextField campo = new JTextField();
		campo.setBounds(70, 10, 200, 20);//setar tamanho
		JTextFieldEvento evento = new JTextFieldEvento();
		campo.addKeyListener(evento); //ASSIM NUMEROS NÃO FUNCIONAM
		panel.add(campo);
		
		JButton botao = new JButton("Processar");
		botao.setBounds(280, 10, 95, 20);
		//BotaoProcessarEventoClique evento = new BotaoProcessarEventoClique(campo);
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Você digitou: " + campo.getText());
			}
		});
		panel.add(botao);
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
