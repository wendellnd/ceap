import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Jogo extends JPanel{
	int ir1,ir2,ir3,ir4;
	JComboBox cbchar;
	JLabel lbbison,lbryu,lbchun,lbguile,lbakuma,lbryu2,lbchun2,lbguile2,lbakuma2,lbryu3,lbchun3,lbguile3,lbakuma3;
	ImageIcon bison,ryu,chun,guile,akuma,ryu2,chun2,guile2,akuma2,ryu3,chun3,guile3,akuma3,ir;//,voltar
	JButton btplay,btir;//btvoltar
	JProgressBar pbprojetil;
	public Jogo() {
		InicializarComponentes();
		DefinirEventos();
	}
    SwingWorker w = new SwingWorker() {
        protected Object doInBackground() throws Exception {
        	while(pbprojetil.getValue() != 100 && pbprojetil.getValue() != 0) {
        		lbryu3.setBounds(ir1+pbprojetil.getValue(),180,20,20);
        		lbchun3.setBounds(ir2+pbprojetil.getValue(),180,30,20);
        		lbakuma3.setBounds(ir3+pbprojetil.getValue(),180,40,20);
        		lbguile3.setBounds(ir4+pbprojetil.getValue(),180,45,20);
        		try {
                    pbprojetil.setValue(pbprojetil.getValue()-1);
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
        	}
        	if(pbprojetil.getValue() == 0) {
        		JOptionPane.showMessageDialog(null,"Você não derrotou M. Bison!");
        	}else if(pbprojetil.getValue() == 100) {
        		JOptionPane.showMessageDialog(null,"Você derrotou M. Bison!");        		
        	}
        	System.exit(0);
        	return 0;
            
        }
        	
    };
	public void InicializarComponentes() {
		setLayout(null);
		
		ir1 = 80;ir2 = 80;ir3 = 70;ir4 = 80;
		ir = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\ir.png");
		//voltar = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\voltar.png");
		ryu = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\ryu.jpg");
		chun = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\chunli.jpg");
		akuma = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\akuma.jpg");
		guile = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\guile.jpg");
		ryu2 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\ryu2.jpg");
		chun2 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\chun2.jpg");
		akuma2 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\akuma2.jpg");
		guile2 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\guile2.jpg");
		ryu3 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\ryu3.jpg");
		chun3 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\chun3.jpg");
		akuma3 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\akuma3.jpg");
		guile3 = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\guile3.jpg");
		bison = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\bison.jpg");
		String[] lista = {"Ryu","Chun Li","Akuma","Guile"};
		
		cbchar = new JComboBox(lista);

		lbryu = new JLabel(ryu);
		lbchun = new JLabel(chun);
		lbakuma = new JLabel(akuma);
		lbguile = new JLabel(guile);
		lbryu2 = new JLabel(ryu2);
		lbchun2 = new JLabel(chun2);
		lbakuma2 = new JLabel(akuma2);
		lbguile2 = new JLabel(guile2);
		lbchun3 = new JLabel(chun3);
		lbryu3 = new JLabel(ryu3);
		lbakuma3 = new JLabel(akuma3);
		lbguile3 = new JLabel(guile3);
		lbbison = new JLabel(bison);
		
		btplay = new JButton("Jogar");
		btir = new JButton(ir);
		//btvoltar = new JButton(voltar);
		
		pbprojetil = new JProgressBar();
		pbprojetil.setValue(50);
		cbchar.setBounds(20,20,100,20);
		pbprojetil.setBounds(90,200,100,20);
		btir.setBounds(170,230,20,20);
		//btvoltar.setBounds(90,230,20,20);
		lbryu2.setBounds(5,170,70,70);
		lbchun2.setBounds(5,170,70,70);
		lbakuma2.setBounds(5,170,80,70);
		lbguile2.setBounds(5,170,70,70);
		lbryu.setBounds(150,20,100,100);
		lbchun.setBounds(150,20,100,100);
		lbakuma.setBounds(150,20,100,100);
		lbguile.setBounds(150,20,100,100);
		lbryu3.setBounds(ir1+pbprojetil.getValue(),180,20,20);
		lbchun3.setBounds(ir2+pbprojetil.getValue(),180,30,20);
		lbakuma3.setBounds(ir3+pbprojetil.getValue(),180,40,20);
		lbguile3.setBounds(ir4+pbprojetil.getValue(),180,45,20);
		lbbison.setBounds(191,170,100,100);
		btplay.setBounds(160,130,80,20);
		
		cbchar.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2, true));
		cbchar.setBackground(Color.RED);
		
		add(cbchar);
		add(pbprojetil);
		add(btir);
		//add(btvoltar);
		add(lbryu2);
		add(lbchun2);
		add(lbakuma2);
		add(lbguile2);		
		add(lbchun3);
		add(lbryu3);
		add(lbakuma3);
		add(lbguile3);
		add(lbryu);
		add(lbchun);
		add(lbakuma);
		add(lbguile);
		add(lbbison);
		add(btplay);
		
		lbryu.setVisible(false);
		lbchun.setVisible(false);
		lbguile.setVisible(false);
		lbakuma.setVisible(false);
		lbryu2.setVisible(false);
		lbchun2.setVisible(false);
		lbakuma2.setVisible(false);
		lbguile2.setVisible(false);
		lbryu3.setVisible(false);
		lbchun3.setVisible(false);
		lbakuma3.setVisible(false);
		lbguile3.setVisible(false);
		lbbison.setVisible(false);
		pbprojetil.setVisible(false);
		btplay.setVisible(false);
		btir.setVisible(false);
		//btvoltar.setVisible(false);

		
	}

	public void DefinirEventos() {
		cbchar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				btplay.setVisible(true);
				if(cbchar.getSelectedIndex() == 0) {
					lbryu.setVisible(true);
					lbchun.setVisible(false);
					lbakuma.setVisible(false);
					lbguile.setVisible(false);					
				}
				if(cbchar.getSelectedIndex() == 1) {
					lbryu.setVisible(false);
					lbchun.setVisible(true);
					lbakuma.setVisible(false);
					lbguile.setVisible(false);					
				}
				if(cbchar.getSelectedIndex() == 2) {
					lbryu.setVisible(false);
					lbchun.setVisible(false);
					lbakuma.setVisible(true);
					lbguile.setVisible(false);					
				}
				if(cbchar.getSelectedIndex() == 3) {
					lbryu.setVisible(false);
					lbchun.setVisible(false);
					lbakuma.setVisible(false);
					lbguile.setVisible(true);					
				}
			}
});	
		btplay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbbison.setVisible(true);
				w.execute();
				pbprojetil.setVisible(true);
				btir.setVisible(true);
				//btvoltar.setVisible(true);
				lbryu3.setBounds(ir1+pbprojetil.getValue(),180,20,20);
				lbchun3.setBounds(ir2+pbprojetil.getValue(),180,30,20);
				lbakuma3.setBounds(ir3+pbprojetil.getValue(),180,40,20);
				lbguile3.setBounds(ir4+pbprojetil.getValue(),180,45,20);
				if(cbchar.getSelectedIndex() == 0) {
					lbryu2.setVisible(true);
					lbryu3.setVisible(true);
					lbchun2.setVisible(false);
					lbchun3.setVisible(false);
					lbakuma2.setVisible(false);
					lbakuma3.setVisible(false);
					lbguile2.setVisible(false);
					lbguile3.setVisible(false);
					pbprojetil.setForeground(Color.RED);
				}
				if(cbchar.getSelectedIndex() == 1) {
					lbchun2.setVisible(true);
					lbchun3.setVisible(true);
					lbryu2.setVisible(false);
					lbryu3.setVisible(false);
					lbakuma2.setVisible(false);
					lbakuma3.setVisible(false);
					lbguile2.setVisible(false);
					lbguile3.setVisible(false);
					pbprojetil.setForeground(Color.BLUE);
				}
				if(cbchar.getSelectedIndex() == 2) {
					lbakuma2.setVisible(true);
					lbakuma3.setVisible(true);
					lbchun2.setVisible(false);
					lbchun3.setVisible(false);
					lbryu2.setVisible(false);
					lbryu3.setVisible(false);
					lbguile2.setVisible(false);
					lbguile3.setVisible(false);
					pbprojetil.setForeground(Color.decode("#882288"));
				}
				if(cbchar.getSelectedIndex() == 3) {
					lbguile2.setVisible(true);
					lbguile3.setVisible(true);
					lbchun2.setVisible(false);
					lbchun3.setVisible(false);
					lbakuma2.setVisible(false);
					lbakuma3.setVisible(false);
					lbryu2.setVisible(false);
					lbryu3.setVisible(false);
					pbprojetil.setForeground(Color.YELLOW);
				}
			}
});
		btir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pbprojetil.setValue(pbprojetil.getValue()+2);
				if(cbchar.getSelectedIndex() == 0) {
					if(ir1 < 180) {
						lbryu3.setBounds(ir1+pbprojetil.getValue(),180,20,20);
					}
				}
				if(cbchar.getSelectedIndex() == 1) {
					if(ir2 < 180) {
						lbchun3.setBounds(ir2+pbprojetil.getValue(),180,30,20);
					}
				}
				if(cbchar.getSelectedIndex() == 2) {
					if(ir3 < 180) {
						lbakuma3.setBounds(ir3+pbprojetil.getValue(),180,40,20);
					}
				}
				if(cbchar.getSelectedIndex() == 3) {
					if(ir4 < 180) {
						lbguile3.setBounds(ir4+pbprojetil.getValue(),180,45,20);
					}
				}
			}
});
/*
		btvoltar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pbprojetil.setValue(pbprojetil.getValue()-2);
				if(cbchar.getSelectedIndex() == 0) {
					if(ir1 > 80) {
						lbryu3.setBounds(ir1-=2,180,20,20);
					}
				}
				if(cbchar.getSelectedIndex() == 1) {
					if(ir2 > 80) {
						lbchun3.setBounds(ir2-=2,180,30,20);
					}
				}
				if(cbchar.getSelectedIndex() == 2) {
					if(ir3 > 70) {
						lbakuma3.setBounds(ir3-=2,180,40,20);
					}
				}
				if(cbchar.getSelectedIndex() == 3) {
					if(ir4 > 80) {
						lbguile3.setBounds(ir4-=2,180,45,20);
					}
				}
			}
});	*/
	}
	public static void main(String args[]){
		File file = new File("C:\\Users\\wende\\Downloads\\StreetFighter\\musica.wav");
		PlaySound(file);
		JFrame frame = new JFrame("Jogo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Jogo());
		frame.setBounds(100,0,500,500);
		frame.setVisible(true);

	}
	public static void PlaySound(File Sound) {
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.loop(1000);
		}catch(Exception e) {
			
		}
		
	}
}

