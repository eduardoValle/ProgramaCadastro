package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


@SuppressWarnings("serial")
public class CRUD extends MenuLista{
	
	String url = "jdbc:mysql://localhost:3306/programa_cadastro";
	
	public String[][] Ler(String tabela){
		
		String sql = "SELECT * FROM "+tabela;
		
		String [][] array;
		try(	
			Connection conexao = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stm = conexao.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()
		){
			
			ResultSetMetaData rsm = rs.getMetaData();
			rs.last();
			int Nlinhas = rs.getRow();
			rs.beforeFirst();
			
			array = new String [Nlinhas][rsm.getColumnCount()];
			
			while(rs.next()){
				
				for(int k = 0; k < rsm.getColumnCount(); k++){
					
					array [rs.getRow()-1][k] = rs.getString(k+1);	
				}
			}	
	 	 	
		}catch(Exception e){                              // APAGAR NA VERSÃO FINAL
	
			System.out.println(e);
			return null;
		}
		return array;
	}	
	
	public void Deletar(String tabela, String campo, String valor){
		
		String sql = "DELETE FROM "+tabela+" WHERE "+campo+" =?";
				
		try(
			Connection conexao = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.setString(1, valor);
			stm.executeUpdate();
			
		}catch(Exception e){                              // APAGAR NA VERSÃO FINAL
	
			System.out.println(e);
		}	
	}
}