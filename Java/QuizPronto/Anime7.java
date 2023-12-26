import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Anime7 extends JPanel{
	JLabel lbper;
	JCheckBox cbop1,cbop2,cbop3,cbop4,cbop5,cbop6,cbop7,cbop8;
	JButton btver;
	public Anime7() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		ImageIcon ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		lbper = new JLabel("Quais desses personagens fazem parte do Dragon Ball?");
		
		cbop1 = new JCheckBox("Dindi");
		cbop2 = new JCheckBox("Android 22");
		cbop3 = new JCheckBox("Oolong");//
		cbop4 = new JCheckBox("Saitama");
		cbop5 = new JCheckBox("Android 8");//
		cbop6 = new JCheckBox("Akuma");
		cbop7 = new JCheckBox("Bubbles");//
		cbop8 = new JCheckBox("Gurdo");//
		
		btver = new JButton(ver);
		
		lbper.setBounds(20,20,395,20);
		cbop7.setBounds(20,50,125,20);
		cbop5.setBounds(20,80,125,20);
		cbop4.setBounds(20,110,125,20);
		cbop3.setBounds(20,140,125,20);
		cbop2.setBounds(155,50,150,20);
		cbop6.setBounds(155,80,125,20);
		cbop8.setBounds(155,110,125,20);
		cbop1.setBounds(155,140,125,20);
		
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
		
		cbop1.setContentAreaFilled(false);
		cbop2.setContentAreaFilled(false);
		cbop3.setContentAreaFilled(false);
		cbop4.setContentAreaFilled(false);
		cbop5.setContentAreaFilled(false);
		cbop6.setContentAreaFilled(false);
		cbop7.setContentAreaFilled(false);
		cbop8.setContentAreaFilled(false);
		
		ImageIcon musica = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\jogo.jpg");
		JLabel back = new JLabel(musica);
		back.setBounds(0,0,600,600);
		add(back);
		
	}
	public void DefinirEventos() {
		
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Anime7());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
