import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Teste extends JPanel{
	
	JScrollPane spteste;
	JButton bttst[] = new JButton[20];
	int y = 40;
	public Teste() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(new GridLayout(2,1));
		JPanel panel = new JPanel();
		for(int i = 0; i < 20;i++) {
			bttst[i] = new JButton("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			bttst[i].setBounds(20,y,200,20);
			y+=40;
			spteste.add(bttst[i]);
		}
		panel.add(spteste);
		add(panel);
	}
	public void DefinirEventos() {

		
	}
	public static void main(String args[]) {

		JFrame frame = new JFrame("Teste de sp");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Teste());
		frame.setBounds(100,20,500,500);
		frame.setVisible(true);
	}
}
