package programa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class ClientesStyle extends JFrame{
	
	JPanel clientes, opcoesCliente, clientesCampo[],clientesCampoNome[], clientesCampoEndereco[], TesteCampo[];
	JButton excluir[], editar[], novoCliente, pesquisarCliente;
	JLabel nome[], cargo[], endereco[], telefone[];
	JTextField campoPesquisar;

	int x = 80, i = 0;

	public ClientesStyle(){

		setTitle("Programa de Cadastro de Produtos, Funcionarios e Clientes");
		setBounds(200, 40, 900, 540);
		setLayout(null);											   
		setUndecorated(true);                                        
		getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		clientes = new JPanel();
		clientes.setBounds(5, 5, 880, 490);
		clientes.setBackground(new Color(112, 128, 144));         			   // descomente a cor para ver a onde está o JPanel
		clientes.setLayout(null);
	
		JScrollPane SP = new JScrollPane(clientes);
		SP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		SP.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(SP);

		getContentPane().add(clientes);
		
		opcoesCliente = new JPanel();
		opcoesCliente.setBounds(0, 0, 880, 25);
//		opcoesCliente.setBackground(new Color(66, 66, 66));         			   // descomente a cor para ver a onde está o JPanel
		opcoesCliente.setLayout(null);
		
		novoCliente = new JButton("Novo Cliente");
		novoCliente.setBounds(0, 0, 110, 25);
		novoCliente.setToolTipText("Cadastrar um Novo Cliente");
		
		campoPesquisar = new JTextField("Pesquisar Cliente!!");
		campoPesquisar.setToolTipText("Digite o nome de um cliente para pesquisar no banco de dados.");
		campoPesquisar.setBounds(655, 0, 200, 25);

		pesquisarCliente = new JButton("Ir");
		pesquisarCliente.setToolTipText("Pesquisar");
		pesquisarCliente.setBounds(855, 0, 25, 25);

		clientes.add(opcoesCliente);
		opcoesCliente.add(novoCliente);
		opcoesCliente.add(campoPesquisar);
		opcoesCliente.add(pesquisarCliente);
		
	
		//  Inicializando Capos e definindo o tamanho dos vetores
		//  Isso DEVE ser feito antes da função

		clientesCampo = new JPanel[10];
		clientesCampoNome = new JPanel[10];
		clientesCampoEndereco = new JPanel[10];
		nome = new JLabel[10];
		cargo = new JLabel[10];
		endereco = new JLabel[10];
		telefone = new JLabel[10];
		editar = new JButton[10];
		excluir = new JButton[10];

	}


	/***********************************************************************************
	 *  		*   MÉTODO Labels   *
	 *   
	 *   Cria os campos que adicionam os conteudos da tabela 'clientes'
	 *   
	 *   posicao é a posição no eixo 'y' onde vamos posicionar a label clientesCampo
	 *   
	 *   conteudo é um array que contem todos os valores da tabela 'clientes'
	 *   
	 *   i é a variavel que seleciona a posição de cada linha do array
	 *   
	 ************************************************************************************/

	public void Labels(int posicao, String[][] conteudo, int i){

		clientesCampo[i] = new JPanel();
		clientesCampo[i].setBounds(0, posicao, 870, 80);
		clientesCampo[i].setBackground(new Color(238, 233, 233));         			   // descomente a cor para ver a onde está o JPanel
		clientesCampo[i].setLayout(null);

		clientesCampoNome[i] = new JPanel();
		clientesCampoNome[i].setBounds(10, 5, 850, 65);
		clientesCampoNome[i].setBackground(new Color(255, 255, 255));         			   // descomente a cor para ver a onde está o JPanel
		clientesCampoNome[i].setLayout(null);

		clientesCampoEndereco[i] = new JPanel();
		clientesCampoEndereco[i].setBounds(10, 30, 830, 25);
		clientesCampoEndereco[i].setBackground(new Color(248, 248, 255));         			   // descomente a cor para ver a onde está o JPanel
		clientesCampoEndereco[i].setLayout(null);

		clientes.add(clientesCampo[i]);
		clientesCampo[i].add(clientesCampoNome[i]);
		clientesCampoNome[i].add(clientesCampoEndereco[i]);

		// LABELS

		nome[i] = new JLabel();
		nome[i].setBounds(20, 0, 500, 30);
		nome[i].setFont( new Font("Arial",Font.BOLD,16));
		nome[i].setText(conteudo [i][1]);

		cargo[i] = new JLabel();
		cargo[i].setBounds(520, 0, 270, 30);
		cargo[i].setText("Engenheiro");
		cargo[i].setFont( new Font("Arial",Font.BOLD,14));

		endereco[i] = new JLabel();
		endereco[i].setBounds(5, 0, 500, 30);
		endereco[i].setFont( new Font("Arial",Font.BOLD,13));
		endereco[i].setText(conteudo [i][2]);

		telefone[i] = new JLabel();
		telefone[i].setBounds(510, 0, 100, 30);
		telefone[i].setFont( new Font("Arial",Font.BOLD,13));
		telefone[i].setText(conteudo [i][7]);

		editar[i] = new JButton();
		editar[i].setBounds(775, 0, 25, 25);
		editar[i].setToolTipText("Editar");

		excluir[i] = new JButton();
		excluir[i].setBounds(805, 0, 25, 25);
		excluir[i].setToolTipText("Excluir");

		clientesCampoEndereco[i].add(editar[i]);
		clientesCampoEndereco[i].add(excluir[i]);	

		clientesCampoNome[i].add(nome[i]);
		clientesCampoNome[i].add(cargo[i]);
		clientesCampoEndereco[i].add(endereco[i]);
		clientesCampoEndereco[i].add(telefone[i]);


		clientesCampoNome[i].addMouseListener(new clientesCampoAction());
		editar[i].addActionListener(new BotaoEditar());
		excluir[i].addActionListener(new BotaoExcluir());

	}	


	
	/*******************************
	 *   GERENCIMENTO DE EVENTOS  *
	 *******************************/
	
	
	//  BOTÃO Editar

	class BotaoEditar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {

			String s = "";

			if(evento.getSource() == editar[0]){

				s = "Editar "+nome[0].getText();

			}else if ( evento.getSource() == editar[1] ){

				s = "Editar "+nome[1].getText();

			}else if ( evento.getSource() == editar[2] ){

				s = "Editar "+nome[1].getText();

			}else if ( evento.getSource() == editar[3] ){

				s = "Editar "+nome[3].getText();

			}else if ( evento.getSource() == editar[4] ){

				s = "Editar "+nome[4].getText();

			}else if ( evento.getSource() == editar[5] ){

				s = "Editar "+nome[5].getText();

			}else if ( evento.getSource() == editar[6] ){

				s = "Editar "+nome[6].getText();

			}else if ( evento.getSource() == editar[7] ){

				s = "Editar "+nome[7].getText();

			}else if ( evento.getSource() == editar[8] ){

				s = "Editar "+nome[8].getText();

			}else if ( evento.getSource() == editar[9] ){

				s = "Editar "+nome[9].getText();

			}			
			JOptionPane.showMessageDialog(null, s);

		}
	}

	
	//  BOTÃO Excluir

	class BotaoExcluir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {

			String s = "";

			if(evento.getSource() == excluir[0]){

				s = "Excluir "+nome[0].getText();

			}else if ( evento.getSource() == excluir[1] ){

				s = "Excluir "+nome[1].getText();

			}else if ( evento.getSource() == excluir[2] ){

				s = "Excluir "+nome[2].getText();

			}else if ( evento.getSource() == excluir[3] ){

				s = "Excluir "+nome[3].getText();

			}else if ( evento.getSource() == excluir[4] ){

				s = "Excluir "+nome[4].getText();

			}else if ( evento.getSource() == excluir[5] ){

				s = "Excluir "+nome[5].getText();

			}else if ( evento.getSource() == excluir[6] ){

				s = "Excluir "+nome[6].getText();

			}else if ( evento.getSource() == excluir[7] ){

				s = "Excluir "+nome[7].getText();

			}else if ( evento.getSource() == excluir[8] ){

				s = "Excluir "+nome[8].getText();

			}else if ( evento.getSource() == excluir[9] ){

				s = "Excluir "+nome[9].getText();

			}
			JOptionPane.showMessageDialog(null, s);
		}
	}

	
	//  EVENTOD DO MOUSE

	class clientesCampoAction implements MouseListener{
		
		int j = 2;
		Color cinza = new Color(176, 196, 222);
		Color branco = new Color(255, 255, 255);
				
		@Override
		public void mouseClicked(MouseEvent evento) {
			
			if(evento.getSource() == clientesCampoNome[0]){
				
				if (j%2 == 0){

					clientesCampo[0].setSize(870, x+120);
					clientesCampoNome[0].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[0].setSize(870, 80);
					clientesCampoNome[0].setSize(850, 65);
					j++;
				}
				
			}else if ( evento.getSource() == clientesCampoNome[1] ){

				if (j%2 == 0){

					clientesCampo[1].setSize(870, x+120);
					clientesCampoNome[1].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[1].setSize(870, 80);
					clientesCampoNome[1].setSize(850, 65);
					j++;
				}
				
			}else if ( evento.getSource() == clientesCampoNome[2] ){

				if (j%2 == 0){

					clientesCampo[2].setSize(870, x+120);
					clientesCampoNome[2].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[2].setSize(870, 80);
					clientesCampoNome[2].setSize(850, 65);
					j++;
				}
				
			}else if ( evento.getSource() == clientesCampoNome[3] ){

				if (j%2 == 0){

					clientesCampo[3].setSize(870, x+120);
					clientesCampoNome[3].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[3].setSize(870, 80);
					clientesCampoNome[3].setSize(850, 65);
					j++;
				}
				
			}else if ( evento.getSource() == clientesCampoNome[4] ){

				if (j%2 == 0){

					clientesCampo[4].setSize(870, x+120);
					clientesCampoNome[4].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[4].setSize(870, 80);
					clientesCampoNome[4].setSize(850, 65);
					j++;
				}

			}else if ( evento.getSource() == clientesCampoNome[5] ){

				if (j%2 == 0){

					clientesCampo[5].setSize(870, x+120);
					clientesCampoNome[i].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[5].setSize(870, 80);
					clientesCampoNome[5].setSize(850, 65);
					j++;
				}

			}else if ( evento.getSource() == clientesCampoNome[6] ){

				if (j%2 == 0){

					clientesCampo[6].setSize(870, x+120);
					clientesCampoNome[6].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[6].setSize(870, 80);
					clientesCampoNome[6].setSize(850, 65);
					j++;
				}

			}else if ( evento.getSource() == clientesCampoNome[7] ){

				if (j%2 == 0){

					clientesCampo[7].setSize(870, x+120);
					clientesCampoNome[7].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[7].setSize(870, 80);
					clientesCampoNome[7].setSize(850, 65);
					j++;
				}

			}else if ( evento.getSource() == clientesCampoNome[8] ){

				if (j%2 == 0){

					clientesCampo[8].setSize(870, x+120);
					clientesCampoNome[8].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[8].setSize(870, 80);
					clientesCampoNome[8].setSize(850, 65);
					j++;
				}

			}else if ( evento.getSource() == clientesCampoNome[9] ){

				if (j%2 == 0){

					clientesCampo[9].setSize(870, x+120);
					clientesCampoNome[9].setSize( 850, 185);
					j++;
				}else{
					clientesCampo[9].setSize(870, 80);
					clientesCampoNome[9].setSize(850, 65);
					j++;
				}
				
			}
		}

		@Override
		public void mouseEntered(MouseEvent evento) {
			
			TocaCor(evento, cinza);
			
		}

		@Override
		public void mouseExited(MouseEvent evento) {
			
			TocaCor(evento, branco);
				
		}
		
		// MÉTODO QUE TROCA A COR DO PANEL 
		
		public void TocaCor(MouseEvent evento, Color cor){
			
			if(evento.getSource() == clientesCampoNome[0]){

				clientesCampoNome[0].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[1] ){

				clientesCampoNome[1].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[2] ){

				clientesCampoNome[2].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[3] ){

				clientesCampoNome[3].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[4] ){

				clientesCampoNome[4].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[5] ){

				clientesCampoNome[5].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[6] ){

				clientesCampoNome[6].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[7] ){

				clientesCampoNome[7].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[8] ){

				clientesCampoNome[8].setBackground(cor);

			}else if ( evento.getSource() == clientesCampoNome[9] ){

				clientesCampoNome[9].setBackground(cor);

			}
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}
	}

}
