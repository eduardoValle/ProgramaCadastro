package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MenuMeio extends MenuMeioStyle{
	
	public MenuMeio(){
		
		novoVenda.addActionListener(new BotaoNovoVenda());
		novoCliente.addActionListener(new BotaoNovoCliente());
		novoProduto.addActionListener(new BotaoNovoProduto());
		novoFuncionario.addActionListener(new BotaoNovoFuncionario());
		novoRelatorioVendas.addActionListener(new BotaoNovoRelatorioVendas());
		novoRelatorioProdutos.addActionListener(new BotaoNovoRelatorioProdutos());
	}
	
	class BotaoNovoVenda implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = novoVenda.getText();
			
/*			ClientesCadastro c = new ClientesCadastro();
			fundo.add(c.cliente);*/
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
		
	class BotaoNovoCliente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		/*	String s = novoCliente.getText();
			JOptionPane.showMessageDialog(null, s);*/
		
			ClientesCadastro cli = new ClientesCadastro();
			tudo.remove(fundo);
			tudo.add(fundo);
			fundo.add(cli.cliente);
		}		
	}
	
	class BotaoNovoProduto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = novoProduto.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class BotaoNovoFuncionario implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = novoFuncionario.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	class BotaoNovoRelatorioVendas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = novoRelatorioVendas.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	//  Acao Botão Relatorio Produtos
	
	class BotaoNovoRelatorioProdutos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = novoRelatorioProdutos.getText();
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
	
	public static void main(String arg[]){ 

		MenuMeio m = new MenuMeio();
		m.setVisible(true);
//		m.menuMeio.setVisible(true);
	}
}