package programa;

import javax.swing.*;


public class menuMeioStyle extends botoes {

	public menuMeioStyle(){
		boolean resizable = false;  
		boolean closeable = false;  
		boolean maximizable = false;  
		boolean iconifiable = false;
		String title = "Menu";  
		
		JInternalFrame menuMeio = new JInternalFrame(title, resizable, closeable, maximizable, iconifiable);  
		
		menuMeio.setBounds(215,80, 462, 235);  
		menuMeio.setLayout(null);
		menuMeio.getContentPane().add(new JTextArea());
		
		menuMeio.setVisible(true);  
		fundo.add(menuMeio);  
		
		// Botoes 
		
		JButton novoVenda = new JButton();
		novoVenda.setText("Nova Venda");
		novoVenda.setToolTipText("Nova Venda");
		novoVenda.setBounds(1, 1, 150, 100);
		
		JButton novoCliente = new JButton();
		novoCliente.setText("Novo Cliente");
		novoCliente.setToolTipText("Novo Cliente");
		novoCliente.setBounds(151, 1, 150, 100);

		JButton novoProduto = new JButton();
		novoProduto.setText("Novo Produto");
		novoProduto.setToolTipText("Novo Produto");
		novoProduto.setBounds(301, 1, 150, 100);
		
		JButton novoFuncionario = new JButton();
		novoFuncionario.setText("Novo Funcionário");
		novoFuncionario.setToolTipText("Novo Funcionário");
		novoFuncionario.setBounds(1, 101, 150, 100);
		
		JButton novoRelatorioVendas = new JButton();
		novoRelatorioVendas.setText("Relatório de Vendas");
		novoRelatorioVendas.setToolTipText("Relatório de Vendas");
		novoRelatorioVendas.setBounds(151, 101, 150, 100);
		
		JButton novoRelatorioProdutos = new JButton();
		novoRelatorioProdutos.setText("Relatório de Produtos");
		novoRelatorioProdutos.setToolTipText("Relatório de Produtos");
		novoRelatorioProdutos.setBounds(301, 101, 150, 100);
	
		menuMeio.add(novoVenda);
		menuMeio.add(novoCliente);
		menuMeio.add(novoProduto);
		menuMeio.add(novoFuncionario);
		menuMeio.add(novoRelatorioVendas);
		menuMeio.add(novoRelatorioProdutos);

	}  
	
	public static void main(String arg[]){ 

		new menuMeioStyle().setVisible(true);
		
	}

}
