package programa;


import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FornecedorStyle extends JFrame{
	
	JLabel Nome,Telefone,Email,cidade,produto;
	JTextField tNome,tTelefone,temail,tcidade,tproduto;
	JPanel campos;
	
	
	public FornecedorStyle(){
		
		
		    Color cor = new Color(222, 222, 222);	
		    setBounds (200,50,810,400); 
		    setTitle("Cadastro de Funcionarios");
		    getContentPane().setLayout (null);
		    
			campos = new JPanel();
			campos.setBounds (10, 0, 810, 400);
			campos.setLayout(null);
			getContentPane().add(campos);
			
		    Nome = new JLabel("Nome:");
			Nome.setBounds(20, 10, 50, 25);
		    campos.add(Nome);
			tNome=new JTextField();
			tNome.setBounds(80, 10, 463, 25);
			campos.add(tNome);
			
			Telefone = new JLabel ("Telefone:");
			Telefone.setBounds(20 , 46 , 100, 25);
			campos.add(Telefone);
			tTelefone=new JTextField();
			tTelefone.setBounds(80 , 46 , 154, 25);
			campos.add(tTelefone);
			
			Email=new JLabel("E-mail:");
			Email.setBounds(264, 48, 100, 20);
			campos.add(Email);
			temail=new JTextField();
			temail.setBounds(363, 46, 180, 25);
		    campos.add(temail);
			
			cidade=new JLabel("Cidade:");
			cidade.setBounds(20, 83, 100, 25);
			campos.add(cidade);
			tcidade=new JTextField();
			tcidade.setBounds(80 , 83 , 154, 25);
			campos.add(tcidade);
			
			produto=new JLabel("Produto fornecido:");
			produto.setBounds( 264, 83, 100, 25 );
			campos.add(produto);
			tproduto=new JTextField();
			tproduto.setBounds(363,83,180,25);
			campos.add(tproduto);
			

			JButton salvar = new JButton();
			salvar.setBounds(150, 150, 100, 30);
			salvar.setText("Salvar");
			campos.add(salvar);
			
			JButton limpar = new JButton();
			limpar.setBounds(279, 150, 100, 30);
			limpar.setText("Limpar");
			campos.add(limpar);
			
		
	}

}

