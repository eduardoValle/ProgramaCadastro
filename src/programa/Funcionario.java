package programa;

import javax.swing.*;

import java.awt.*;

public class Funcionario extends JFrame{
	JButton salvar,editar,novo,cancelar,apagar;

	JTextField tx1,tx2,tx3,tx4,tx5;
	JLabel l1,l2,l3,l4,l5;
	JPanel p1;

	public Funcionario () {

		setLayout(null);

		salvar= new JButton("Salvar");
		salvar.setToolTipText("Salvar o arquivo");
		editar= new JButton("Editar");
		editar.setToolTipText("Editar o arquivo");
		novo= new JButton("Novo");
		novo.setToolTipText(" Novo arquivo");
		cancelar= new JButton("Cancelar");
		cancelar.setToolTipText("Cancelar");
		apagar= new JButton("Apagar");
		apagar.setToolTipText("Apagar arquivo");

		p1= new JPanel();
		p1.setBounds(190,220,600,40);
		p1.setLayout(new FlowLayout(0));
		p1.add(salvar);
		p1.add(editar);
		p1.add(novo);
		p1.add(cancelar);
		p1.add(apagar);

		getContentPane().add(p1);

	}

}	