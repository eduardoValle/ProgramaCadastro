package programa;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuListaStyle extends JFrame{

	JDesktopPane tudo = new JDesktopPane();       		   // Envolve TODOS os conteudos do programa!!
	JPanel fundo    = new JPanel();      				  // Envolve TODA a parte de conteudo, ou seja abaixo dos botoes!!
	JPanel central;
	CardLayout gerenciadorDeConteudo;

	Toolkit toolkit = Toolkit.getDefaultToolkit();        //Pegando as dimensões da tela
	final Dimension scrnsize = toolkit.getScreenSize();  
	int width = (int)scrnsize.getWidth();                // Pegando a largura
	int heigth = (int)scrnsize.getHeight()-40;  		//  Pegando a altura

	public MenuListaStyle()	{

		/************************
    			Style JANELA
		************************/

		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setBounds(0, 0, width, heigth);
		setLayout(null);
		setUndecorated(false);                                         // com false abre frame dentro de um frame


		/**********************************
		 *     OPÇÕES DO BOTÃO FECHAR    *		
		 **********************************/

		addWindowListener(new opcaoFechar()); 
		

		/**********************************
		 *     CONTEÚDO DO PROGRAMA      *		
		 **********************************/

		tudo.setBounds(0, 0, width, heigth);
//		tudo.setBackground(new Color(205, 92, 92));  		     // descomente a cor para ver a onde está o JPanel
		tudo.setLayout(null);

		gerenciadorDeConteudo = new CardLayout();

		fundo.setBounds(0, 65, width, heigth-100);
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
	
	
	public class opcaoFechar implements WindowListener{
		@Override
		public void windowClosing(WindowEvent ev) {  

			int resposta = JOptionPane.showConfirmDialog(MenuListaStyle.this, "Tem certeza que deseja sair??", "Close Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);  

			if (resposta == JOptionPane.YES_OPTION) {  			 //  Se sim ele fecha

				setDefaultCloseOperation(EXIT_ON_CLOSE);

			} else if (resposta == JOptionPane.CANCEL_OPTION){   // se cancelar ele não faz nada

				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}  
		}  

		@Override
		public void windowActivated(WindowEvent arg0){}

		@Override
		public void windowClosed(WindowEvent arg0){}

		@Override
		public void windowDeactivated(WindowEvent arg0){}

		@Override
		public void windowDeiconified(WindowEvent arg0){}

		@Override
		public void windowIconified(WindowEvent arg0){}

		@Override
		public void windowOpened(WindowEvent arg0){}
		
	}
}
