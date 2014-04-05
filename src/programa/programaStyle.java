package programa;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class programaStyle extends JFrame{
	
	JTextField     login;
	JPasswordField senha;
	JButton clientes, produtos, venda, funcionarios;
	
	
	public programaStyle()	{
		
		
		new menuListaStyle();
		
		/************************
	          Style JANELA
	    ************************/

		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setLocation(200, 40);
		setSize(900, 600);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar

		//  Style Campos
		
		
		JButton venda = new JButton();
		venda.setText("Venda");
		venda.setToolTipText("Venda");
		venda.setBounds(0, 0, 60, 60);
		
		JButton clientes = new JButton();
		clientes.setText("Clientes");
		clientes.setToolTipText("Clientes");
		clientes.setBounds(61, 0, 60, 60);
		
		JButton produtos = new JButton();
		produtos.setText("Produtos");
		produtos.setToolTipText("Produtos");
		produtos.setBounds(122, 0, 60, 60);
		
		JButton funcionarios = new JButton();
		funcionarios.setText("Funcionários");
		funcionarios.setToolTipText("Funcionários");
		funcionarios.setBounds(183, 0, 60, 60);
		
		
		// Colocando os Campos visíveis
		menuListaStyle menu = new menuListaStyle();
		
		getContentPane().add(clientes);
		getContentPane().add(produtos);
		getContentPane().add(funcionarios);
		getContentPane().add(venda);
		
		
		/************************
		     JANELA DO MEIO
		************************/
		
		Color corFundo  = new Color(112, 128, 144); 
		Color corMenu   = new Color(235, 220, 160); 
		JPanel fundo    = new JPanel();
		JPanel menuMeio = new JPanel(); 
		
		fundo.setBounds(5, 65, 880, 495);
		fundo.setBackground(corFundo);
		fundo.setLayout(null);
		
		menuMeio.setBounds(215,80, 450, 200);
		menuMeio.setBackground(corMenu);
		menuMeio.setLayout(null);
		
		// Botoes 
		
		JButton novoVenda = new JButton();
		novoVenda.setText("Nova Venda");
		novoVenda.setToolTipText("Nova Venda");
		novoVenda.setBounds(0, 0, 150, 100);
		
		JButton novoCliente = new JButton();
		novoCliente.setText("Novo Cliente");
		novoCliente.setToolTipText("Novo Cliente");
		novoCliente.setBounds(150, 0, 150, 100);

		JButton novoProduto = new JButton();
		novoProduto.setText("Novo Produto");
		novoProduto.setToolTipText("Novo Produto");
		novoProduto.setBounds(300, 0, 150, 100);
		
		JButton novoFuncionario = new JButton();
		novoFuncionario.setText("Novo Funcionário");
		novoFuncionario.setToolTipText("Novo Funcionário");
		novoFuncionario.setBounds(0, 100, 150, 100);
		
		JButton novoRelatorioVendas = new JButton();
		novoRelatorioVendas.setText("Relatório de Vendas");
		novoRelatorioVendas.setToolTipText("Relatório de Vendas");
		novoRelatorioVendas.setBounds(150, 100, 150, 100);
		
		JButton novoRelatorioProdutos = new JButton();
		novoRelatorioProdutos.setText("Relatório de Produtos");
		novoRelatorioProdutos.setToolTipText("Relatório de Produtos");
		novoRelatorioProdutos.setBounds(300, 100, 150, 100);
		

		getContentPane().add(fundo);
		fundo.add(menuMeio);
		menuMeio.add(novoVenda);
		menuMeio.add(novoCliente);
		menuMeio.add(novoProduto);
		menuMeio.add(novoFuncionario);
		menuMeio.add(novoRelatorioVendas);
		menuMeio.add(novoRelatorioProdutos);
		
		
	}
	
	
	public static void main(String arg[]){ 
		new programaStyle().setVisible(true);
	}
}