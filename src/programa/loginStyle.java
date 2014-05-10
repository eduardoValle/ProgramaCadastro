package programa;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class LoginStyle extends JFrame{

	JTextField login;
	JPasswordField senha;
	JButton logar;
	JPanel tudoLogin, alerta;
	JLabel janelaAlerta;

	public LoginStyle()	{

		// Style janela

		setTitle("Realize o login para ter acesso ao conteúdo do programa");
		setBounds(300, 150, 550, 400);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(false);                                         // com false abre frame dentro de um frame
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar	
		
		tudoLogin = new JPanel();       		   // Envolve TODA a janela!!
		tudoLogin.setBounds(0, 0, 540, 367);
//		tudoLogin.setBackground(new Color(205, 92, 92));  		     // descomente a cor para ver a onde está o JPanel
		tudoLogin.setLayout(null);
		
		getContentPane().add(tudoLogin);	
		
		//  Style Campos

		JLabel loginL = new JLabel();
		loginL.setText("Login");
		loginL.setBounds(90, 80, 350, 20);
		
		
		login = new JTextField();
		login.setBounds(90, 110, 350, 25);
		

		JLabel senhaL = new JLabel();
		senhaL.setText("Senha");
		senhaL.setBounds(90, 150, 350, 20);

		senha = new JPasswordField();
		senha.setBounds(90, 180, 350, 25);
	
		
		logar = new JButton();
		logar.setBounds(90, 220, 100, 25);
		logar.setText("Logar-se");

		// Colocando os Campos visíveis
		
		tudoLogin.add(loginL);
		tudoLogin.add(login);
		tudoLogin.add(senhaL);
		tudoLogin.add(senha);
		tudoLogin.add(logar);

		
        //	CAMPOS DE AVISO 

		alerta = new JPanel();
		alerta.setBounds(90, 20, 350, 40);
		alerta.setLayout(null);			

		janelaAlerta = new JLabel();
		janelaAlerta.setBounds(20, 0, 350, 40);

	}
}