package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ClientesCadastro extends ClientesCadastroStyle{
	
	String url = "jdbc:mysql://localhost:3306/programa_cadastro";
	
	String Tnome, Tendereco, Tbairro, Tcidade, Testado, Tcep, Tcpf, Tdata, Ttel;
	
	public ClientesCadastro(){
		
		
		salvar.addActionListener(new BotaoSalvar());
	}
	
	
	/**************************************
	 * CADASTRA ITENS NO BANCO DE DADOS *
	 *************************************/
	
	public void Cadastrar (ClientesConstrutor clientes){
		
		String sql = "insert into cliente (nome, endereco, bairro, cidade, estado, cep, cpf, telefone) values (?,?,?,?,?,?,?,?)";
		
		try(
			Connection conexao = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stm = conexao.prepareStatement(sql)
		){
			
			stm.setString(1, clientes.Tnome);
			stm.setString(2, clientes.Tendereco);
			stm.setString(3, clientes.Tbairro);	
			stm.setString(4, clientes.Tcidade);
			stm.setString(5, clientes.Testado);
			stm.setString(6, clientes.Tcep);
			stm.setString(7, clientes.Tcpf);
		//	stm.setString(8, clientes.Tdata);
			stm.setString(8, clientes.Ttel);
			
			stm.executeUpdate();
			
			System.out.println("Deu!! =D");
			
		
		}catch(Exception e){
			
			System.out.println(e);
		}
				
	}
	
	
	/************************************************
	 * Retorna false se os campos estiverem vazios *
	 ************************************************/

	public boolean camposVazios(){

		if(nome.getText().equals("") || Tendereco.equals("") || Tbairro.equals("") || Tcidade.equals("") 
				|| Testado.equals("") || Tcep.equals("") || Tcpf.equals("") || Tdata.equals("") || Ttel.equals("")){

			return false;

		}else{
			return true;
		}
	}
	
	
	/************************************************
	 * IMPLEMENTAÇÃO DO BOTÃO SALVAR *
	 ************************************************/
	
	class BotaoSalvar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			Tnome= nome.getText();
			Tendereco= endereco.getText();
			Tbairro= bairro.getText();
			Tcidade= cidade.getText();
			Testado= estado.getText();
			Tcep= cep.getText();
			Tcpf= cpf.getText();
			Tdata= data.getText();
			Ttel = tel.getText();
			
			if(camposVazios()){
				try{
					
					ClientesConstrutor c = new ClientesConstrutor(Tnome, Tendereco, Tbairro, Tcidade, Testado, Tcep, Tcpf, Tdata, Ttel);
					Cadastrar(c);
			
			}catch(Exception r){
				JOptionPane.showMessageDialog(null, "Você preencheu campos com valores inválidos.");
			}
				
			}else{
				
				JOptionPane.showMessageDialog(null, "Você deixou campos em branco.");
			}
		}
	}
	
	
	public static void main(String arg[]){ 

		new ClientesCadastro().setVisible(true);
		
		CRUD crud = new CRUD();
		crud.Ler("cliente");
	
	}
}
