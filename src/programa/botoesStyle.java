package programa;

import java.awt.*;
import javax.swing.*;

public class botoesStyle extends menuLista {
	
	JPanel cima = new JPanel();       		   // Envolve TUDO que estám em cima (botões, campo pesquisa...)

	public botoesStyle(){
		Color corCima   = new Color(235, 220, 160); 

		cima.setBounds(0, 0, 890, 65);
	//	cima.setBackground(corCima);  		     // descomente a cor para ver a onde está o JPanel
		cima.setLayout(null);

		cima.setVisible(true);

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
		pesquisa.setBounds(0, 0, 200, 25);

		JButton ir = new JButton();
		ir.setText("Ir");
		ir.setToolTipText("Pesquisar");
		ir.setBounds(200, 0, 30, 25);

		cima.add(pesquisar);
		pesquisar.add(pesquisa);
		pesquisar.add(ir);
		
		
	// Colocando os Campos visíveis

		tudo.add(cima);
		cima.add(botoes);
		botoes.add(clientes);
		botoes.add(produtos);
		botoes.add(funcionarios);
		botoes.add(venda);
		botoes.add(relatorios);

	}
	
}
