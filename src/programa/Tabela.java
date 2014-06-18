package programa;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


@SuppressWarnings("serial")
public class Tabela extends JFrame{
	
	String [][] linha;
	String [] coluna;
	JTable tabela;
	JPopupMenu popup;
	JMenuItem menuItem1, menuItem2, menuItem3;
	TabelaModelo modelo = new TabelaModelo();

	public Tabela(String [][] linhas, String colunas[]){
		
		linha = linhas;
		coluna = colunas;
		
		tabela = new JTable(modelo);
		tabela.setFont( new Font("Arial",Font.BOLD,13));
		tabela.setFillsViewportHeight(false);
		tabela.getScrollableTracksViewportHeight();
		tabela.setAutoCreateRowSorter(true);    //  Deixa a tabela ordenevel

		//CRIANDO O MENU DO BOTÃO DIREITO DO MOUSE

		popup = new JPopupMenu();
		menuItem1 = new JMenuItem("Editar linha selecionada");
		popup.add(menuItem1);

		menuItem2 = new JMenuItem("Adicionar");
		popup.add(menuItem2);

		menuItem3 = new JMenuItem("Excluir");
		popup.add(menuItem3);

		//ADIOCIONANDO O EVENTO DE RIGHT-CLICK
		MouseListener popupListener = new PopupListener(popup);

		tabela.addMouseListener(popupListener);
	}


	class PopupListener extends MouseAdapter {
		JPopupMenu popup;

		PopupListener(JPopupMenu popupMenu) {
			popup = popupMenu;
		}

		public void mousePressed(MouseEvent e) {
			maybeShowPopup(e);
		}

		public void mouseReleased(MouseEvent e) {
			maybeShowPopup(e);
		}

		private void maybeShowPopup(MouseEvent e) {
			if (e.isPopupTrigger()) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		}
	}

	
	// CLASSE QUE CRIA A TABELA
	class TabelaModelo extends AbstractTableModel {

		public int getColumnCount() {

			return coluna.length;
		}

		public int getRowCount() {

			return linha.length;
		}

		public String getColumnName(int col) {
			return coluna[col];
		}

		public String getValueAt(int row, int col) {

			return linha[row][col];
		}

		public boolean isCellEditable(int row, int col) {

			return false;
		}
		
		public boolean deleteLine(int row){   
            tabela.remove(row);   
            return true;   
        }   
	}

/*	public static void main (String args []){
		
		String[] colun = new String[]{"Nome","Idade","Sexo"};

		String[][] dados = new String[][]{
				{"Eduardo","23","Masculino"},
				{"Marimoon","31","Feminino"},
				{"Mariana","31", "Feminino"},
				{"Fernanda","23","Feminino"},
				{"Mickaela","16","Feminino"},
				{"Jessica","28", "Feminino"},
				{"Paula","28", "Feminino"},
				{"Andresa","25","Feminino"},
				{"Martina","26","Feminino"},
				{"Maria","30","Feminino"},
				{"Martina","28","Feminino"},
				{"Camila","18","Feminino"},
				{"Iris","16","Feminino"},
		};

		new Tabela(dados, colun).setVisible(true);

	}*/
}