package br.com.treinaweb.java.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoProcessarEventoClique implements ActionListener {

	private JTextField textFeild;
	
	public BotaoProcessarEventoClique(JTextField textField) {
		this.textFeild = textField;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Você Digitou:" + textFeild.getText());
		
	}
	
}
