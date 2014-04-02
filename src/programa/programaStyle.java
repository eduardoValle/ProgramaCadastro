package programa;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class programaStyle extends JFrame{
	
	JTextField     login;
	JPasswordField senha;
	JLabel menuLista;
	JButton clientes, produtos, venda, funcionarios;
	
	public programaStyle()	{
		
		// Style janela
		
		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setLocation(200, 40);
		setSize(900, 600);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar
		
		//  Style Campos
		
		JLabel menLista = new JLabel();
		menLista.setText("Aqui vão os menus listas do programa");
		menLista.setBackground(Color.darkGray);
		menLista.setBounds(0, 0, 900, 25);
		
		JButton clientes = new JButton();
		clientes.setText("Clientes");
		clientes.setBounds(0, 30, 60, 60);
		
		JButton produtos = new JButton();
		produtos.setText("Produtos");
		produtos.setBounds(61, 30, 60, 60);
		
		JButton funcionarios = new JButton();
		funcionarios.setText("Funcionários");
		funcionarios.setBounds(122, 30, 60, 60);
		
		JButton venda = new JButton();
		venda.setText("Venda");
		venda.setBounds(183, 30, 60, 60);
		
		
		
		// Colocando os Campos visíveis
		
		getContentPane().add(menLista);
		getContentPane().add(clientes);
		getContentPane().add(produtos);
		getContentPane().add(funcionarios);
		getContentPane().add(venda);
	}
	
	
	public static void main(String arg[]){ 
		new programaStyle().setVisible(true);
	}
}