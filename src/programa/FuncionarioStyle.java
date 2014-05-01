package programa;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FuncionarioStyle extends Funcionario {

	JLabel Nome,RG,CPF,Sexo,DataN,Telefone,Celular,email,Cidade,CEP,Bairro,cargo,salario,horario;
	JTextField tNome,tRG,tCPF,tSexo,tdataN,tTelefone,tCelular,temail,tCidade,tCEP,tBairro,thorario,tsalario,tcargo,painel;
	String names[]={"Masculino","Femenino","Indefinido"};
	JComboBox c1;
	
	
public FuncionarioStyle (){
	    
	    setBounds(200,50,830,400); 
        setTitle("Cadastro de Funcionarios");
	    getContentPane().setLayout(null);
		
	    Nome = new JLabel("Nome:");
		Nome.setBounds(20, 10, 50, 25);
		getContentPane().add(Nome);
		tNome=new JTextField();
		tNome.setBounds(65, 10, 330, 25);
		getContentPane().add(tNome);
		
		RG=new JLabel("RG:");
		RG.setBounds(403, 10, 40, 25);
		getContentPane().add(RG);
		tRG=new JTextField();
		tRG.setBounds(460, 10, 130, 25);
		getContentPane().add(tRG);
		
		CPF =new JLabel("CPF:");
		CPF.setBounds(600, 12, 40, 20);
		getContentPane().add(CPF);
		tCPF=new JTextField();
		tCPF.setBounds(650, 10, 141, 25);
		getContentPane().add(tCPF);
		
	
		
		
		Sexo=new JLabel("Sexo:");
		Sexo.setBounds(20, 82, 35, 25);
		getContentPane().add(Sexo);
		c1=new JComboBox(names);
		c1.setModel(new DefaultComboBoxModel(new String[] {" Masculino", " Femenino", " Indefinido"}));
		c1.setBounds(65, 82, 100, 25);
		getContentPane().add(c1);
		
		
		DataN=new JLabel("Data Nascimento:");
		DataN.setBounds(20, 46, 100, 25);
		getContentPane().add(DataN);
		tdataN=new JTextField();
		tdataN.setBounds(123, 46, 121, 25);
		getContentPane().add(tdataN);
		  
		
		Telefone=new JLabel("Telefone:");
		Telefone.setBounds(403, 46, 60, 25);
		getContentPane().add(Telefone);
		tTelefone=new JTextField();
		tTelefone.setBounds(460, 46, 131, 25);
		getContentPane().add(tTelefone);
		
		Celular=new JLabel("Celular:");
		Celular.setBounds(599, 46, 50, 25);
		getContentPane().add(Celular);
		tCelular=new JTextField();
		tCelular.setBounds(650, 46, 141, 25);
		getContentPane().add(tCelular);
		
		email=new JLabel("E-mail:");
		email.setBounds(403, 82, 60, 25);
		getContentPane().add(email);
		temail=new JTextField();
		temail.setBounds(460, 82, 331, 25);
		getContentPane().add(temail);
		
	
		CEP=new JLabel("CEP:");
		CEP.setBounds(403, 118, 29, 25);
		getContentPane().add(CEP);
		tCEP=new JTextField();
		tCEP.setBounds(460, 118, 130, 25);
		getContentPane().add(tCEP);
		
		Cidade=new JLabel("Cidade:");
		Cidade.setBounds(20, 118, 50, 25);
		getContentPane().add(Cidade);
		tCidade=new JTextField();
		tCidade.setBounds(65, 118, 150, 25);
		getContentPane().add(tCidade);
		
		Bairro =new JLabel("Bairro:");
		Bairro.setBounds(222, 118, 80, 25);
		getContentPane().add(Bairro);
		tBairro=new JTextField();
		tBairro.setBounds(265, 118, 130, 25);
		getContentPane().add(tBairro);
		
		horario=new JLabel("Horario:");
		horario.setBounds(599, 118, 50, 25);
		getContentPane().add(horario);
		thorario= new JTextField();
		thorario.setBounds(650, 118, 141, 25);
		getContentPane().add(thorario);
		
		cargo=new JLabel("Cargo ocupado:");
		cargo.setBounds(20, 154, 100 , 25);
		getContentPane().add(cargo);
		tcargo=new JTextField();
		tcargo.setBounds(123, 154, 272, 25);
		getContentPane().add(tcargo);
		
		salario=new JLabel("Salario recebido:");
		salario.setBounds(403, 154, 107, 25);
		getContentPane().add(salario);
		tsalario=new JTextField();
		tsalario.setBounds(507, 154, 95, 25);
		getContentPane().add(tsalario);
            }
		public static void main(String arg[]){
			
		new FuncionarioStyle().setVisible(true);
	}
}