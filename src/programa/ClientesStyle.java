package programa;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class ClientesStyle extends JFrame{
	

	public ClientesStyle(){
		
		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setBounds(200, 40, 900, 540);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar

		Color corFundo  = new Color(112, 128, 144);
		
		JPanel clientes = new JPanel();
		clientes.setBounds(5, 5, 880, 495);
		clientes.setBackground(corFundo);         			   // descomente a cor para ver a onde está o JPanel
		clientes.setLayout(null);
		
		getContentPane().add(clientes);
		
		Color corCampo = new Color(255, 255, 255);
		
		JPanel clientesCampo = new JPanel();
		clientesCampo.setBounds(0, 0, 880, 70);
		clientesCampo.setBackground(corCampo);         			   // descomente a cor para ver a onde está o JPanel
		clientesCampo.setLayout(null);
		
		clientes.add(clientesCampo);
		
		JLabel nome = new JLabel();
		
		nome.setBackground(corFundo);
		nome.setBounds(0, 0, 880, 30);
		nome.setText("Luiz Eduardo");

		
		clientesCampo.add(nome);
		
	}
	
	public static void main(String arg[]){ 

		new ClientesStyle().setVisible(true);
		
	}
}
