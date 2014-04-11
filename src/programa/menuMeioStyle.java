package programa;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;


public class MenuMeioStyle extends Botoes {
	

	JButton novoVenda, novoCliente, novoProduto, novoFuncionario, novoRelatorioVendas, novoRelatorioProdutos;

	public MenuMeioStyle(){
		
		boolean resizable = false;  
		boolean closeable = false;  
		boolean maximizable = false;  
		boolean iconifiable = false;
		String title = "Menu";  
		
		JInternalFrame menuMeio = new JInternalFrame(title, resizable, closeable, maximizable, iconifiable);  
		
		menuMeio.setBounds(215,80, 462, 235);  
		menuMeio.setLayout(null);
		menuMeio.getContentPane().add(new JTextArea());
		
		menuMeio.setVisible(true);  
		fundo.add(menuMeio);  
		
		// Botoes 
		
		novoVenda = new JButton();
		novoVenda.setText("Nova Venda");
		novoVenda.setToolTipText("Nova Venda");
		novoVenda.setBounds(1, 1, 150, 100);
		
		novoCliente = new JButton();
		novoCliente.setText("Novo Cliente");
		novoCliente.setToolTipText("Novo Cliente");
		novoCliente.setBounds(151, 1, 150, 100);

		novoProduto = new JButton();
		novoProduto.setText("Novo Produto");
		novoProduto.setToolTipText("Novo Produto");
		novoProduto.setBounds(301, 1, 150, 100);
		
		novoFuncionario = new JButton();
		novoFuncionario.setText("Novo Funcionário");
		novoFuncionario.setToolTipText("Novo Funcionário");
		novoFuncionario.setBounds(1, 101, 150, 100);
		
		novoRelatorioVendas = new JButton();
		novoRelatorioVendas.setText("Relatório de Vendas");
		novoRelatorioVendas.setToolTipText("Relatório de Vendas");
		novoRelatorioVendas.setBounds(151, 101, 150, 100);
		
		novoRelatorioProdutos = new JButton();
		novoRelatorioProdutos.setText("Relatório de Produtos");
		novoRelatorioProdutos.setToolTipText("Relatório de Produtos");
		novoRelatorioProdutos.setBounds(301, 101, 150, 100);
	
		menuMeio.add(novoVenda);
		menuMeio.add(novoCliente);
		menuMeio.add(novoProduto);
		menuMeio.add(novoFuncionario);
		menuMeio.add(novoRelatorioVendas);
		menuMeio.add(novoRelatorioProdutos);

	}  

}


