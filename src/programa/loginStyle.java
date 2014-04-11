package programa;

import java.awt.*;
import javax.swing.*;

public class loginStyle extends Style{


	public loginStyle()	{

		/*// Style janela
		setTitle("Realize o login para ter acesso ao conteúdo do programa");
		setBounds(300, 150, 600, 450);
		setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
		setUndecorated(true);                                         // com false abre frame dentro de um frame
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);				//  Arruma o botão de fechar
		*/

		Color corTudo   = new Color(205, 92, 92); 
		
		JPanel tudoLogin = new JPanel();       		   // Envolve TODA a janela!!
		tudoLogin.setBounds(0, 0, 603, 453);
//		tudoLogin.setBackground(corTudo);  		     // descomente a cor para ver a onde está o JPanel
		tudoLogin.setLayout(null);
		
		
		getContentPane().add(tudoLogin);	
		
		
		//  Style Campos

		JLabel loginL = new JLabel();
		loginL.setText("Login");
		loginL.setBounds(250, 180, 350, 20);
				
		JTextField login = new JTextField();
		login.setBounds(250, 210, 350, 25);
		
		JLabel senhaL = new JLabel();
		senhaL.setText("Senha");
		senhaL.setBounds(250, 250, 350, 20);

		JPasswordField senha = new JPasswordField();
		senha.setBounds(250, 280, 350, 25);
			
		JButton logar = new JButton();
		logar.setBounds(370, 320, 100, 25);
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

		int opcao = 1;
		String mensagem = "";
		Color corAlerta = new Color(135, 206, 235);


		JPanel alerta = new JPanel();
		alerta.setBounds(250, 120, 350, 40);
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


	public static void main(String arg[]){ 
		new loginStyle().setVisible(true);;
	}
}