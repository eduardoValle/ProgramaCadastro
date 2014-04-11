package programa;

import java.awt.*;
import javax.swing.*;

public class ProgramaStyle extends Style{

	JTextField     login;
	JPasswordField senha;
	JLabel menuLista;
	JButton clientes, produtos, venda, funcionarios;

	public ProgramaStyle()	{

		/************************
	     		STYLE CAMPO
		 ************************/

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

		/************************
		     JANELA DO MEIO
		 ************************/

		Color corFundo  = new Color(112, 128, 144); 
		Color corMenu   = new Color(235, 220, 160); 
		JPanel fundo    = new JPanel();
		JPanel menuMeio = new JPanel(); 

		fundo.setBounds(5, 100, 880, 400);
		fundo.setBackground(corFundo);
		fundo.setLayout(null);

		menuMeio.setBounds(215,80, 450, 200);
		menuMeio.setBackground(corMenu);
		menuMeio.setLayout(null);

		/************************
	     		BOTÕES
		 ************************/
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
		


		/**********************************
	     	COLOCANDO OS CAMPOS VISIVEIS
		 **********************************/

		getContentPane().add(menLista);
		getContentPane().add(clientes);
		getContentPane().add(produtos);
		getContentPane().add(funcionarios);
		getContentPane().add(venda);
		
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
		new ProgramaStyle().setVisible(true);
	}
}