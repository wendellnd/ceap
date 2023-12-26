import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Classe1 extends JPanel{
	
	JLabel p1,p2,p3,p4,p5,p6,p7,p8;
	
	public Classe1() {
		InicializarComponentes();
		DefinirEventos();
		}
	public void InicializarComponentes() {
		
	}
	public void DefinirEventos() {
		
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Classe1());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
