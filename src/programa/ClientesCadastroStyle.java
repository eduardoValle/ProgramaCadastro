package programa;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;


public class ClientesCadastroStyle extends JFrame{

	JTextField nome, endereco, bairro, cidade, estado, cep, cpf, data, tel;
	JLabel nomeL, enderecoL, bairroL, cidadeL, estadoL, cepL, cpfL, dataL, telL;
	JButton salvar, cancelar;
	JComboBox<String> estados;
	JPanel cliente;
	JRadioButton sexo;


	public ClientesCadastroStyle(){
		setBounds(215,80, 600, 400);  
		setLayout(null);

		addWindowListener(new WindowAdapter() {  
			
			public void windowClosing(WindowEvent ev) {  
				
				int answer = JOptionPane.showConfirmDialog(ClientesCadastroStyle.this, "Deseja salvar antes de sair ?", "Close Warning", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);  
			
				if (answer == JOptionPane.YES_OPTION) {  

				} else if (answer == JOptionPane.NO_OPTION){  
					dispose();  
				} else if (answer == JOptionPane.CANCEL_OPTION){ 
					
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}  

			//	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
			}  

		}); 



		cliente = new JPanel();
		cliente.setBounds(0, 0, 662, 535);  
		cliente.setLayout(null);

		getContentPane().add(cliente);
		
		
		nomeL = new JLabel();
		nomeL.setText("Nome:");
		nomeL.setBounds(40, 30, 80, 30);

		nome = new JTextField();
		nome.setBounds(120, 35, 200, 20);
		nome.setToolTipText("digite seu nome");

		
		enderecoL = new JLabel();
		enderecoL.setText("Endereço:");
		enderecoL.setBounds(40, 60, 80, 30);

		endereco = new JTextField();
		endereco.setBounds(120, 65, 200, 20);
		endereco.setToolTipText("digite seu endereço");

		
		bairroL = new JLabel();
		bairroL.setText("Bairro:");
		bairroL.setBounds(330, 60, 80, 30);

		bairro = new JTextField();
		bairro.setBounds(380,65, 100, 20);
		bairro.setToolTipText("digite seu bairro");

		
		cidadeL = new JLabel();
		cidadeL.setText("Cidade:");
		cidadeL.setBounds(40,90, 80, 30);

		cidade = new JTextField();
		cidade.setBounds(120, 95, 200, 20);
		cidade.setToolTipText("digite sua cidade");


		estadoL = new JLabel();
		estadoL.setText("Estado:");
		estadoL.setBounds(330, 90, 150, 30);

		estado = new JTextField();
		estado.setBounds(380, 95, 40, 20);
		estado.setToolTipText("digite seu estado");


		cepL = new JLabel();
		cepL.setText("Cep:");
		cepL.setBounds(40, 120, 30, 30);

		cep = new JTextField();
		cep.setBounds(120, 125, 100, 20);
		cep.setToolTipText("digite seu cep");


		cpfL = new JLabel();
		cpfL.setText("Cpf:");
		cpfL.setBounds(40, 150, 50, 30);

		cpf = new JTextField();
		cpf.setBounds(120, 155, 100, 20);
		cpf.setToolTipText("digite seu cpf");


		dataL = new JLabel();
		dataL.setText("Data de nascimento:");
		dataL.setBounds(255, 150, 130, 30);

		data = new JTextField();
		data.setBounds(381, 155, 90, 20);
		data.setToolTipText("Dia (dd)");


		telL = new JLabel();
		telL.setText("Telefone:");
		telL.setBounds(40, 180, 60, 30);

		tel = new JTextField();
		tel.setBounds(120, 185, 100, 20);
		tel.setToolTipText("digite seu telefone");


		salvar = new JButton();
		salvar.setText("Salvar");
		salvar.setToolTipText("aperte para salvar");
		salvar.setBounds(200, 280, 100, 30);

		cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setToolTipText("aperte para cancelar");
		cancelar.setBounds(310, 280, 100, 30);

		cliente.add(nome);
		cliente.add(nomeL);

		cliente.add(endereco);
		cliente.add(enderecoL);

		cliente.add(bairro);
		cliente.add(bairroL);

		cliente.add(cidade);
		cliente.add(cidadeL);

		cliente.add(estado);
		cliente.add(estadoL);

		cliente.add(cep);
		cliente.add(cepL);

		cliente.add(cpf);
		cliente.add(cpfL);

		cliente.add(data);
		cliente.add(dataL);

		
		cliente.add(tel);
		cliente.add(telL);

		cliente.add(salvar);
		cliente.add(cancelar);


	}
}