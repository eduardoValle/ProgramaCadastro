package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

public class Botoes extends BotoesStyle{
	
	public Botoes(){
		
		venda.addActionListener(new BotaoVenda());
		clientes.addActionListener(new BotaoClientes());
		produtos.addActionListener(new BotaoProdutos());
		funcionarios.addActionListener(new Botaofuncionarios());
		relatorios.addActionListener(new BotaoRelatorios());
		
		pesquisa.addFocusListener(new Pesquisa());
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
		
			Clientes cli = new Clientes();			
			tudo.remove(fundo);
			tudo.add(cli.fundo);
/*			fundo.add(cli.tabelaClientes.tabela.getTableHeader(), BorderLayout.PAGE_START);
			fundo.add(cli.tabelaClientes.tabela, BorderLayout.CENTER);
*/
			
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
	
	/*******************************
	 *   GERENCIMENTO DE PESQUISA *
	*******************************/
		
	class BotaoIr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = pesquisa.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class Pesquisa implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			if(pesquisa.getText().equals("Pesquisar!!")){
				pesquisa.setText("");
			}			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			if(pesquisa.getText().equals("")){
				pesquisa.setText("Pesquisar!!");
			}			
		}		
	}
}