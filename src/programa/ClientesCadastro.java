package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import construtores.ClientesConstrutor;


public class ClientesCadastro extends ClientesCadastroStyle{
	
	String url = "jdbc:mysql://localhost:3306/programa_cadastro";
	
	protected String Tnome, Tendereco, Testado, Tbairro, Tcidade, Tcep, Tcpf, TdataNascim, Ttel;

	
	public ClientesCadastro(){		
		
		salvar.addActionListener(new BotaoSalvar());
	}
	
	
	/**************************************
	 * CADASTRA ITENS NO BANCO DE DADOS *
	 *************************************/
	
	public void Cadastrar (ClientesConstrutor clientes){
		
		String sql = "insert into cliente (nome, endereco, Cidade, bairro, Estado, cep, telefone , cpf, dataNascimento) values (?,?,?,?,?,?,?,?,?)";
		
		try(
			Connection conexao = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stm = conexao.prepareStatement(sql);
		){
			
			stm.setString(1, clientes.Tnome);
			stm.setString(2, clientes.Tendereco);
			stm.setString(3, clientes.Tcidade);	
			stm.setString(4, clientes.Tbairro);
			stm.setString(5, clientes.Testado);
			stm.setString(6, clientes.Tcep);
			stm.setString(7, clientes.Ttel);
			stm.setString(8, clientes.Tcpf);
			stm.setString(9, clientes.TdataNascim);
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
				||Testado.equals("")||  Tcep.equals("") || Ttel.equals("")||Tcpf.equals("") || TdataNascim.equals("")  ){

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
			Tcidade= (String)cidades.getSelectedItem();
			Testado =(String) estados.getSelectedItem();
			Tcep= cep.getText();
			Ttel = tel.getText();
			Tcpf= cpf.getText();
			TdataNascim= dataNascim.getText();
						
			
			if(camposVazios()){
				try{
					
					ClientesConstrutor c = new ClientesConstrutor(Tnome, Tendereco, Tcidade, Tbairro, Testado, Tcep, Ttel ,Tcpf, TdataNascim);
					Cadastrar(c);
			
			}catch(Exception r){
				JOptionPane.showMessageDialog(null, "Você preencheu campos com valores inválidos.");
			}
				nome.setText(null);
	        	endereco.setText(null);
	        	bairro.setText(null);
	        	cep.setText(null);
	        	cpf.setText(null);
	        	dataNascim.setText(null);
	        	tel.setText(null);
	        	estados.setSelectedItem("Escolha"); 	
		    	cidades.setSelectedItem("Escolha"); 
		    	
		    	String s = "Salvo com sucesso !";
				
				JOptionPane.showMessageDialog(null, s);
				
			}else{
				
				JOptionPane.showMessageDialog(null, "Você deixou campos em branco.");
			}
			
			//LIMPA OS CAMPOS DO CADASTRO DE CLIENTES APOS SALVAR
			
		}
	}
	
	
	public static void main(String arg[]){ 

		new ClientesCadastro().setVisible(true);		
		CRUD crud = new CRUD();
		crud.Ler("cliente");
	
	}
}