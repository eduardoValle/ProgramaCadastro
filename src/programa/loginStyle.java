package programa;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class loginStyle extends JFrame{
	
	JTextField     login;
	JPasswordField senha;
	JLabel loginL, senhaL;
	JButton logar;
	
	public loginStyle()	{
		
		// Style janela
		
		setTitle("Realize o login para ter acesso ao conteúdo do programa");
		setLocation(300, 150);
		setSize(600, 450);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar
		
		//  Style Campos
		
		JLabel loginL = new JLabel();
		loginL.setText("Login");
		loginL.setBounds(100, 100, 350, 20);
		
		JTextField login = new JTextField();
		login.setBounds(100, 130, 350, 25);
		
		JLabel senhaL = new JLabel();
		senhaL.setText("Senha");
		senhaL.setBounds(100, 170, 350, 20);
		
		JPasswordField senha = new JPasswordField();
		senha.setBounds(100, 200, 350, 25);
		
		JButton logar = new JButton();
		logar.setBounds(100, 260, 100, 25);
		logar.setText("Logar-se");
		
		
		// Colocando os Campos visíveis
		
		getContentPane().add(loginL);
		getContentPane().add(login);
		getContentPane().add(senhaL);
		getContentPane().add(senha);
		getContentPane().add(logar);
		
				
		
	}
	
	
	public static void main(String arg[]){ 
		new loginStyle().setVisible(true);
	}
}