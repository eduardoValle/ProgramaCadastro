package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ProdutoCadastro extends ProdutoCadastroStyle {

	public ProdutoCadastro(){
		
		salvar.addActionListener(new BotaoSalvar());
	}

	class BotaoSalvar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String act = salvar.getText();

			JOptionPane.showMessageDialog(null, act);

		}
	}

	public static void main(String[] args) {
		new ProdutoCadastro().setVisible(true);
	}
}