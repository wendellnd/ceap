import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Quiz extends JFrame{
	Container c1;
	int tempo,pde;
	int cont = 3;
	Musica1 a1 = new Musica1();
	Vazio vazio = new Vazio();
	JLabel lbcontador,lbtempo;
	JProgressBar pbtempo;
	JMenuBar mbbar;
	JMenu mnconfig,mntemas;
	JMenuItem misair,mimusga,mijojo,mianime;
	public Quiz() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		c1 = getContentPane();
		mbbar = new JMenuBar();
		lbcontador = new JLabel("Vidas: x"+cont);
		mnconfig = new JMenu("Config");
		misair = new JMenuItem("Zair");
		
		mntemas = new JMenu("Temas");
		mimusga = new JMenuItem("Música");
		mijojo = new JMenuItem("Jogos");
		mianime = new JMenuItem("Animes");
		
		mnconfig.add(misair);
		mntemas.add(mimusga);
		mntemas.add(mijojo);
		mntemas.add(mianime);
		mbbar.add(mnconfig);
		mbbar.add(mntemas);
		
		setJMenuBar(mbbar);
		
	}
	public void DefinirEventos() {
		misair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mimusga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pde+=1;
				c1.removeAll();
				lbcontador.setBounds(500,20,70,20);
				add(lbcontador);
				tempo = 60;
				lbtempo = new JLabel(tempo+"");
				pbtempo = new JProgressBar();
				pbtempo.setMaximum(60);
				pbtempo.setValue(60);
				lbtempo.setBounds(80,220,40,20);
				pbtempo.setBounds(100,220,120,20);
				add(lbtempo);
				add(pbtempo);
				if(pde == 1) {
					new Tempo().start();
				}
				c1.add(a1);
				c1.validate();
				a1.btver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(a1.rba1.isSelected()) {
							new Delay().start();
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						else if(a1.rba2.isSelected()) {
							new Delay().start();
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						else if(a1.rba3.isSelected()) {
							new Delay().start();
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						else if(a1.rba4.isSelected()) {
							Aula10 a2 = new Aula10();
							c1.removeAll();
							c1.add(a2);
							c1.validate();
						}
						else if(a1.rba5.isSelected()) {
							new Delay().start();
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						if(cont == 0) {
							JOptionPane.showMessageDialog(null,"Você perdeu as 3 vidas!");
							pde = 0;
							c1.removeAll();
							c1.add(vazio);
							c1.revalidate();
							cont = 3;
						}
					}
				});
			}
		});
	}
	
	public static void main(String args[]) {
		Quiz frame = new Quiz();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
	
	public class Delay extends Thread{
		public void run(){
			try {
				a1.lberrado.setVisible(true);
				a1.btver.setVisible(false);
				Thread.sleep(2000);
				a1.lberrado.setVisible(false);
				a1.btver.setVisible(true);
			}catch(Exception ste) {
			}
		}
	}

	public class DelayC extends Thread{
		public void run() {
			try{
				Thread.sleep(2000);
			}catch(Exception ste) {
			}
		}
	}
	public class Tempo extends Thread{
		public void run() {
			while(pbtempo.getValue() != 0) {
				try{
					Thread.sleep(1000);
					pbtempo.setValue(pbtempo.getValue()-1);
					tempo-=1;
					lbtempo.setText(tempo+"");
					if(pbtempo.getValue() == 0) {
						cont-=1;lbcontador.setText("Vidas x"+cont);
						JOptionPane.showMessageDialog(null,"Cuidado! Você perdeu 1 vida pela demora!");
						tempo = 60;
						pbtempo.setValue(60);
					}
					if(cont == 0 && pbtempo.getValue() == 0) {
						pde = 0;
						pbtempo.setValue(0);
						JOptionPane.showMessageDialog(null,"Você perdeu as 3 vidas!");
						c1.removeAll();
						c1.add(vazio);
						c1.validate();
						cont = 3;
					}
				}catch(Exception e) {
				}
			}

		}
	}
}

