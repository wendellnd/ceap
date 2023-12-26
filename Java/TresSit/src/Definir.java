import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Definir extends JLabel{

	JLabel lbblue;
	JLabel lbgreen;
	JLabel lbyellow;
	JLabel lbred;
	JButton btblue;
	JButton btgreen;
	JButton btyellow;
	JButton btred;
	
	public Definir() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		lbblue = new JLabel("Azul");
		lbgreen = new JLabel("Verde");
		lbyellow = new JLabel("Amarelo");
		lbred = new JLabel("Vermelho");
		btblue = new JButton();
		
	}
	public void DefinirEventos() {
		
	}
	
	
	
	public static void main(String args[]) {
		
	}
}
