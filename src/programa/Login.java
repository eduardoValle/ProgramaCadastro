package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends LoginStyle{
	
	public Login(){
		
		logar.addActionListener(new BotaoLogar());
		
	}
	
	class BotaoLogar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = "Login: " + login.getText()+
					"\n Senha: " + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
	
	public static void main(String arg[]){ 
		new Login().setVisible(true);
	}

}


