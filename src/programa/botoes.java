package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import programa.Login.BotaoLogar;

public class Botoes extends BotoesStyle{
	
	public Botoes(){
		
		venda.addActionListener(new BotaoVenda());
		clientes.addActionListener(new BotaoClientes());
		produtos.addActionListener(new BotaoProdutos());
		funcionarios.addActionListener(new Botaofuncionarios());
		relatorios.addActionListener(new BotaoRelatorios());
		ir.addActionListener(new BotaoIr());
		
		
	}
	
	
	class BotaoVenda implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = venda.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class BotaoClientes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = clientes.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class BotaoProdutos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = produtos.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class Botaofuncionarios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = funcionarios.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class BotaoRelatorios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = relatorios.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class BotaoIr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = pesquisa.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}

}




