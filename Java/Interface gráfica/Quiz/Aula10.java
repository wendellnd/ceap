import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aula10 extends JPanel{
	private JTextField tfCampo;
	private JTextArea taTexto;
	private JScrollPane scrollPane;
	private JButton btLimpar;
	private final static String novaLinha = "\n";
	
	public Aula10(){
		inicializarComponetes();
		definirEventos();
	}
	
	private void inicializarComponetes(){
		setLayout(null);
		tfCampo = new JTextField();
		taTexto = new JTextArea(5,20);
		btLimpar =  new JButton(new ImageIcon("C:\\Users\\vinicius\\Documents\\borracha.png"));
		scrollPane = new JScrollPane(taTexto);
		tfCampo.setBounds(25,15,150,25);
		scrollPane.setBounds(25,45,300,120);
		btLimpar.setBounds(25,170,50,50);
		add(tfCampo);
		add(scrollPane);
		add(btLimpar);
	}
	
	private void definirEventos(){
		tfCampo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent  e){
				tfCampo.selectAll();
				taTexto.append(tfCampo.getText()+ novaLinha);
				taTexto.setCaretPosition(taTexto.getDocument().getLength());
			}
	});
		btLimpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent  e){
				tfCampo.setText("");
				taTexto.setText("");
			}
	});
	}
	public static void main(String args[]){
 		JFrame frame = new JFrame("Area de Texto");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new Aula10());
		 frame.setBounds(300,300,500,300);
		 frame.setVisible(true);
	 }

}