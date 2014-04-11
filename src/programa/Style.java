package programa;

import java.awt.*;
import javax.swing.*;

public class Style extends JFrame{

	public Style()	{
	
	setLocation(200, 40);
	setSize(905, 600);
	setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
	setUndecorated(false);                                         // com false abre frame dentro de um frame
	//getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
	setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar
	
	/** TELA MAXMINIZADA
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Dimension tela = toolkit.getScreenSize();
	int lar = tela.width;
	int alt = tela.height;
	setLayout(null);											   // Deixei sem layout para programar-mos TUDDO =]
	setUndecorated(false);                                        // com false abre frame dentro de um frame
	//getRootPane().setWindowDecorationStyle(JRootPane.FRAME);     // libera o design da tela
	setSize(lar, alt);
	setDefaultCloseOperation(EXIT_ON_CLOSE);					//  Arruma o botão de fechar
	 */
	
	}	
	
	public static void main(String[] args) {
		new Style().setVisible(true);
	}

}
