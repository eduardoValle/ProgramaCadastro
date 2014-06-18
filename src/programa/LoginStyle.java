package programa;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginStyle extends JFrame {

	JTextField login;
	JPasswordField senha;
	JButton logar;
	JPanel tudoLogin;
	JPanel alerta;
	JLabel janelaAlerta;
	JPanel fundo = new JPanel();

	public LoginStyle()	{

		// Style janela
		setBounds(200, 40, 900, 620);
		setTitle("Realize o login para ter acesso ao conteúdo do programa");											 
		setUndecorated(false);                                         // com false abre frame dentro de um frame
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar	
		
		tudoLogin = new JPanel();       		   // Envolve TODA a janela!!
		tudoLogin.setBounds(270, 170, 350, 200);
		tudoLogin.setLayout(null);		
		getContentPane().add(tudoLogin);
//		tudoLogin.setBackground(new Color(255, 255, 255));
				
		fundo.setBounds(0, 0, 900, 620);
		fundo.setBackground(new Color(112, 128, 144));
		fundo.setLayout(null);
		
		ImageIcon imagem = new ImageIcon("imagens/1.jpg");
		JLabel imagemFundo = new JLabel(imagem);
		imagemFundo.setBounds(0, 0, 900, 620);
		
		getContentPane().add(fundo);
		fundo.add(imagemFundo);
		
		//  Style Campos

		JLabel loginL = new JLabel();
		loginL.setText("CPF");
		loginL.setBounds(50, 70, 70, 25);
		
		login = new JTextField();
		login.setBounds(100, 70, 200, 25);	

		JLabel senhaL = new JLabel();
		senhaL.setText("SENHA");
		senhaL.setBounds(50, 100, 70, 25);

		senha = new JPasswordField();
		senha.setBounds(100, 100, 200, 25);
		
		logar = new JButton();
		logar.setBounds(140, 135, 70, 25);
		logar.setText("LOGIN");

		// Colocando os Campos visíveis
		
		tudoLogin.add(loginL);
		tudoLogin.add(login);
		tudoLogin.add(senhaL);
		tudoLogin.add(senha);
		tudoLogin.add(logar);
		
        //	CAMPOS DE AVISO 

		alerta = new JPanel();
		alerta.setBounds(0, 20, 350, 40);
		alerta.setLayout(null);			

		janelaAlerta = new JLabel();
		janelaAlerta.setBounds(50, 0, 350, 40);

	}
}