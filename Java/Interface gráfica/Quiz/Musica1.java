import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Musica1 extends JPanel{
//	Font f = new Font("SansSerif", Font.BOLD, 15);
	int tempo;
	JProgressBar pbtempo;
	JLabel lbp1,lbimg,lbcerto,lberrado,lbtempo;
	ImageIcon img,ver,certo,errado;
	JButton btver;
	JRadioButton rba1,rba2,rba3,rba4,rba5;
	ButtonGroup alter;

	public Musica1() {
		InicializarComponentes();
		DefinirEventos();
		}
	public void InicializarComponentes() {
		setLayout(null);
		img = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\pgm1.jpg");
		ver = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\verificar.png");
		certo = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\certo.png");
		errado = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\errado.png");
		
		lbp1 = new JLabel("Quem lançou o álbum Animals?");
		lbimg = new JLabel(img);
		
		tempo = 60;
		lbtempo = new JLabel(tempo+"");
		pbtempo = new JProgressBar();
		pbtempo.setMaximum(60);
		pbtempo.setValue(60);
		
		rba1 = new JRadioButton("The Beatles");
		rba2 = new JRadioButton("Queen");
		rba3 = new JRadioButton("Rolling Stones");
		rba4 = new JRadioButton("Pink Floyd");
		rba5 = new JRadioButton("Jimi Hendrix");
		
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
		int ran = (int)(Math.random()*3+1);
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
		}
		lbimg.setBounds(330,20,100,100);
		btver.setBounds(340,150,75,75);
		lbcerto.setBounds(340,150,75,75);
		lberrado.setBounds(340,150,75,75);
		
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

		
		lbcerto.setVisible(false);
		lberrado.setVisible(false);
		
	}
	public void DefinirEventos() {
		
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Música");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Musica1());
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


