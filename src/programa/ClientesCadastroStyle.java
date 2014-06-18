package programa;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ClientesCadastroStyle extends JComboBoxEstadosCidades {

	JTextField nome, endereco, bairro;//cep, cpf, dataNascim, tel;
	JLabel nomeL, enderecoL, bairroL, cidadeL, estadoL, cepL, cpfL, dataNascimL, telL;
	JFormattedTextField cep, tel, cpf, dataNascim;
	MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradataNascim;
	JButton salvar, limpar;
	JPanel cliente;
	JRadioButton sexo;
	String Estado, Cidade;
		
	Toolkit toolkit = Toolkit.getDefaultToolkit();        //Pegando as dimensões da tela
	final Dimension scrnsize = toolkit.getScreenSize();  
	int width = (int)scrnsize.getWidth();                // Pegando a largura
	int heigth = (int)scrnsize.getHeight()-40;  		//  Pegando a a

	String url = "jdbc:mysql://localhost:3306/programa_cadastro";
	
        public ClientesCadastroStyle() {
		
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

		}
		);
	
		
		cliente = new JPanel();
		cliente.setBounds(0, 66, width, heigth-85);  
		cliente.setLayout(null);

		getContentPane().add(cliente);
		
		nomeL = new JLabel();
		nomeL.setText("Nome:");
		nomeL.setBounds(20, 30, 80, 30);

		nome = new JTextField();
		nome.setBounds(20, 60, 200, 20);
		nome.setToolTipText("digite seu nome");

		
		enderecoL = new JLabel();
		enderecoL.setText("Endereço:");
		enderecoL.setBounds(20,80, 80, 30);

		endereco = new JTextField();
		endereco.setBounds(20,105, 200, 20);
		endereco.setToolTipText("digite seu endereço");
		
		cidadeL = new JLabel();
		cidadeL.setText("Cidade:");
		cidadeL.setBounds(180,120, 50, 30);
		
		cidades = new JComboBox<String>();// CRIAÇÃO  
		cidades.setBounds(180,145, 140, 20);
		cidades.addItem("Escolha");
		
		
		estadoL = new JLabel();
		estadoL.setText("Estado:");
		estadoL.setBounds(20,120, 50, 30);
		
		estados = new JComboBox<String>();// CRIAÇÃO  
		estados.setBounds(20,145, 140, 20);
		estados.addItem("Escolha");
		Estado = (String)estados.getSelectedItem();
		ListarEstados();
		
		
		
		
		estados.addActionListener(
			      new ActionListener(){
			        public void actionPerformed(ActionEvent e){
			        	String dados [] = String.valueOf(estados.getSelectedItem()).split(" - ");
				        if(!dados[0].equalsIgnoreCase("Escolha")){
				            cidades.removeAllItems();
				            cidades.addItem("Escolha");
				            Cidade = (String)cidades.getSelectedItem();
				            ListarCidades(dados[0]);
				    		
				        }}}
			      
			    );

			
		Estado = (String) estados.getSelectedItem();
		
		bairroL = new JLabel();
		bairroL.setText("Bairro:");
		bairroL.setBounds(240,80, 80, 30);

		bairro = new JTextField();
		bairro.setBounds(240,105, 100, 20);
		bairro.setToolTipText("digite seu bairro");

		cepL = new JLabel();
		cepL.setText("Cep:");
		cepL.setBounds(360, 80, 30, 30);

		//cep = new JTextField();
		try {
			mascaracep = new MaskFormatter("#####-###");
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		mascaracep.setPlaceholderCharacter('_');  
		cep  = new JFormattedTextField(mascaracep); 
		cep.setBounds(360, 105, 100, 20);
		cep.setToolTipText("digite seu cep");


		cpfL = new JLabel();
		cpfL.setText("Cpf:");
		cpfL.setBounds(20, 200, 50, 30);

		//cpf = new JTextField();
		
        try {
			mascaracpf = new MaskFormatter("###.###.###-##");
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
        mascaracpf.setPlaceholderCharacter('_');  
        cpf  = new JFormattedTextField(mascaracpf);  
		cpf.setBounds(20, 225, 100, 20);
		cpf.setToolTipText("digite seu cpf");


		dataNascimL = new JLabel();
		dataNascimL.setText("Data de nascimento:");
		dataNascimL.setBounds(20, 160, 120, 30);
		
		try {
			mascaradataNascim = new MaskFormatter("##/##/####");
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
        mascaradataNascim.setPlaceholderCharacter('_'); 
        dataNascim = new JFormattedTextField(mascaradataNascim); 
		
        //dataNascim = new JTextField();
		dataNascim.setBounds(20, 185, 100, 20);
		dataNascim.setToolTipText("Dia (dd)");


		telL = new JLabel();
		telL.setText("Telefone:");
		telL.setBounds(20, 240, 60, 30);

		//tel = new JTextField();

        try {
			mascaratel = new MaskFormatter("(##)####-####");
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
        mascaratel.setPlaceholderCharacter('_'); 
        tel  = new JFormattedTextField(mascaratel); 
		tel.setBounds(20, 265, 100, 20);
		tel.setToolTipText("digite seu telefone");


		salvar = new JButton();
		salvar.setText("Salvar");
		salvar.setToolTipText("aperte para salvar");
		salvar.setBounds(200, 280, 100, 20);

		limpar = new JButton();
		limpar.setText("Limpar");
		limpar.setToolTipText("aperte para limpar os dados");
		limpar.setBounds(310, 280, 100, 20);
		
		limpar.addActionListener(
			      new ActionListener(){
			        public void actionPerformed(ActionEvent e){
			        	nome.setText(null);
			        	endereco.setText(null);
			        	bairro.setText(null);
			        	cep.setText(null);
			        	cpf.setText(null);
			        	dataNascim.setText(null);
			        	tel.setText(null);
			        	estados.setSelectedItem("Escolha"); 	
				    	cidades.setSelectedItem("Escolha"); 	
			       
				        }}
			      
			    );
				
		cliente.add(nome);
		cliente.add(nomeL);

		cliente.add(endereco);
		cliente.add(enderecoL);

		cliente.add(bairro);
		cliente.add(bairroL);

		cliente.add(cidades);
		cliente.add(cidadeL);

		cliente.add(estados);
		cliente.add(estadoL);

		cliente.add(cep);
		cliente.add(cepL);

		cliente.add(cpf);
		cliente.add(cpfL);

		cliente.add(dataNascim);
		cliente.add(dataNascimL);

		
		cliente.add(tel);
		cliente.add(telL);

		cliente.add(salvar);
		cliente.add(limpar);

}	            
		            
		        
	       // estados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha" }));

}

