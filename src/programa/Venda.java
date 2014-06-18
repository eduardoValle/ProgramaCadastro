package programa;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class Venda extends VendaStyle{
	
	public Venda(){
		
		vendedor.addMouseListener(new CampoVendedor());
		cliente.addMouseListener(new CampoCliente());
	}
	
	class CampoVendedor implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			JOptionPane.showMessageDialog(null, "Vendedor");	
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {}

		@Override
		public void mouseExited(MouseEvent arg0) {}

		@Override
		public void mousePressed(MouseEvent arg0) {}		 
		 
		@Override
		public void mouseReleased(MouseEvent arg0) {}
		
	}
	
	class CampoCliente implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			JOptionPane.showMessageDialog(null, "Cliente");	
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {}

		@Override
		public void mouseExited(MouseEvent arg0) {}

		@Override
		public void mousePressed(MouseEvent arg0) {}

		@Override
		public void mouseReleased(MouseEvent arg0) {}
		
	}

	public static void main(String[] args) {
		new Venda().setVisible(true);

	}

}
