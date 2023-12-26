import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Musica6 extends JPanel{
	JLabel lbtexto,lboasis;
	JTextField tfresto;
	JButton btver;
	String corre;
	public Musica6() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		ImageIcon oasis = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\oasis.jpg");
		ImageIcon ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		lbtexto = new JLabel("Today is gonna be the day that they're gonna throw it back to");
		lboasis = new JLabel(oasis);
		tfresto = new JTextField();
		btver = new JButton(ver);
		
		btver.setOpaque(false);
		btver.setContentAreaFilled(false);
		btver.setBorderPainted(false);
		
		lboasis.setBounds(20,50,100,100);
		lbtexto.setBounds(20,20,350,20);
		tfresto.setBounds(370,20,50,20);
		btver.setBounds(130,60,75,75);
		
		add(lboasis);
		add(btver);
		add(tfresto);
		add(lbtexto);
	}
	public void DefinirEventos() {
		
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Musica6());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
