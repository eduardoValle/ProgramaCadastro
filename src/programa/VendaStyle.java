package programa;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VendaStyle extends JFrame{
		
	JPanel fundo, tabela;
	
	JLabel Lvendedor, Lcliente, Ldata, Lcpf, LcodigoCliente, LcodigoVendedor, Lendereco, Lbairro;
	JTextField vendedor, cliente, data, cpf, codigoCliente, codigoVendedor, endereco, bairro;
	
	public VendaStyle(){
		
		setTitle("Vendas");
		setBounds(0, 0, 1350, 540);									                                           
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	
		fundo = new JPanel();
		fundo.setLayout(null);
		fundo.setBounds(0, 0, 1400, 540);
		fundo.setBackground(new Color(205, 92, 92)); 		
		getContentPane().add(fundo);		
		
		LcodigoVendedor = new JLabel ();
		LcodigoVendedor.setBounds (10, 20, 100, 20);
		LcodigoVendedor.setText("Código Vendedor");
		fundo.add(LcodigoVendedor);
		
		codigoVendedor = new JTextField ();
		codigoVendedor.setBounds(10, 40, 100, 20);
		codigoVendedor.setEditable(false);
		fundo.add (codigoVendedor);
		
		Lvendedor = new JLabel ();
		Lvendedor.setBounds (130, 20, 340, 20);
		Lvendedor.setText("Vendedor");
		fundo.add(Lvendedor);
		
		vendedor = new JTextField ();
		vendedor.setBounds(120, 40, 350, 20);
		fundo.add(vendedor);
		
		Ldata = new JLabel ();
		Ldata.setBounds (490, 20, 100, 20);
		Ldata.setText("Data");
		fundo.add(Ldata);
		
		data = new JTextField ();
		data.setBounds(480, 40, 100, 20);
		fundo.add (data);
		
		Lcliente = new JLabel ();
		Lcliente.setBounds (130, 65, 170, 20);
		Lcliente.setText("Cilente");
		fundo.add(Lcliente);
		
		cliente = new JTextField ();
		cliente.setBounds(120, 85, 350, 20);
		fundo.add (cliente);
		
		LcodigoCliente = new JLabel();
		LcodigoCliente.setBounds (10, 65, 100, 20);
		LcodigoCliente.setText("Código Cliente");
		fundo.add(LcodigoCliente);
		
		codigoCliente = new JTextField ();
		codigoCliente.setBounds(10, 85, 100, 20);
		codigoCliente.setEditable(false);
		fundo.add (codigoCliente);
		
		Lcpf = new JLabel ();
		Lcpf.setBounds(490, 65, 100,20);
		Lcpf.setText("CPF/CNPJ");
		fundo.add(Lcpf);
		
		cpf = new JTextField ();
		cpf.setBounds(480, 85, 100, 20);
		fundo.add(cpf);
		
		Lendereco = new JLabel();
		Lendereco.setBounds (10, 110, 100, 20);
		Lendereco.setText("Endereço");
		fundo.add(Lendereco);
		
		endereco = new JTextField ();
		endereco.setBounds(10, 130, 350, 20);
		fundo.add (endereco);
		
		Lbairro = new JLabel();
		Lbairro.setBounds (380, 110, 100, 20);
		Lbairro.setText("Bairro");
		fundo.add(Lbairro);
		
		bairro = new JTextField ();
		bairro.setBounds(370, 130, 210, 20);
		fundo.add (bairro);
						
		tabela = new JPanel();
		tabela.setLayout(null);
		tabela.setBounds(0, 220, 1400, 240);
		tabela.setBackground(new Color(2, 92, 92)); 		
		fundo.add(tabela);	
		
	}
}
