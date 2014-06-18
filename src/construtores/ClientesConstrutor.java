package construtores;

import programa.ClientesCadastro;

@SuppressWarnings("serial")
public class ClientesConstrutor extends ClientesCadastro{
	
public ClientesConstrutor(String nome, String endereco, String cidade, String bairro, String estado, String cep, String tel, String cpf, String data){
		
		this.Tnome = nome;
		this.Tendereco = endereco;
		this.Tbairro = bairro;
		this.Tcidade = cidade;
		this.Testado = estado;
		this.Tcep = cep;
		this.Tcpf = cpf;
		this.Ttel = tel;
	}
	
	@Override
	public String toString(){
		
		return Tnome+", "+Tendereco+", "+Tbairro+", "+Tcidade+", "+Testado+", "+Tcep+", "+Tcpf+", "+Ttel;
		
	}

}