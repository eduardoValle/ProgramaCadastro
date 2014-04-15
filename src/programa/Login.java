package programa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;

public class Login extends LoginStyle{

	static String url = "jdbc:mysql://localhost:3306/programa_cadastro";

	public Login(){

		logar.addActionListener(new BotaoLogar());

	}

	/************************************************
	 * Retorna false se os campos estiverem vazios *
	 ************************************************/

	public boolean camposVazios(){
		String pass = new String(senha.getPassword());
		if(login.getText().equals("") || pass.equals("")){

			return false;

		}else{
			return true;
		}
	}


	/********************************
	 * IMPLEMENTANDO O BOTÃO LOGAR *
	 ********************************/

	class BotaoLogar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			if(camposVazios()){
				ArrayList<String> lista = new ArrayList<>();

				String pass = new String(senha.getPassword());			
				String sql = "SELECT * FROM login WHERE login= '"+login.getText()+"' " + "AND senha= '"+pass+"'";  
				try(	
					Connection conexao = DriverManager.getConnection(url, "root", "root");
					PreparedStatement stm = conexao.prepareStatement(sql);
					ResultSet rs = stm.executeQuery(sql);
				){
					
					while(rs.next()){

						lista.add(rs.getString("login"));
						lista.add(rs.getString("senha"));

					}

					if(lista.get(0).equals(login.getText()) && lista.get(1).equals(pass)){

						// CONSEGUIU LOGAR

						new MenuMeio().setVisible(true);

					}

				}catch(IndexOutOfBoundsException g){   // NÃO CONSEGUIU LOGAR

					janelaAlerta.setText("Login ou senha incorretos, ou não existem!!");
					alerta.setBorder(BorderFactory.createLineBorder(Color.red,3));
					alerta.setBackground(new Color(255, 193, 193));

					alerta.add(janelaAlerta);
					tudoLogin.add(alerta);

				}catch(SQLException g){    //  DELETAR NA FASE FINAL ESSE CATCH

					System .out.println(g);

				}

			}else{     // fechando if(camposVazios){}

				janelaAlerta.setText("Você prêcisa preencher ambos os campos!!");
				alerta.setBorder(BorderFactory.createLineBorder(Color.red,3));
				alerta.setBackground(new Color(255, 193, 193));

				alerta.add(janelaAlerta);
				tudoLogin.add(alerta);

			}
		}
	}

	public static void main(String arg[]){ 
		new Login().setVisible(true);
	}

}


