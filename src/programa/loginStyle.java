package programa;

import java.awt.Color;

import javax.swing.BorderFactory;
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

	public LoginStyle()	{

		// Style janela

		setTitle("Realize o login para ter acesso ao conteúdo do programa");
		setBounds(300, 150, 600, 450);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);				//  Arruma o botão de fechar
		
		
		JPanel tudoLogin = new JPanel();       		   // Envolve TODA a janela!!
		tudoLogin.setBounds(0, 0, 603, 453);
//		tudoLogin.setBackground(new Color(205, 92, 92));  		     // descomente a cor para ver a onde está o JPanel
		tudoLogin.setLayout(null);
		
		
		getContentPane().add(tudoLogin);	
		
		
		//  Style Campos

		JLabel loginL = new JLabel();
		loginL.setText("Login");
		loginL.setBounds(100, 100, 350, 20);
		
		
		login = new JTextField();
		login.setBounds(100, 130, 350, 25);
		


		JLabel senhaL = new JLabel();
		senhaL.setText("Senha");
		senhaL.setBounds(100, 170, 350, 20);

		senha = new JPasswordField();
		senha.setBounds(100, 200, 350, 25);
	
		

		logar = new JButton();
		logar.setBounds(100, 260, 100, 25);
		logar.setText("Logar-se");
		loginL.setVisible(true);

		// Colocando os Campos visíveis
		
		tudoLogin.add(loginL);
		tudoLogin.add(login);
		tudoLogin.add(senhaL);
		tudoLogin.add(senha);
		tudoLogin.add(logar);

		
		/***********************
        	CAMPOS DE AVISO 
		***********************/

		int opcao = 3;
		String mensagem = "";
		Color corAlerta = new Color(135, 206, 235);


		JPanel alerta = new JPanel();
		alerta.setBounds(100, 20, 350, 40);
		alerta.setLayout(null);			

		JLabel janelaAlerta = new JLabel();
		janelaAlerta.setBounds(20, 0, 350, 40);

		switch (opcao){

		case 1:
			corAlerta = new Color(135, 206, 235);
			alerta.setBorder(BorderFactory.createLineBorder(Color.blue,3));
			mensagem = "Para o primeiro login digite: Login adm e senha 1234";

			break;

		case 2:

			corAlerta = new Color(255, 193, 193);
			alerta.setBorder(BorderFactory.createLineBorder(Color.red,3));
			mensagem = "Login e/ou senha incorretos!!";

			break;

		case 3:

			corAlerta = new Color(152, 251, 152);
			alerta.setBorder(BorderFactory.createLineBorder(new Color(0, 100, 0),3));
			mensagem = "Login efetuado!!";

			break;

		} 

		janelaAlerta.setText(mensagem);
		alerta.setBackground(corAlerta);

		alerta.add(janelaAlerta);
		tudoLogin.add(alerta);

	}

}