package programa;



public class Clientes extends ClientesStyle{

	static String url = "jdbc:mysql://localhost:3306/programa_cadastro";


	public Clientes(){

		CarregarConteudo();

	}


	/*************************************************************
    				CARREGADOR DO CONTEÚDO   

    	Ele carrega todo o conteudo da Table 'cliente' e exibe 

	*************************************************************/

	public void CarregarConteudo(){

		CRUD crud = new CRUD();
		String [][] conteudo = crud.Ler("cliente");

		int posicao = 26;
		for(; i < conteudo.length; i++){

			Labels(posicao, conteudo, i);
			posicao += 80;
		}
	}

	
	public static void main(String arg[]){ 

		new Clientes().setVisible(true);

	}
	
}
