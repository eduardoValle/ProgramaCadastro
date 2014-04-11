package programa;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotoesStyle extends MenuLista {
	
	JPanel cima = new JPanel();       		   // Envolve TUDO que estám em cima (botões, campo pesquisa...)

	JTextField pesquisa;
	JButton venda, clientes, produtos, funcionarios, relatorios, ir;

	public BotoesStyle(){

		cima.setBounds(0, 0, 890, 65);
	//	cima.setBackground(new Color(235, 220, 160));  		     // descomente a cor para ver a onde está o JPanel
		cima.setLayout(null);

		cima.setVisible(true);


		JPanel botoes = new JPanel();          // Envolve TUDO que estám em cima (botões, campo pesquisa...)
		botoes.setBounds(0, 0, 350, 65);
	//	botoes.setBackground(new Color(0, 100, 0));       // descomente a cor para ver a onde está o JPanel
		botoes.setLayout(null);

		venda = new JButton();
		venda.setText("Venda");
		venda.setToolTipText("Venda");
		venda.setBounds(5, 0, 60, 60);

		clientes = new JButton();
		clientes.setText("Clientes");
		clientes.setToolTipText("Clientes");
		clientes.setBounds(66, 0, 60, 60);

		produtos = new JButton();
		produtos.setText("Produtos");
		produtos.setToolTipText("Produtos");
		produtos.setBounds(127, 0, 60, 60);

		funcionarios = new JButton();
		funcionarios.setText("Funcionários");
		funcionarios.setToolTipText("Funcionários");
		funcionarios.setBounds(188, 0, 60, 60);

		relatorios = new JButton();
		relatorios.setText("Relatório");
		relatorios.setToolTipText("Relatório");
		relatorios.setBounds(249, 0, 60, 60);
		
		
		/****************************
        	   Style PESQUISA
		****************************/


		JPanel pesquisar = new JPanel();           // Envolve o campo e o botão de pesquisa
		pesquisar.setBounds(655, 30, 233, 33);
//		pesquisar.setBackground(new Color(235, 220, 160));      // descomente a cor para ver a onde está o JPanel
		pesquisar.setLayout(null);

		pesquisa = new JTextField();
		pesquisa.setText("Pesquisar!!");
		pesquisa.setToolTipText("Digite uma palavra para pesquisar no banco de dados.");
		pesquisa.setBounds(0, 0, 200, 30);

		ir = new JButton();
		ir.setText("Ir");
		ir.setToolTipText("Pesquisar");
		ir.setBounds(200, 0, 30, 30);

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
