import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Jogo extends JPanel{
	File file = new File("C:\\Users\\wende\\Downloads\\StreetFighter\\musica.wav");
	File flryu = new File("C:\\Users\\wende\\Downloads\\StreetFighter\\ryumusica.wav");
	File flchun = new File("C:\\Users\\wende\\Downloads\\StreetFighter\\chunmusica.wav");
	File flakuma = new File("C:\\Users\\wende\\Downloads\\StreetFighter\\akumamusica.wav");
	File flguile = new File("C:\\Users\\wende\\Downloads\\StreetFighter\\guilemusica.wav");
	Clip clip;
	
	int dific,ir1,ir2,ir3,ir4;
	JComboBox cbdif,cbchar;
	JLabel lbfundo,lbbison,lbryu,lbchun,lbguile,lbakuma,lbryu2,lbchun2,lbguile2,lbakuma2,lbryu3,lbchun3,lbguile3,lbakuma3;
	ImageIcon fundo,bison,ryu,chun,guile,akuma,ryu2,chun2,guile2,akuma2,ryu3,chun3,guile3,akuma3,ir;//,voltar
	JButton btplay,btir;//btvoltar
	JProgressBar pbprojetil;
    SwingWorker w = new SwingWorker() {
        protected Object doInBackground() throws Exception {
        	while(pbprojetil.getValue() != 100 && pbprojetil.getValue() != 0) {
        		lbryu3.setBounds(ir1+pbprojetil.getValue(),180,20,20);
        		lbchun3.setBounds(ir2+pbprojetil.getValue(),180,30,20);
        		lbakuma3.setBounds(ir3+pbprojetil.getValue(),180,40,20);
        		lbguile3.setBounds(ir4+pbprojetil.getValue(),180,45,20);
        		try {
                    pbprojetil.setValue(pbprojetil.getValue()-1);
                    Thread.sleep(dific);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
        	}
        	if(pbprojetil.getValue() == 0) {
        		if(cbchar.getSelectedIndex() == 0) {
        			JOptionPane.showMessageDialog(null,"Você não derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\conryu.jpg"));
        		}else if(cbchar.getSelectedIndex() == 1) {
        			JOptionPane.showMessageDialog(null,"Você não derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\conchun.jpg"));        			
        		}else if(cbchar.getSelectedIndex() == 2) {
        			JOptionPane.showMessageDialog(null,"Você não derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\conakuma.jpg"));        			
        		}else if(cbchar.getSelectedIndex() == 3) {
        			JOptionPane.showMessageDialog(null,"Você não derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\conguile.jpg"));        			
        		}
        		}else if(pbprojetil.getValue() == 100) {
        			if(cbchar.getSelectedIndex() == 0) {
        				JOptionPane.showMessageDialog(null,"Você derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\ryu.jpg"));    
        			}else if(cbchar.getSelectedIndex() == 1) {
        				JOptionPane.showMessageDialog(null,"Você derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\chunli.jpg"));    
        			}else if(cbchar.getSelectedIndex() == 2) {
        				JOptionPane.showMessageDialog(null,"Você derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\akuma.jpg"));    
        			}else if(cbchar.getSelectedIndex() == 3) {
        				JOptionPane.showMessageDialog(null,"Você derrotou M. Bison!","Resultado",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\guile.jpg"));    
        			}
        	}
        	System.exit(0);
        	return 0;
            
        }
        	
    };
	public Jogo() {
		InicializarComponentes();
		DefinirEventos();
	}

	public void InicializarComponentes() {
		setLayout(null);
		PlaySound(file);
		ir1 = 80;ir2 = 80;ir3 = 70;ir4 = 80;dific = 0;
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
		fundo = new ImageIcon("C:\\Users\\wende\\Downloads\\StreetFighter\\fundo.jpg");
		
		
		String[] lista = {"Ryu","Chun Li","Akuma","Guile"};
		String[] difi = {"Fácil","Médio","Difícil","Impossibro"};
		cbdif = new JComboBox(difi);
		cbchar = new JComboBox(lista);
		lbfundo = new JLabel(fundo);
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
		cbdif.setBounds(20,50,100,20);
		pbprojetil.setBounds(90,200,100,20);
		btir.setBounds(160,220,30,30);
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
		cbdif.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2, true));
		cbdif.setBackground(Color.RED);
		
		add(cbchar);
		add(cbdif);
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
		lbfundo.setBounds(0,0,500,500);
		add(lbfundo);
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
				if(cbdif.getSelectedIndex() == 0) {
					dific = 150;
				}else if(cbdif.getSelectedIndex() == 1) {
					dific = 100;
				}else if(cbdif.getSelectedIndex() == 2) {
					dific = 80;
				}else if(cbdif.getSelectedIndex() == 3) {
					dific = 70;
				}
				lbbison.setVisible(true);
				StopSound(file);
				w.execute();
				pbprojetil.setVisible(true);
				btir.setVisible(true);
				//btvoltar.setVisible(true);
				lbryu3.setBounds(ir1+pbprojetil.getValue(),180,20,20);
				lbchun3.setBounds(ir2+pbprojetil.getValue(),180,30,20);
				lbakuma3.setBounds(ir3+pbprojetil.getValue(),180,40,20);
				lbguile3.setBounds(ir4+pbprojetil.getValue(),180,45,20);
				if(cbchar.getSelectedIndex() == 0) {
					PlaySound(flryu);
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
					PlaySound(flchun);
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
					PlaySound(flakuma);
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
					PlaySound(flguile);
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
		JFrame frame = new JFrame("Street Fighter VS M. Bison");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Jogo());
		frame.setBounds(100,0,500,500);
		frame.setVisible(true);
	}
	public void PlaySound(File Sound) {
		try{
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.loop(1000);
		}catch(Exception e) {
		}
	}
	public void StopSound(File Sound) {
		try {
			clip.stop();
		}catch(Exception e) {
		}
	}
		
}

