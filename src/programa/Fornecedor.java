package programa;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fornecedor extends JFrame{

	JLabel Nome,Telefone,email,cidade,produto;
	JTextField tNome,tTelefone,temail,tcidade,tproduto;



	public Fornecedor(){

		setBounds (200,50,810,400); 
		setTitle("Cadastro de Funcionarios");
		setLayout (null);

		JPanel campos = new JPanel();
		campos.setBounds (0, 0, 810, 400);
		campos.setLayout(null);
		getContentPane().add(campos);

		Nome = new JLabel("Nome:");
		Nome.setBounds(0, 5, 50, 30);
		campos.add(Nome);

		tNome=new JTextField();
		tNome.setBounds(40, 10, 280, 20);
		campos.add(Nome);

		Telefone = new JLabel ("Telefone:");
		Telefone.setBounds(360 , 10 , 100, 20);
		campos.add(Telefone);

		tTelefone=new JTextField();
		campos.add(tTelefone);

		email=new JLabel("e-mail:");
		email.setBounds(570, 60, 100, 20);
		campos.add(email);

		temail=new JTextField();
		temail.setBounds(610, 60, 180, 20);
		campos.add(temail);

		cidade=new JLabel("Cidade:");
		cidade.setBounds(0, 120, 100, 20);
		campos.add(cidade);

		tcidade=new JTextField();
		tcidade.setBounds(360 , 120 , 100, 20);
		campos.add(tcidade);

	}

	public static void main (String args[]){
		new Fornecedor ().setVisible(true);

	}	

}
