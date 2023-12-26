import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Musica7 extends JPanel{
	JLabel lbper;
	JCheckBox cbop1,cbop2,cbop3,cbop4,cbop5,cbop6,cbop7,cbop8;
	JButton btver;
	public Musica7() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		ImageIcon ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		lbper = new JLabel("Quais desses músicos são guitarristas de suas respectivas bandas?");
		
		cbop1 = new JCheckBox("John Deacon");
		cbop2 = new JCheckBox("Anthony Kiedis");
		cbop3 = new JCheckBox("David Gilmour");//
		cbop4 = new JCheckBox("Freddie Mercury");
		cbop5 = new JCheckBox("Brian May");//
		cbop6 = new JCheckBox("Krist Novoselic");
		cbop7 = new JCheckBox("Kurt Cobain");//
		cbop8 = new JCheckBox("Angus Young");//
		
		btver = new JButton(ver);
		
		lbper.setBounds(20,20,395,20);
		cbop1.setBounds(20,50,100,20);
		cbop2.setBounds(20,80,125,20);
		cbop3.setBounds(20,110,125,20);
		cbop4.setBounds(20,140,125,20);
		cbop5.setBounds(155,50,100,20);
		cbop6.setBounds(155,80,125,20);
		cbop7.setBounds(155,110,125,20);
		cbop8.setBounds(155,140,125,20);
		
		btver.setBounds(300,70,75,75);
		
		btver.setOpaque(false);
		btver.setContentAreaFilled(false);
		btver.setBorderPainted(false);
		
		add(lbper);
		add(cbop1);
		add(cbop2);
		add(cbop3);
		add(cbop4);
		add(cbop5);
		add(cbop6);
		add(cbop7);
		add(cbop8);
		add(btver);
		
	}
	public void DefinirEventos() {
		
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Musica7());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
