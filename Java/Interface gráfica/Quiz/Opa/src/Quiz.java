import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Quiz extends JFrame{
	Container c1;
	int tempo,pde;
	int cont = 3;
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
				Musica1 a1 = new Musica1();
				Vazio vazio = new Vazio();
				pde+=1;
				c1.removeAll();
				lbcontador.setBounds(500,20,70,20);
				add(lbcontador);
				tempo = 30;
				lbtempo = new JLabel(tempo+"");
				pbtempo = new JProgressBar();
				pbtempo.setMaximum(30);
				pbtempo.setValue(30);
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
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						else if(a1.rba2.isSelected()) {
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						else if(a1.rba3.isSelected()) {
							cont-=1;lbcontador.setText("Vidas: x"+cont);
						}
						else if(a1.rba4.isSelected()) {
							Musica2 a2 = new Musica2();
							c1.removeAll();
							tempo = 30;
							lbtempo = new JLabel(tempo+"");
							pbtempo = new JProgressBar();
							pbtempo.setMaximum(30);
							pbtempo.setValue(30);
							lbtempo.setBounds(80,220,40,20);
							pbtempo.setBounds(100,220,120,20);
							add(lbtempo);
							add(pbtempo);
							add(lbcontador);
							c1.add(a2);
							c1.validate();
							lbcontador = new JLabel("Vidas: x"+cont);
							add(lbcontador);
							a2.btver.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(a2.rba1.isSelected()) {
										Musica3 a3 = new Musica3();
										c1.removeAll();
										tempo = 30;
										lbtempo = new JLabel(tempo+"");
										pbtempo = new JProgressBar();
										pbtempo.setMaximum(30);
										pbtempo.setValue(30);
										lbtempo.setBounds(80,220,40,20);
										pbtempo.setBounds(100,220,120,20);
										add(lbtempo);
										add(pbtempo);
										lbcontador.setBounds(500,20,70,20);
										add(lbcontador);
										c1.add(a3);
										c1.validate();
										lbcontador = new JLabel("Vidas: x"+cont);
										add(lbcontador);
										a3.btver.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if(a3.rba2.isSelected()) {
													Musica4 a4 = new Musica4();
													c1.removeAll();
													tempo = 30;
													lbtempo = new JLabel(tempo+"");
													pbtempo = new JProgressBar();
													pbtempo.setMaximum(30);
													pbtempo.setValue(30);
													lbtempo.setBounds(80,220,40,20);
													pbtempo.setBounds(100,220,120,20);
													add(lbtempo);
													add(pbtempo);
													lbcontador.setBounds(500,20,70,20);
													add(lbcontador);
													c1.add(a4);
													c1.validate();
													lbcontador = new JLabel("Vidas: x"+cont);
													add(lbcontador);
													//4
													a4.btver.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															if(a4.rba3.isSelected()) {
																Musica5 a5 = new Musica5();
																c1.removeAll();
																tempo = 30;
																lbtempo = new JLabel(tempo+"");
																pbtempo = new JProgressBar();
																pbtempo.setMaximum(30);
																pbtempo.setValue(30);
																lbtempo.setBounds(80,220,40,20);
																pbtempo.setBounds(100,220,120,20);
																add(lbtempo);
																add(pbtempo);
																lbcontador.setBounds(500,20,70,20);
																add(lbcontador);
																c1.add(a5);
																c1.validate();
																lbcontador = new JLabel("Vidas: x"+cont);
																add(lbcontador);
																//5
																a5.btver.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		if(a5.rba5.isSelected()) {
																			Musica6 a6 = new Musica6();
																			c1.removeAll();
																			tempo = 30;
																			lbtempo = new JLabel(tempo+"");
																			pbtempo = new JProgressBar();
																			pbtempo.setMaximum(30);
																			pbtempo.setValue(30);
																			lbtempo.setBounds(80,220,40,20);
																			pbtempo.setBounds(100,220,120,20);
																			add(lbtempo);
																			add(pbtempo);
																			lbcontador.setBounds(500,20,70,20);
																			add(lbcontador);
																			c1.add(a6);
																			c1.validate();
																			lbcontador = new JLabel("Vidas: x"+cont);
																			add(lbcontador);
																			a6.btver.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				a6.corre = a6.tfresto.getText().toUpperCase();
																				if(a6.corre.equals("YOU")) {
																						Musica7 a7 = new Musica7();
																						c1.removeAll();
																						tempo = 30;
																						lbtempo = new JLabel(tempo+"");
																						pbtempo = new JProgressBar();
																						pbtempo.setMaximum(30);
																						pbtempo.setValue(30);
																						lbtempo.setBounds(80,220,40,20);
																						pbtempo.setBounds(100,220,120,20);
																						add(lbtempo);
																						add(pbtempo);
																						lbcontador.setBounds(500,20,70,20);
																						add(lbcontador);
																						c1.add(a7);
																						c1.validate();
																						lbcontador = new JLabel("Vidas: x"+cont);
																						add(lbcontador);
																						a7.btver.addActionListener(new ActionListener() {
																						public void actionPerformed(ActionEvent e) {
																							String abc = "Você acertou: \n";//3 5 7 8
																							int adicionador = 0;
																							if(a7.cbop3.isSelected()) {
																								abc+="David Gilmour\n";adicionador+=1;
																							}
																							if(a7.cbop5.isSelected()) {
																								abc+="Brian May\n";adicionador+=1;
																							}
																							if(a7.cbop7.isSelected()) {
																								abc+="Kurt Cobain\n";adicionador+=1;
																							}
																							if(a7.cbop8.isSelected()) {
																								abc+="Angus Young";adicionador+=1;
																							}
																							JOptionPane.showMessageDialog(null,abc);
																						}
																						});
																					}else {
																						cont-=1;lbcontador.setText("Vidas: x"+cont);
																					}
																				}
																			});
																		}else if(a5.rba2.isSelected()) {
																			cont-=1;lbcontador.setText("Vidas: x"+cont);
																		}
																		else if(a5.rba1.isSelected()) {
																			cont-=1;lbcontador.setText("Vidas: x"+cont);
																		}
																		else if(a5.rba4.isSelected()) {
																			cont-=1;lbcontador.setText("Vidas: x"+cont);
																		}
																		else if(a5.rba5.isSelected()) {
																			cont-=1;lbcontador.setText("Vidas: x"+cont);
																		}
																	}
																});

															}else if(a4.rba2.isSelected()) {
																cont-=1;lbcontador.setText("Vidas: x"+cont);
															}
															else if(a4.rba1.isSelected()) {
																cont-=1;lbcontador.setText("Vidas: x"+cont);
															}
															else if(a4.rba4.isSelected()) {
																cont-=1;lbcontador.setText("Vidas: x"+cont);
															}
															else if(a4.rba5.isSelected()) {
																cont-=1;lbcontador.setText("Vidas: x"+cont);
															}
														}
													});

												}else if(a3.rba1.isSelected()) {
													cont-=1;lbcontador.setText("Vidas: x"+cont);
												}
												else if(a3.rba3.isSelected()) {
													cont-=1;lbcontador.setText("Vidas: x"+cont);
												}
												else if(a3.rba4.isSelected()) {
													cont-=1;lbcontador.setText("Vidas: x"+cont);
												}
												else if(a3.rba5.isSelected()) {
													cont-=1;lbcontador.setText("Vidas: x"+cont);
												}
											}
										});
									}else if(a2.rba2.isSelected()) {
										cont-=1;lbcontador.setText("Vidas: x"+cont);
									}
									else if(a2.rba3.isSelected()) {
										cont-=1;lbcontador.setText("Vidas: x"+cont);
									}
									else if(a2.rba4.isSelected()) {
										cont-=1;lbcontador.setText("Vidas: x"+cont);
									}
									else if(a2.rba5.isSelected()) {
										cont-=1;lbcontador.setText("Vidas: x"+cont);
									}
									
								}
							});
						}
						else if(a1.rba5.isSelected()) {
							cont-=1;lbcontador.setText("Vidas: x"+cont);
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
						tempo = 30;
						pbtempo.setValue(30);
					}
					if(cont <= 0) {
						Vazio vazio = new Vazio();
						JOptionPane.showMessageDialog(null,"Você perdeu as 3 vidas!");
						pde = 0;
						pbtempo.setValue(0);
						c1.removeAll();
						cont = 3;lbcontador.setText("Vidas: x"+cont);
						c1.add(vazio);
						c1.validate();
					}
				}catch(Exception e) {
				}
			}
		}
	}
}

