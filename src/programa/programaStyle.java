package programa;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class programaStyle extends JFrame{
		
	public programaStyle()	{
		
		
		/************************
	          Style JANELA
	    ************************/
		
		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setBounds(200, 40, 900, 600);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar

				
		Color corTudo   = new Color(205, 92, 92); 
		
		JPanel tudo = new JPanel();       		   // Envolve TODOS os conteudos do programa!!
		tudo.setBounds(0, 0, 903, 600);
//		tudo.setBackground(corTudo);  		     // descomente a cor para ver a onde está o JPanel
		tudo.setLayout(null);
		
		getContentPane().add(tudo);
		
		/******************************
             Style BOTÕES DE CIMA
		******************************/
		
		Color corCima   = new Color(235, 220, 160); 
		
		JPanel cima = new JPanel();       		   // Envolve TUDO que estám em cima (botões, campo pesquisa...)
		cima.setBounds(0, 0, 900, 65);
	//	cima.setBackground(corCima);  		     // descomente a cor para ver a onde está o JPanel
		cima.setLayout(null);
		
		Color corbotoes   = new Color(0, 100, 0);
		
		JPanel botoes = new JPanel();          // Envolve TUDO que estám em cima (botões, campo pesquisa...)
		botoes.setBounds(0, 0, 350, 65);
	//	botoes.setBackground(corbotoes);       // descomente a cor para ver a onde está o JPanel
		botoes.setLayout(null);
		
		JButton venda = new JButton();
		venda.setText("Venda");
		venda.setToolTipText("Venda");
		venda.setBounds(5, 0, 60, 60);
		
		JButton clientes = new JButton();
		clientes.setText("Clientes");
		clientes.setToolTipText("Clientes");
		clientes.setBounds(66, 0, 60, 60);
		
		JButton produtos = new JButton();
		produtos.setText("Produtos");
		produtos.setToolTipText("Produtos");
		produtos.setBounds(127, 0, 60, 60);
		
		JButton funcionarios = new JButton();
		funcionarios.setText("Funcionários");
		funcionarios.setToolTipText("Funcionários");
		funcionarios.setBounds(188, 0, 60, 60);
		
		JButton relatorios = new JButton();
		relatorios.setText("Relatório");
		relatorios.setToolTipText("Relatório");
		relatorios.setBounds(249, 0, 60, 60);
		
		
		// Colocando os Campos visíveis
		
		tudo.add(cima);
		cima.add(botoes);
		botoes.add(clientes);
		botoes.add(produtos);
		botoes.add(funcionarios);
		botoes.add(venda);
		botoes.add(relatorios);
		
		
		
		/****************************
               Style PESQUISA
		****************************/
		
		Color corPesquisa   = new Color(235, 220, 160); 
		
		JPanel pesquisar = new JPanel();           // Envolve o campo e o botão de pesquisa
		pesquisar.setBounds(655, 30, 233, 33);
//		pesquisar.setBackground(corPesquisa);      // descomente a cor para ver a onde está o JPanel
		pesquisar.setLayout(null);
		
		JTextField pesquisa = new JTextField();
		pesquisa.setText("Pesquisar!!");
		pesquisa.setToolTipText("Digite uma palavra para pesquisar no banco de dados.");
		pesquisa.setBounds(0, 0, 200, 30);
		
		JButton ir = new JButton();
		ir.setText("Ir");
		ir.setToolTipText("Pesquisar");
		ir.setBounds(200, 0, 30, 30);
		
		cima.add(pesquisar);
		pesquisar.add(pesquisa);
		pesquisar.add(ir);
	
		
		
		
		
		/************************
		     JANELA DO MEIO
		************************/
		
		Color corFundo  = new Color(112, 128, 144); 
		
		JPanel fundo    = new JPanel();      				 // Envolve TODA a parte de baixo dos botões!!
		fundo.setBounds(5, 65, 880, 495);
		fundo.setBackground(corFundo);         			   // descomente a cor para ver a onde está o JPanel
		fundo.setLayout(null);
		
		Color corMenu   = new Color(235, 220, 160); 
		
		JPanel menuMeio = new JPanel(); 				     // Envolve só Menu central
		menuMeio.setBounds(215,80, 453, 203);  
	//	menuMeio.setBackground(corMenu);   					// descomente a cor para ver a onde está o JPanel
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
		

		tudo.add(fundo);
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