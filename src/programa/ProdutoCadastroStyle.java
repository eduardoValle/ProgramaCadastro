package programa;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProdutoCadastroStyle extends JFrame {
	
	JButton salvar, limpar;
	
	public ProdutoCadastroStyle() {
		setBounds(0,0, 880, 495); 			 //Define o posicionamento e o tamanho do Frame.
		setLayout (null); 					//Define o layout para não haver tabelas e sim uma única tela.
		
		JPanel Produto = new JPanel ();
		Produto.setBounds (0,0,880,495);
		Produto.setBackground (new Color (238, 233, 233));
		getContentPane().add(Produto);			 //Adiciona alguma coisa ao plano de fundo padrão.
		Produto.setLayout (null); 				//Define o layout para não haver tabelas e sim uma única tela.
		
		/* POSICIONAMENTO DOS LABELS E TEXTFIELD
		 * 
		 * De label para textfield foi adotado o espaçamento de 25 pixels na vertical;
		 * De label para label foi adotado o espaçamento de 60 pixels na vertical;
		 * De textfield para textfield foi adotado o espaçamento de 60 pixels na vertical;
		 * O espaçamento de textfield para texfield é de 50 pixels na horizontal;
		 * 
		*/
		
		JLabel numnota = new JLabel (); //Descrição da Nota Fiscal
		numnota.setBounds (20,10,100, 20);
		numnota.setText("Nota Fiscal");
		Produto.add(numnota);
		
		JTextField nnota = new JTextField ();
		nnota.setBounds(20,35,350,20);	
		Produto.add(nnota);
		
		JLabel dataEmissao = new JLabel (); //Descrição da Data de Compra do Produto
		dataEmissao.setBounds (420,10,100,20);
		dataEmissao.setText("Data de Emissão");
		Produto.add(dataEmissao);
		
		JTextField data = new JTextField ();
		data.setBounds(420,35,100,25);
		Produto.add(data);
		
		JLabel fornecedor = new JLabel (); //Descrição do Fornecedor
		fornecedor.setBounds (20,70,150,20);
		fornecedor.setText("Fornecedor");
		Produto.add(fornecedor);
		
		JTextField fornecedortxt = new JTextField ();
		fornecedortxt.setBounds(20,95,350,20);
		Produto.add (fornecedortxt);
		
		JLabel nome = new JLabel(); //Descrição do Produto
		nome.setBounds(20,130, 100, 20);
		nome.setText("Produto");
		Produto.add(nome);
		
		JTextField nProduto = new JTextField ();
		nProduto.setBounds(20,155, 350,20);
		Produto.add(nProduto);
		
		JLabel qtdd = new JLabel(); //Descrição de Quantidade de Produtos
		qtdd.setBounds(420,130,75,20);
		qtdd.setText("Quantidade");
		Produto.add(qtdd);
		
		JTextField  qtdtxt= new JTextField ();
		qtdtxt.setBounds(420,155,75,20);
		Produto.add(qtdtxt);
		
		JLabel vu = new JLabel(); //Descrição do Valor Unitário
		vu.setBounds(525,130,150,20);
		vu.setText("Valor Unitário");
		Produto.add(vu);
		
		JTextField  valoru= new JTextField ();
		valoru.setBounds(525,155,150,20);
		Produto.add(valoru);
		
		JLabel subtotal = new JLabel(); //Descrição do Subtotal
		subtotal.setBounds(700,130,150,20);
		subtotal.setText("Subtotal");
		Produto.add(subtotal);
		
		JTextField  subtt= new JTextField ();
		subtt.setBounds(700,155,150,20);
		Produto.add(subtt);
		
		JLabel total = new JLabel(); //Descrição do Subtotal
		total.setBounds(700,350,150,20);
		total.setText("Total");
		Produto.add(total);
		
		JTextField  tt= new JTextField ();
		tt.setBounds(700,375,150,20);
		Produto.add(tt);		
		
		salvar = new JButton ();
		salvar.setBounds(775,410,75,20);
		salvar.setText("Salvar");
		Produto.add (salvar);
				
	}
}