package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxEstadosCidades extends JFrame{
	
	JComboBox<String> estados,cidades;
	
	public void   ListarEstados (){
	       try {
	           
	            String usuario ="root";
	            String senha  = "root";
	            String url = "jdbc:mysql://localhost:3306/programa_cadastro";
	            
	            //conexao com o banco de dados
	            Connection conexao = DriverManager.getConnection(url,usuario,senha);
	           //String contendo o comando de seleçao de dados do BD
	            String sql = "SELECT * FROM tb_estados";
	            //Prepara para executar um comando SQL
	            PreparedStatement comando = conexao.prepareStatement(sql);
	            //Armazena o resultado da consulta
	            ResultSet resultado = comando.executeQuery();
	            
	            while(resultado.next()){
	                
	                estados.addItem(String.valueOf(resultado.getInt("cod_estado")) +" -  " + resultado.getString("estado"));
	                
	            }
	            
	       }
	       catch(Exception e){
	           e.printStackTrace();
	       }
	       
	   }

	 public void   ListarCidades (String codEstado){
	       try {
	           
	            String usuario ="root";
	            String senha  = "root";
	            String url = "jdbc:mysql://localhost:3306/programa_cadastro";
	            
	            //conexao com o banco de dados
	            Connection conexao = DriverManager.getConnection(url,usuario,senha);
	           //String contendo o comando de seleçao de dados do BD
	            String sql = "SELECT * FROM tb_cidades WHERE estado = ?";
	            //Prepara para executar um comando SQL
	            PreparedStatement comando = conexao.prepareStatement(sql);
	            comando.setInt(1,Integer.parseInt(codEstado));
	            //Armazena o resultado da consulta
	            ResultSet resultado = comando.executeQuery();
	            
	            while(resultado.next()){
	                
	                cidades.addItem(" - " + resultado.getString("cidade"));
	                //String.valueOf(resultado.getInt("cod_cidades"))+
	                
	            }
	            
	       }
	       catch(Exception e){
	           e.printStackTrace();
	       }
	 }

	
	
	
}

//Essa parte é meio que uma gambiarra


/*	private void estados.ActionPerformed() {                                                 

String dados [] = String.valueOf(estados.getSelectedItem()).split(" - ");
if(!dados[0].equalsIgnoreCase("Escolha")){
    cidades.removeAllItems();
    cidades.addItem("Escolha");
    ListarCidades(dados[0]);
	Cidade = (String)cidades.getSelectedItem();
}
}
*/




