package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AcessoBanco {
	
	static String url = "jdbc:mysql://localhost:3306/programa_cadastro";

	
	public static void	AcessoBanco(){		
		
		String sql = "insert into login (login, senha) values ('ehheheheeheh!', 'ohohohohohohoh!')";
		
		try(
			Connection conexao = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stm = conexao.prepareStatement(sql);								
			){
		stm.executeUpdate();
			
			
			System.out.println("Deu!! =D");
			
		}catch(SQLException e){
			
			System.out.println("Não deu!! " + e);

		}catch(Exception h){
			
			System.out.println(h);

		}
	}

	
	/*************************************
	 	AQUI COMEÇA AS FUNÇOES "CRUD"
	 * @throws SQLException 
	*************************************/
	
	// LER
	
	public static List<String> Ler (String tabela){
		ArrayList<String> lista = new ArrayList<>(); 
		
		String sql = "SELECT * FROM "+ tabela;
		try(
				
			Connection conexao = DriverManager.getConnection(url, "root", "root");
			PreparedStatement stm = conexao.prepareStatement(sql);
			ResultSet rs = stm.executeQuery(sql)){
			while(rs.next()){
				lista.add(rs.getString("login"));
				lista.add(rs.getString("senha"));
				
			}
	
		}catch(SQLException e){
			
			System .out.println(e);
			
			return null;	
		}
				
		return lista;	
	
	}	
	
	
	public static void main(String[] args){
		System.out.println(Ler("login"));
		
	//	Ler("login");
	//	AcessoBanco();
		
	}
			
}
