package programa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Clientes extends ClienteStyle{

	String[] colunas = new String[]{"Código","Nome","Endereço","Cidade","Bairro","Estado", 
			"CEP","Telefone","CNPJ", "CPF", "RG","Inscrição Estadual",
			"Razão Social","Observações","Status","Data de Nascimento", "Data de Cadastro"};

	CRUD crud = new CRUD();	
	String [][] linhas = crud.Ler("cliente");	
	Tabela tabelaClientes = new Tabela(linhas, colunas);

	public Clientes(){
		
		fundo.add(tabelaClientes.tabela.getTableHeader(), BorderLayout.PAGE_START);
		fundo.add(tabelaClientes.tabela, BorderLayout.CENTER);
		
		// EVENTOS DA TABELA

		tabelaClientes.tabela.getSelectionModel().addListSelectionListener(new ColumnListener());
		tabelaClientes.tabela.addKeyListener(new ClientesTeclado());
		
		
		// ADICIONANDO O EVENTO DO RIGHT-CLICK
		
		tabelaClientes.menuItem3.addActionListener(new EventoPopUp());
		tabelaClientes.menuItem2.addActionListener(new EventoPopUp());
		tabelaClientes.menuItem1.addActionListener(new EventoPopUp());

	}


	private class ColumnListener implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent event) {
			if (event.getValueIsAdjusting()) {
				return;
			}

			System.out.println(tabelaClientes.tabela.getValueAt(tabelaClientes.tabela.getSelectionModel().getLeadSelectionIndex(),
					tabelaClientes.tabela.getColumnModel().getSelectionModel().getLeadSelectionIndex()));
		}
	}


	// MÉTODO DE DELETAR 

	public void DeletaCampo(){

		int resposta = JOptionPane.showConfirmDialog(fundo, "Tem certeza que quer deletar?", "Close Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (resposta == JOptionPane.YES_OPTION) {   //  Se sim ele deleta

			if(!String.valueOf(tabelaClientes.tabela.getValueAt(tabelaClientes.tabela.getSelectionModel().getLeadSelectionIndex(), 9)).equals("null") || 
						String.valueOf(tabelaClientes.tabela.getValueAt(tabelaClientes.tabela.getSelectionModel().getLeadSelectionIndex(), 9)).equals("")){

				String valor = String.valueOf(tabelaClientes.tabela.getValueAt(tabelaClientes.tabela.getSelectionModel().getLeadSelectionIndex(), 9));
		//		crud.Deletar("cliente", "cpf", valor);

			}else{

				String valor =  String.valueOf(tabelaClientes.tabela.getValueAt(tabelaClientes.tabela.getSelectionModel().getLeadSelectionIndex(), 8));
		//		crud.Deletar("cliente", "cnpj", valor);
			}
			
			tabelaClientes.modelo.deleteLine(11);
		} 
	}

	
	// EVENTO DO BOTÃO DIREITO DO MOUSE ( DA LISTA QUE APARECE)
	
	class EventoPopUp implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent evento) {

			try{

				if(evento.getSource() == tabelaClientes.menuItem1){

					JOptionPane.showMessageDialog(null, "Editar "+tabelaClientes.tabela.getValueAt(tabelaClientes.tabela.getSelectionModel().getLeadSelectionIndex(), 
																	tabelaClientes.tabela.getColumnModel().getSelectionModel().getLeadSelectionIndex()));

				}else if ( evento.getSource() == tabelaClientes.menuItem2 ){

					JOptionPane.showMessageDialog(null, "Adicionar Novo Cliente");

				}else if ( evento.getSource() == tabelaClientes.menuItem3 ){
					
					// OPÇÃO DELETAR
					
					DeletaCampo();
				}

			}catch(IndexOutOfBoundsException e){

				JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha");
			}
		}
	}
	
	public class ClientesTeclado implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {}

		@Override
		public void keyReleased(KeyEvent arg0) {}

		// ESSE MÉTODO ADICIONA EVENTO NO BOTÃO DELETAR DO TECLADO
		@Override
		public void keyTyped(KeyEvent evento) {

			if (evento.getKeyChar() == KeyEvent.VK_DELETE){

				DeletaCampo();
			}
		}
	}

	public static void main(String arg[]){ 

		new Clientes().setVisible(true);
	}
}
