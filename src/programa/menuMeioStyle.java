package programa;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;


public class MenuMeioStyle extends Botoes {
	
	JButton novoVenda, novoCliente, novoProduto, novoFuncionario, novoRelatorioVendas, novoRelatorioProdutos;
	JFrame menuMeio;
	
	public MenuMeioStyle(){
				
		menuMeio = new JFrame();  
		menuMeio.setBounds(415, 230, 462, 235);  
		menuMeio.setLayout(null);
		menuMeio.setTitle("Menu Rápido!!");
		menuMeio.setUndecorated(true);                                        
		menuMeio.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);   
	
		
		// Botoes 
		
		Icon imageVenda = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/VENDA.png");
		novoVenda = new JButton(imageVenda);
		novoVenda.setText("Nova Venda");
		novoVenda.setToolTipText("Nova Venda");
		novoVenda.setBounds(1, 1, 150, 100);
		novoVenda.setBackground(new Color(10, 89, 193));
		
		Icon imageCliente = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/CLIENTE.PNG");
		novoCliente = new JButton(imageCliente);
		novoCliente.setText("Novo Cliente");
		novoCliente.setToolTipText("Novo Cliente");
		novoCliente.setBounds(151, 1, 150, 100);
		novoCliente.setBackground(new Color(189, 30, 73));

		Icon imageProduto = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/PRODUTO.PNG");
		novoProduto = new JButton(imageProduto);
		novoProduto.setText("Novo Produto");
		novoProduto.setToolTipText("Novo Produto");
		novoProduto.setBounds(301, 1, 150, 100);
		novoProduto.setBackground(new Color(95, 59, 186));
		
		Icon imageFuncionario = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/FUNCIONARIO.PNG");
		novoFuncionario = new JButton(imageFuncionario);
		novoFuncionario.setText("Novo Funcionário");
		novoFuncionario.setToolTipText("Novo Funcionário");
		novoFuncionario.setBounds(1, 101, 150, 100);
		novoFuncionario.setBackground(new Color(0, 161, 0));
		
		Icon imageRVendas = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/RELATORIOV.PNG");
		novoRelatorioVendas = new JButton(imageRVendas);
		novoRelatorioVendas.setText("Relatório de Vendas");
		novoRelatorioVendas.setToolTipText("Relatório de Vendas");
		novoRelatorioVendas.setBounds(151, 101, 150, 100);
		novoRelatorioVendas.setBackground(new Color(212, 75, 40));
		
		Icon imageRProdutos = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/RELATORIOP.PNG");
		novoRelatorioProdutos = new JButton(imageRProdutos);
		novoRelatorioProdutos.setText("Relatório de Produtos");
		novoRelatorioProdutos.setToolTipText("Relatório de Produtos");
		novoRelatorioProdutos.setBounds(301, 101, 150, 100);
		novoRelatorioProdutos.setBackground(new Color(0, 191, 242));
	
		menuMeio.add(novoVenda);
		menuMeio.add(novoCliente);
		menuMeio.add(novoProduto);
		menuMeio.add(novoFuncionario);
		menuMeio.add(novoRelatorioVendas);
		menuMeio.add(novoRelatorioProdutos);

	}  

}


