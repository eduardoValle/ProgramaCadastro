package programa;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClienteStyle extends JFrame{
	
	JPanel fundo, opcoes;
	
	public ClienteStyle(){
	
		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setBounds(0, 0, 1350, 540);									                                           
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	
		fundo = new JPanel();
		fundo.setBounds(0, 66, 1400, 540);
		fundo.setBackground(new Color(112, 128, 144)); 		
		getContentPane().add(fundo);
	
		
		
		opcoes= new JPanel();
		opcoes.setBounds(0, 166, 1400, 240);
		opcoes.setBackground(new Color(22, 28, 34)); 		
		fundo.add(opcoes);
	}

}
