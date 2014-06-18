package programa;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuMeioStyle extends Botoes {
	
	JButton novoVenda, novoCliente, novoProduto, novoFuncionario, novoRelatorioVendas, novoRelatorioProdutos;
	JPanel menuMeio;
	
	public MenuMeioStyle(){
				
		central = new JPanel();
		central.setBackground(new Color(112, 128, 144));
		central.setLayout(null);
				
		menuMeio = new JPanel();  
		menuMeio.setBounds((width/2)-227, 100, 505, 235);  
		menuMeio.setLayout(null);	
		
		ImageIcon imagem = new ImageIcon("imagens/1.jpg");
		JLabel imagemFundo = new JLabel(imagem);
		imagemFundo.setBounds(0, 0, width, heigth);		

		
		// Botoes 
		
		Icon imageVenda = new ImageIcon("../ProgramaCadastro/imagens/VENDA.png");
		novoVenda = new JButton(imageVenda);
		novoVenda.setText("Nova Venda");
		novoVenda.setToolTipText("Nova Venda");
		novoVenda.setBounds(10, 11, 150, 100);
		novoVenda.setBackground(new Color(10, 89, 193));

		
		Icon imageCliente = new ImageIcon("../ProgramaCadastro/imagens/CLIENTE.PNG");
		novoCliente = new JButton(imageCliente);
		novoCliente.setText("Novo Cliente");
		novoCliente.setToolTipText("Novo Cliente");
		novoCliente.setBounds(178, 11, 150, 100);
		novoCliente.setBackground(new Color(189, 30, 73));

		Icon imageProduto = new ImageIcon("../ProgramaCadastro/imagens/PRODUTO.PNG");
		novoProduto = new JButton(imageProduto);
		novoProduto.setText("Novo Produto");
		novoProduto.setToolTipText("Novo Produto");
		novoProduto.setBounds(345, 11, 150, 100);
		novoProduto.setBackground(new Color(95, 59, 186));
		
		Icon imageFuncionario = new ImageIcon("../ProgramaCadastro/imagens/FUNCIONARIO.PNG");
		novoFuncionario = new JButton(imageFuncionario);
		novoFuncionario.setText("Novo Funcionário");
		novoFuncionario.setToolTipText("Novo Funcionário");
		novoFuncionario.setBounds(10, 126, 150, 100);
		novoFuncionario.setBackground(new Color(0, 161, 0));
		
		Icon imageRVendas = new ImageIcon("../ProgramaCadastro/imagens/RELATORIOV.PNG");
		novoRelatorioVendas = new JButton(imageRVendas);
		novoRelatorioVendas.setText("Relatório de Vendas");
		novoRelatorioVendas.setToolTipText("Relatório de Vendas");
		novoRelatorioVendas.setBounds(178, 126, 150, 100);
		novoRelatorioVendas.setBackground(new Color(212, 75, 40));
		
		Icon imageRProdutos = new ImageIcon("../ProgramaCadastro/imagens/RELATORIOP.PNG");
		novoRelatorioProdutos = new JButton(imageRProdutos);
		novoRelatorioProdutos.setText("Relatório de Produtos");
		novoRelatorioProdutos.setToolTipText("Relatório de Produtos");
		novoRelatorioProdutos.setBounds(345, 126, 150, 100);
		novoRelatorioProdutos.setBackground(new Color(0, 191, 242));
		
		fundo.add(central);
		central.add(menuMeio);
		central.add(imagemFundo);
	
		menuMeio.add(novoVenda);
		menuMeio.add(novoCliente);
		menuMeio.add(novoProduto);
		menuMeio.add(novoFuncionario);
		menuMeio.add(novoRelatorioVendas);
		menuMeio.add(novoRelatorioProdutos);

	}  

}


