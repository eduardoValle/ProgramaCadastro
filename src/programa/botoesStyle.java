package programa;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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

		

		JPanel botoes = new JPanel();          // Envolve TUDO que estám em cima (botões, campo pesquisa...)
		botoes.setBounds(0, 2, 350, 65);
	//	botoes.setBackground(new Color(0, 100, 0));       // descomente a cor para ver a onde está o JPanel
		botoes.setLayout(null);

		Icon imageVenda = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/MINIVENDA.png");
		venda = new JButton(imageVenda);
		venda.setText("Venda");
		venda.setToolTipText("Venda");
		venda.setBounds(5, 0, 60, 60);
		venda.setBackground(new Color(10, 89, 193));

		Icon imageClientes = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/MINICLIENTE.PNG");
		clientes = new JButton(imageClientes);
		clientes.setText("Clientes");
		clientes.setToolTipText("Clientes");
		clientes.setBounds(66, 0, 60, 60);
		clientes.setBackground(new Color(189, 30, 73));

		Icon imageProdutos = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/MINIPRODUTO.PNG");
		produtos = new JButton(imageProdutos);
		produtos.setText("Produtos");
		produtos.setToolTipText("Produtos");
		produtos.setBounds(127, 0, 60, 60);
		produtos.setBackground(new Color(95, 59, 186));

		Icon Funcionarios2 = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/MINIFUNCIONARIO.PNG");
		funcionarios = new JButton(Funcionarios2);
		funcionarios.setText("Funcionários");
		funcionarios.setToolTipText("Funcionários");
		funcionarios.setBounds(188, 0, 60, 60);
		funcionarios.setBackground(new Color(0, 161, 0));

		Icon imageRelatorios = new ImageIcon("C:/Users/Suzana/workspace/ProgramaCadastro/imagens/MINIRELATORIO.PNG");
		relatorios = new JButton(imageRelatorios);
		relatorios.setText("Relatório");
		relatorios.setToolTipText("Relatório");
		relatorios.setBounds(249, 0, 60, 60);
		relatorios.setBackground(new Color(212, 75, 40));
		
		
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
		pesquisa.setBounds(0, 7, 200, 25);

		ir = new JButton();
		ir.setText("Ir");
		ir.setToolTipText("Pesquisar");
		ir.setBounds(200, 6, 25, 25);
		ir.setBackground(new Color(0, 191, 242));

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
