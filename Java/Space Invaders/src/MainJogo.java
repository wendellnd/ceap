import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.File;;
public class MainJogo extends JFrame{
	Container c1;
	private ImageIcon img = new ImageIcon("Imagens\\fundo.png"), titulo = new ImageIcon("Imagens\\titulo.png");
	private JLabel lbfundo = new JLabel(img), lbtitulo = new JLabel(titulo);
	private JButton btstart2 = new JButton("Fácil"),btstart = new JButton("Médio"),btstart3 = new JButton("Difícil"),btSair = new JButton("Sair");
	private JButton btDescricao = new JButton("Descrição");
	private File botaosom = new File("Musicas\\selectbutton.wav");
	private Descricao ds = new Descricao();
	static DisplayMode monitor = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();

	SpaceInvaders spaceInvaders;
	SpaceInvaders2 spaceInvaders2;
	SpaceInvaders3 spaceInvaders3;
	
	public void Adicionar() {
		c1.removeAll();
		c1.add(lbtitulo);
		c1.add(btstart);
		c1.add(btstart2);
		c1.add(btstart3);
		c1.add(btDescricao);
		c1.add(btSair);
		c1.add(lbfundo);
		c1.validate();
		c1.repaint();
	}
	
	public void selectedButtonSound(File Sound) {
		Clip clip;
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		}catch(Exception e) {
		}
	}
	
	public MainJogo() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setLayout(null);
		
		c1 = getContentPane();
		
		btstart2.setForeground(Color.white);
		btstart.setForeground(Color.white);
		btstart3.setForeground(Color.white);
		btDescricao.setForeground(Color.white);
		btSair.setForeground(Color.white);

		btstart2.setBackground(Color.black);
		btstart.setBackground(Color.black);
		btstart3.setBackground(Color.black);
		btDescricao.setBackground(Color.black);
		btSair.setBackground(Color.black);
		
		btstart2.setBounds(monitor.getWidth()/2-300,monitor.getHeight()/2,100,20);
		btstart.setBounds(monitor.getWidth()/2-50,monitor.getHeight()/2,100,20);
		btstart3.setBounds(monitor.getWidth()/2+200,monitor.getHeight()/2,100,20);
		btDescricao.setBounds(monitor.getWidth()-150,monitor.getHeight()-100,100,20);
		btSair.setBounds(monitor.getWidth()-150,monitor.getHeight()-70,100,20);

		lbtitulo.setBounds(monitor.getWidth()/2-300,monitor.getHeight()/2-325, 600, 250);
		lbfundo.setBounds(0,0,monitor.getWidth(),monitor.getHeight());
		
		add(btstart);
		add(btstart2);
		add(btstart3);
		add(btDescricao);
		add(btSair);
		add(lbtitulo);
		add(lbfundo);
		
	}
	public void definirEventos() {
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btDescricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.removeAll();
				c1.add(ds.btVoltar);
				c1.add(ds.taDescricao);
				c1.add(lbfundo);
				c1.validate();
				c1.repaint();
			}
		});
		ds.btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.removeAll();
				Adicionar();
			}
		});
		btstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButtonSound(botaosom);
				c1.removeAll();
				spaceInvaders = new SpaceInvaders();
				spaceInvaders.setBounds(0, 0, monitor.getWidth(), monitor.getHeight());
				c1.add(spaceInvaders);
				c1.addKeyListener(spaceInvaders);
				c1.validate();
				c1.requestFocus();
				new verifica().start();
			}
		});
		btstart2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButtonSound(botaosom);
				c1.removeAll();
				spaceInvaders2 = new SpaceInvaders2();
				spaceInvaders2.setBounds(0, 0, monitor.getWidth(), monitor.getHeight());
				c1.add(spaceInvaders2);
				c1.addKeyListener(spaceInvaders2);
				c1.validate();
				c1.requestFocus();
				new verifica2().start();
			}
		});
		btstart3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedButtonSound(botaosom);
				c1.removeAll();
				spaceInvaders3 = new SpaceInvaders3();
				spaceInvaders3.setBounds( 0, 0, monitor.getWidth(), monitor.getHeight());
				c1.add(spaceInvaders3);
				c1.addKeyListener(spaceInvaders3);
				c1.validate();
				c1.requestFocus();
				new verifica3().start();
			}
		});
	}
	public static void main(String args[]) {
		MainJogo frame = new MainJogo();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(MainJogo.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public class verifica extends Thread{
		public void run() {
			try {
				boolean ver = false;
				while(ver == false){
					System.out.println(spaceInvaders.getVenceu());
					System.out.println(spaceInvaders.getPerdeu());
					if(spaceInvaders.getVenceu() == true || spaceInvaders.getPerdeu() == true) {
						if(spaceInvaders.getVenceu() == true) {
							Thread.sleep(7000);
						}
						if(spaceInvaders.getPerdeu() == true) {
							Thread.sleep(4000);
						}
						Adicionar();
						spaceInvaders.jogando = false;
						ver = true;
					}
				}
			}catch(Exception e) {
			}
		}
	}
	public class verifica2 extends Thread{
		public void run() {
			try {
				boolean ver = false;
				while(ver == false){
					System.out.println(spaceInvaders2.getVenceu());
					System.out.println(spaceInvaders2.getPerdeu());
					if(spaceInvaders2.getVenceu() == true || spaceInvaders2.getPerdeu() == true) {
						if(spaceInvaders2.getVenceu() == true) {
							Thread.sleep(7000);
						}
						if(spaceInvaders2.getPerdeu() == true) {
							Thread.sleep(4000);
						}
						Adicionar();
						spaceInvaders2.jogando = false;
						ver = true;
					}
				}
			}catch(Exception e) {
			}
		}
	}
	public class verifica3 extends Thread{
		public void run() {
			try {
				boolean ver = false;
				while(ver == false){
					System.out.println(spaceInvaders3.getVenceu());
					System.out.println(spaceInvaders3.getPerdeu());
					if(spaceInvaders3.getVenceu() == true || spaceInvaders3.getPerdeu() == true) {
						if(spaceInvaders3.getVenceu() == true) {
							Thread.sleep(7000);
						}
						if(spaceInvaders3.getPerdeu() == true) {
							Thread.sleep(4000);
						}
						Adicionar();
						spaceInvaders3.jogando = false;
						ver = true;
					}
				}
			}catch(Exception e) {
			}
		}
	}
}
