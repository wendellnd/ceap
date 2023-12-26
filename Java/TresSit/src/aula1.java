import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class aula1 extends JPanel {
	JLabel lba;
	JLabel lbnome;
	JTextField tfnome;
	JButton btenviar;
	ImageIcon icon = new ImageIcon("C:\\Users\\root\\Documents\\foto.jpg");
	
	public aula1() {
		InicializarComponentes();
		definirEventos();
	}
	
	public void InicializarComponentes() {
		setLayout(null);

		lbnome = new JLabel("Nome: ");
		tfnome = new JTextField(8);
		btenviar = new JButton("Enviar: ");
		lba = new JLabel("");
		JLabel lbicon = new JLabel(icon);
		
		lbnome.setBounds(40,20,40,40);
		tfnome.setBounds(90,30,80,20);
		btenviar.setBounds(60,80,80,30);
		lba.setBounds(50,120,120,100);
		lbicon.setBounds(50, 240, 100, 100);
		
		add(lbnome);
		add(tfnome);
		add(btenviar);
		add(lba);
		add(lbicon);
		lba.setVisible(false);
		lbicon.setVisible(false);
	}
	public void definirEventos() {
		btenviar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					lba.setText("Bem Vindo "+tfnome.getText()+"!");
					lba.setVisible(true);

				}
	});
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Aula 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new aula1());
		frame.setBounds(400,400,250,250);
		frame.setVisible(true);
	}

}
