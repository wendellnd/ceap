import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;


public class Musica3 extends JPanel{
//	Font f = new Font("SansSerif", Font.BOLD, 15);
	int tempo,a;
	File queen = new File("C:\\Users\\wende\\Downloads\\Quiz\\queen.wav");
	Clip clip;
	JProgressBar pbtempo;
	JLabel lbp1,lbimg,lbcerto,lberrado,lbtempo;
	ImageIcon img,ver,certo,errado;
	JButton btver,btdica;
	JRadioButton rba1,rba2,rba3,rba4,rba5;
	ButtonGroup alter;
	public int Tocar(File Sound) {
		try{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		}catch(Exception e) {
		}
		return 1;
	}
	public Musica3() {
		InicializarComponentes();
		DefinirEventos();
		}
	public void InicializarComponentes() {
		setLayout(null);
		img = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\queen.jpg");
		ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		certo = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\certo.png");
		errado = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\errado.png");
		
		lbp1 = new JLabel("Quem era o vocalista do Queen?");
		lbimg = new JLabel(img);
		
		tempo = 30;
		lbtempo = new JLabel(tempo+"");
		pbtempo = new JProgressBar();
		pbtempo.setMaximum(30);
		pbtempo.setValue(30);
		
		btdica = new JButton("Dica");
		btdica.setBounds(200,60,60,20);
		add(btdica);
		
		rba1 = new JRadioButton("David Gilmour");
		rba2 = new JRadioButton("Freddie Mercury");
		rba3 = new JRadioButton("Paul McCartney");
		rba4 = new JRadioButton("Anthony Kiedis");
		rba5 = new JRadioButton("James Hetfield");
		
		alter = new ButtonGroup();
		alter.add(rba1);
		alter.add(rba2);
		alter.add(rba3);
		alter.add(rba4);
		alter.add(rba5);
		
		btver = new JButton(ver);
		lbcerto = new JLabel(certo);
		lberrado = new JLabel(errado);

		btver.setOpaque(false);
		btver.setContentAreaFilled(false);
		btver.setBorderPainted(false);
	
//		lbp1.setFont(f);
		lbtempo.setBounds(80,220,40,20);
		pbtempo.setBounds(100,220,120,20);
		lbp1.setBounds(20,20,300,20);
		int ran = (int)(Math.random()*5+1);
		if(ran == 1) {
			rba1.setBounds(30,60,150,20);
			rba2.setBounds(30,90,150,20);
			rba3.setBounds(30,120,150,20);
			rba4.setBounds(30,150,150,20);
			rba5.setBounds(30,180,150,20);
		}else if(ran == 2) {
			rba2.setBounds(30,60,150,20);
			rba3.setBounds(30,90,150,20);
			rba1.setBounds(30,120,150,20);
			rba5.setBounds(30,150,150,20);
			rba4.setBounds(30,180,150,20);
		}else if(ran == 3) {
			rba2.setBounds(30,60,150,20);
			rba4.setBounds(30,90,150,20);
			rba5.setBounds(30,120,150,20);
			rba1.setBounds(30,150,150,20);
			rba3.setBounds(30,180,150,20);
		}else if(ran == 4) {
			rba1.setBounds(30,60,150,20);
			rba2.setBounds(30,90,150,20);
			rba3.setBounds(30,120,150,20);
			rba4.setBounds(30,150,150,20);
			rba5.setBounds(30,180,150,20);			
		}else if(ran == 5) {
			rba3.setBounds(30,60,150,20);
			rba2.setBounds(30,90,150,20);
			rba1.setBounds(30,120,150,20);
			rba5.setBounds(30,150,150,20);
			rba4.setBounds(30,180,150,20);
		}
		lbimg.setBounds(330,20,100,100);
		btver.setBounds(340,150,75,75);
		lbcerto.setBounds(340,150,75,75);
		lberrado.setBounds(340,150,75,75);
		
		rba1.setContentAreaFilled(false);
		rba2.setContentAreaFilled(false);
		rba3.setContentAreaFilled(false);
		rba4.setContentAreaFilled(false);
		rba5.setContentAreaFilled(false);
		
		add(lbp1);
		add(rba1);
		add(rba2);
		add(rba3);
		add(rba4);
		add(rba5);
		add(lbimg);
		add(btver);
		add(lbcerto);
		add(lberrado);

		ImageIcon musica = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\musica.jpg");
		JLabel back = new JLabel(musica);
		back.setBounds(0,0,600,600);
		add(back);
		
		lbcerto.setVisible(false);
		lberrado.setVisible(false);
		
	}
	public void DefinirEventos() {
		btver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rba2.isSelected() && a == 1) {
					clip.stop();
				}
			}
		});
		btdica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Tocar(queen);
			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Musica3());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
	public class Delay extends Thread{
		public void run(){
			try {
				lberrado.setVisible(true);
				btver.setVisible(false);
				Thread.sleep(2000);
				lberrado.setVisible(false);
				btver.setVisible(true);
			}catch(Exception ste) {
			}
		}
	}
	public class Tempo extends Thread{
		public void run() {
			while(pbtempo.getValue() > 0) {
				try{
					Thread.sleep(1000);
					pbtempo.setValue(pbtempo.getValue()-1);
					tempo-=1;
					lbtempo.setText(tempo+"");
				}catch(Exception e){
				}
			}
		}
	}
}


