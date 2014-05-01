package programa;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class MenuListaStyle extends JFrame{
		
	JDesktopPane tudo = new JDesktopPane();       		   // Envolve TODOS os conteudos do programa!!
	JPanel fundo    = new JPanel();      				  // Envolve TODA a parte de conteudo, ou seja abaixo dos botoes!!

	public MenuListaStyle()	{
	
	/************************
    	Style JANELA
	************************/

	setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
	setBounds(200, 40, 900, 620);
	setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
	setUndecorated(true);                                         // com false abre frame dentro de um frame
	getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela



	/**********************************
	 *     OPÇÕES DO BOTÃO FECHAR    *		
	**********************************/
	
	addWindowListener(new WindowAdapter() {  
		
		public void windowClosing(WindowEvent ev) {  
			
			int resposta = JOptionPane.showConfirmDialog(MenuListaStyle.this, "Tem certeza que deseja sair??", "Close Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);  
		
			if (resposta == JOptionPane.YES_OPTION) {   //  Se sim ele fecha
				
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				 
			} else if (resposta == JOptionPane.CANCEL_OPTION){   // se cancelar ele não faz nada
				
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}  
		}  

	}); 
	
	
	/**********************************
	 *     CONTEÚDO DO PROGRAMA      *		
	**********************************/
	
	
	tudo.setBounds(0, 0, 893, 600);
//	tudo.setBackground(new Color(205, 92, 92));  		     // descomente a cor para ver a onde está o JPanel
	tudo.setLayout(null);
		
	CardLayout gerenciadorDeConteudo = new CardLayout();
	fundo.setBounds(5, 65, 880, 495);
	fundo.setBackground(new Color(112, 128, 144));         			   // descomente a cor para ver a onde está o JPanel
	fundo.setLayout(gerenciadorDeConteudo);
	
	tudo.add(fundo);

	getContentPane().add(tudo);

	
	/******************************
   		Style MENU LISTA
	******************************/

	//Criando Itens do Menu
	
	JMenuItem menuItemImprimir = new JMenuItem("Imprimir");
	JMenuItem menuItemSair = new JMenuItem("Sair");

	//Criando Submenus
	
	 JMenu submenuNovo = new JMenu("Novo");
	 JMenuItem menuItemVenda = new JMenuItem("Venda");
	 JMenuItem menuItemCompra= new JMenuItem("Compra");
	 JMenuItem menuItemOrçamento= new JMenuItem("Orçamento");


	//Itens do menu
	 
	 JMenuItem menuItemClientes = new JMenuItem("Clientes");
	 JMenuItem menuItemFuncionários = new JMenuItem("Funcionários");
	 JMenuItem menuItemFornecedor = new JMenuItem("Fornecedor");
	 JMenuItem menuItemProduto = new JMenuItem("Produto");


	 JMenuItem menuItemVendas = new JMenuItem("Vendas");
	 JMenuItem menuItemCompras = new JMenuItem("Compras");
	 JMenuItem menuItemEstoque = new JMenuItem("Estoque");


	 JMenuItem menuItemConsultaClientes = new JMenuItem("Clientes");
	 JMenuItem menuItemConsultaFuncionários = new JMenuItem("Funcionários");
	 JMenuItem menuItemConsultaFornecedor = new JMenuItem("Fornecedor");
	 JMenuItem menuItemConsultaProduto = new JMenuItem("Produto");


	//Criando os Menus
	 
	 JMenu menuArquivo = new JMenu("Arquivo");

	 JMenu menuCadastro = new JMenu("Cadastro");

	 JMenu menuRelatório = new JMenu("Relatório");

	 JMenu menuConsulta = new JMenu("Consulta");

	 JMenuBar menuBar = new JMenuBar();


		//Adicionando no JFrame

		menuArquivo.add(submenuNovo);
		menuArquivo.add(menuItemImprimir);
		menuArquivo.add(menuItemSair);

		submenuNovo.add(menuItemVenda);
		submenuNovo.add(menuItemCompra);
		submenuNovo.add(menuItemOrçamento);

		menuArquivo.addSeparator();


		menuCadastro.add(menuItemClientes);
		menuCadastro.add(menuItemFuncionários);
		menuCadastro.add(menuItemFornecedor);
		menuCadastro.add(menuItemProduto);
		menuCadastro.addSeparator();


		menuRelatório.add(menuItemVendas);
		menuRelatório.add(menuItemCompras);
		menuRelatório.add(menuItemEstoque);
		menuRelatório.addSeparator();


		menuConsulta.add(menuItemConsultaClientes);
		menuConsulta.add(menuItemConsultaFuncionários);
		menuConsulta.add(menuItemConsultaFornecedor);
		menuConsulta.add(menuItemConsultaProduto);


		menuBar.add(menuArquivo);
		menuBar.add(menuCadastro);
		menuBar.add(menuRelatório);
		menuBar.add(menuConsulta);
		this.setJMenuBar(menuBar);      //atribui um JMenuBar para o frame

	}

	private void resizeble(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
