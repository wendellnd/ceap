import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Anime8 extends JPanel{
	File oasis = new File("C:\\Users\\wende\\Downloads\\Quiz\\kra.wav");
	Clip clip;
	JLabel lbtexto,lbtexto2,lboasis;
	JTextField tfresto,tfresto2;
	JButton btver,btdica;
	String corre,corre2;
	public void Tocar(File Sound) {
		try{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		}catch(Exception e) {
		}
	}
	public Anime8() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		ImageIcon oasis = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\elric.jpg");
		ImageIcon ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		lbtexto = new JLabel("O que sabemos é uma");
		lbtexto2 = new JLabel("já o que não sabemos, é um");
		lboasis = new JLabel(oasis);
		tfresto = new JTextField();
		tfresto2 = new JTextField();
		btver = new JButton(ver);
		
		btdica = new JButton("Dica");
		btdica.setBounds(230,60,60,20);
		add(btdica);
		
		btver.setOpaque(false);
		btver.setContentAreaFilled(false);
		btver.setBorderPainted(false);
		
		lboasis.setBounds(20,50,100,100);
		lbtexto.setBounds(20,20,200,20);
		tfresto.setBounds(150,20,50,20);
		tfresto2.setBounds(360,20,50,20);
		lbtexto2.setBounds(200,20,220,20);
		btver.setBounds(130,60,75,75);
		
		add(lboasis);
		add(btver);
		add(tfresto);
		add(tfresto2);
		add(lbtexto);
		add(lbtexto2);
		
		ImageIcon musica = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\jogo.jpg");
		JLabel back = new JLabel(musica);
		back.setBounds(0,0,600,600);
		add(back);
		
	}
	public void DefinirEventos() {
		btdica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Proporção entre águas");
			}
		});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Anime8());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
