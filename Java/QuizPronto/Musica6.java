import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica6 extends JPanel{
	File oasis = new File("C:\\Users\\wende\\Downloads\\Quiz\\oasis.wav");
	int a;
	Clip clip;
	JLabel lbtexto,lboasis;
	JTextField tfresto;
	JButton btver,btdica;
	String corre;
	public int Tocar(File Sound) {
		try{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		}catch(Exception e) {
		}
		return 1;
	}
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
		
		btdica = new JButton("Dica");
		btdica.setBounds(230,60,60,20);
		add(btdica);
		
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
		
		ImageIcon musica = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\musica.jpg");
		JLabel back = new JLabel(musica);
		back.setBounds(0,0,600,600);
		add(back);
		
	}
	public void DefinirEventos() {
		btver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfresto.getText().toUpperCase().equals("YOU") && a == 1) {
					clip.stop();
				}	
			}
		});
		btdica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Tocar(oasis);
			}
		});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Musica6());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
