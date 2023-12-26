import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Anime6 extends JPanel{
	JLabel lbtexto,lboasis;
	JTextField tfresto;
	JButton btver,btdica;
	String corre;

	public Anime6() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		ImageIcon oasis = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\mil.jpg");
		ImageIcon ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		lbtexto = new JLabel("É mais de");
		lboasis = new JLabel(oasis);
		tfresto = new JTextField();
		btver = new JButton(ver);
		
		btdica = new JButton("Dica");
		btdica.setBounds(230,60,60,20);
		add(btdica);
		
		btver.setOpaque(false);
		btver.setContentAreaFilled(false);
		btver.setBorderPainted(false);
		
		lboasis.setBounds(20,50,100,100);
		lbtexto.setBounds(20,20,70,20);
		tfresto.setBounds(80,20,50,20);
		btver.setBounds(130,60,75,75);
		
		add(lboasis);
		add(btver);
		add(tfresto);
		add(lbtexto);
		
		ImageIcon musica = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\jogo.jpg");
		JLabel back = new JLabel(musica);
		back.setBounds(0,0,600,600);
		add(back);
		
	}
	public void DefinirEventos() {
		btdica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Entre 7000 e 9000");
			}
		});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Anime6());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
