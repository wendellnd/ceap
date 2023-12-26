import javax.swing.*;
import java.awt.Container;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;;
public class MainJogo extends JFrame{
	Container c1;
	ImageIcon img = new ImageIcon("Imagens\\fundo.png");
	JLabel lbfundo = new JLabel(img);
	JButton btstart = new JButton("Iniciar");
	JButton btstart2 = new JButton("Iniciar2");
	JButton btstart3 = new JButton("Iniciar3");
	static DisplayMode monitor = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
	
	static SpaceInvaders spaceInvaders = new SpaceInvaders();
	static SpaceInvaders2 spaceInvaders2 = new SpaceInvaders2();
	static SpaceInvaders3 spaceInvaders3 = new SpaceInvaders3();
	
	public MainJogo() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setLayout(null);
		c1 = getContentPane();
		btstart.setBounds(20,20,100,20);
		btstart2.setBounds(20,100,100,20);
		btstart3.setBounds(20,200,100,20);
		lbfundo.setBounds(0,0,monitor.getWidth(),monitor.getHeight());
		add(btstart);
		add(btstart2);
		add(btstart3);
		add(lbfundo);
		
	}
	public void definirEventos() {
		btstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.removeAll();
				spaceInvaders.setBounds( 0, 0, monitor.getWidth(), monitor.getHeight());
				add(spaceInvaders);
				addKeyListener(spaceInvaders);
				c1.validate();
				requestFocus();
			}
		});
		btstart2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.removeAll();
				spaceInvaders2.setBounds( 0, 0, monitor.getWidth(), monitor.getHeight());
				add(spaceInvaders2);
				addKeyListener(spaceInvaders2);
				c1.validate();
				requestFocus();
			}
		});
		btstart3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.removeAll();
				spaceInvaders3.setBounds( 0, 0, monitor.getWidth(), monitor.getHeight());
				add(spaceInvaders3);
				addKeyListener(spaceInvaders3);
				c1.validate();
				requestFocus();
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
}
