package programa;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SelecionarVendedor extends JFrame{
	
	JTextField codeVendedor, vendedor;
	JButton pesquisar;
	
	public SelecionarVendedor(){
		
		setTitle("Vendas");
		setBounds(0, 0, 1350, 540);									                                           
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JPanel tudo = new JPanel();
		tudo.setBounds(0, 0, 1350, 540);
		tudo.setLayout(null);
		getContentPane().add(tudo);
		
		JLabel codeVend = new JLabel("Código Vendedor");
		codeVend.setBounds(10, 5, 200, 20);
		tudo.add(codeVend);
		
		codeVendedor = new JTextField();
		codeVendedor.setBounds(10, 30, 100, 20);
		codeVendedor.setToolTipText("Filtar por Código");
		tudo.add(codeVendedor);
		
		JLabel nome = new JLabel("Nme Vendedor");
		nome.setBounds(120, 5, 200, 20);
		tudo.add(nome);
		
		vendedor = new JTextField();
		vendedor.setBounds(115, 30, 400, 20);
		vendedor.setToolTipText("Filtar por Nome");
		tudo.add(vendedor);
				
		pesquisar = new JButton();
		pesquisar.setBounds(520, 30, 25, 20);
		pesquisar.setToolTipText("Pesquisar");
		tudo.add(pesquisar);
		
		JPanel areaTabela = new JPanel();
		areaTabela.setBounds(0, 60, 1350, 450);
		areaTabela.setBackground(new Color(205, 92, 92)); 
		tudo.add(areaTabela);
		
	}
	
	public static void main (String args[]){
		
		new SelecionarVendedor().setVisible(true);
	}
}
