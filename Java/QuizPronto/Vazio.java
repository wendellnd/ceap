import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Vazio extends JPanel{
	public Vazio() {
		InicializarComponentes();
	}
	public void InicializarComponentes() {
		ImageIcon abc = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\ezgif.gif");
		JLabel abcd = new JLabel(abc);
		add(abcd);
		setBackground(new Color(173,216,230));
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Vazio());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
