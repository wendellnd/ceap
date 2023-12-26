import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class Quiz extends JFrame{
	Container c1;
	int tempo,pde;
	int pontos = 0;
	int cont = 3;
	JLabel lbtempo;
	JProgressBar pbtempo;
	JTextField tfpont,tfcontador;
	JMenuBar mbbar;
	JMenu mnconfig,mntemas;
	JMenuItem misair,mitutorial,mimusga,mijojo,mianime;
	public Quiz() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		c1 = getContentPane();
		ImageIcon abcd = new ImageIcon("C:\\Users\\wende\\Downloads\\Quiz\\ezgif.gif");
		JLabel abc = new JLabel(abcd);
		add(abc);
		mbbar = new JMenuBar();
		tfcontador = new JTextField("Vidas: x"+cont);
		c1.setBackground(new Color(173,216,230));
		mnconfig = new JMenu("Config");
		mitutorial = new JMenuItem("Tutorial");
		misair = new JMenuItem("Zair");
		tfpont = new JTextField(pontos+"");
		tfpont.setEditable(false);
		mntemas = new JMenu("Temas");
		mimusga = new JMenuItem("Música");
		mijojo = new JMenuItem("Jogos");
		mianime = new JMenuItem("Animes");

		tfcontador.setOpaque(false);
		tfcontador.setBorder(null);
		Font f = new Font("SansSerif", Font.BOLD, 12);
		tfcontador.setFont(f);
		tfcontador.setEditable(false);
		
		mnconfig.add(mitutorial);
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
		mitutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tutorial a1 = new Tutorial();
				c1.removeAll();
				c1.add(a1);
				c1.validate();
				a1.btvoltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Vazio vazio = new Vazio();
						c1.removeAll();
						c1.add(vazio);
						c1.validate();
					}
				});
			}
		});
		mimusga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musica1 a1 = new Musica1();
				Vazio vazio = new Vazio();
				pde+=1;
				c1.removeAll();
				tfcontador.setText("Vidas: x"+cont);
				add(tfcontador);
				tfpont.setText(pontos+"");
				add(tfpont);
				tempo = 30;
				lbtempo = new JLabel(tempo+"");
				pbtempo = new JProgressBar();
				pbtempo.setMaximum(30);
				pbtempo.setValue(30);
				tfcontador.setBounds(500,20,70,20);
				tfpont.setBounds(490,200,70,20);
				lbtempo.setBounds(80,220,40,20);
				pbtempo.setBounds(100,220,120,20);
				add(lbtempo);
				add(pbtempo);
				if(pde == 1) {
					new Tempo().start();
				}
				c1.add(a1);
				c1.validate();
				a1.btdica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pontos-=1500;tfpont.setText(pontos+"");
					}
				});
				a1.btver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new Texto().start();
						if(a1.rba1.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba2.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba3.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba4.isSelected()) {
							pontos+=1000*cont;
							Musica2 a2 = new Musica2();
							c1.removeAll();
							tfcontador.setText("Vidas: x"+cont);
							add(tfcontador);
							tfpont.setText(pontos+"");
							add(tfpont);
							tempo = 30;
							lbtempo = new JLabel(tempo+"");
							pbtempo = new JProgressBar();
							pbtempo.setMaximum(30);
							pbtempo.setValue(30);
							lbtempo.setBounds(80,220,40,20);
							pbtempo.setBounds(100,220,120,20);
							add(lbtempo);
							add(pbtempo);
							c1.add(a2);
							c1.validate();
							a2.btdica.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									pontos-=1500;tfpont.setText(pontos+"");
								}
							});
							a2.btver.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(a2.rba1.isSelected()) {
										pontos+=1000*cont;
										Musica3 a3 = new Musica3();
										c1.removeAll();
										tfcontador.setText("Vidas: x"+cont);
										add(tfcontador);
										tfpont.setText(pontos+"");
										add(tfpont);
										tempo = 30;
										lbtempo = new JLabel(tempo+"");
										pbtempo = new JProgressBar();
										pbtempo.setMaximum(30);
										pbtempo.setValue(30);
										lbtempo.setBounds(80,220,40,20);
										pbtempo.setBounds(100,220,120,20);
										add(lbtempo);
										add(pbtempo);
										c1.add(a3);
										c1.validate();
										a3.btdica.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												pontos-=1500;tfpont.setText(pontos+"");
											}
										});
										a3.btver.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if(a3.rba2.isSelected()) {
													pontos+=1000*cont;
													Musica4 a4 = new Musica4();
													c1.removeAll();
													tfcontador.setText("Vidas: x"+cont);
													add(tfcontador);
													tfpont.setText(pontos+"");
													add(tfpont);
													tempo = 30;
													lbtempo = new JLabel(tempo+"");
													pbtempo = new JProgressBar();
													pbtempo.setMaximum(30);
													pbtempo.setValue(30);
													lbtempo.setBounds(80,220,40,20);
													pbtempo.setBounds(100,220,120,20);
													add(lbtempo);
													add(pbtempo);
													c1.add(a4);
													c1.validate();
													//4
													a4.btdica.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															pontos-=1500;tfpont.setText(pontos+"");
														}
													});
													a4.btver.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															if(a4.rba3.isSelected()) {
																pontos+=1000*cont;
																Musica5 a5 = new Musica5();
																c1.removeAll();
																tfcontador.setText("Vidas: x"+cont);
																add(tfcontador);
																tfpont.setText(pontos+"");
																add(tfpont);
																tempo = 30;
																lbtempo = new JLabel(tempo+"");
																pbtempo = new JProgressBar();
																pbtempo.setMaximum(30);
																pbtempo.setValue(30);
																lbtempo.setBounds(80,220,40,20);
																pbtempo.setBounds(100,220,120,20);
																add(lbtempo);
																add(pbtempo);
																c1.add(a5);
																c1.validate();
																//5
																a5.btdica.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		pontos-=1500;tfpont.setText(pontos+"");
																	}
																});
																a5.btver.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		if(a5.rba5.isSelected()) {
																			pontos+=1000*cont;
																			Musica6 a6 = new Musica6();
																			c1.removeAll();
																			tfcontador.setText("Vidas: x"+cont);
																			add(tfcontador);
																			tfpont.setText(pontos+"");
																			add(tfpont);
																			tempo = 30;
																			lbtempo = new JLabel(tempo+"");
																			pbtempo = new JProgressBar();
																			pbtempo.setMaximum(30);
																			pbtempo.setValue(30);
																			lbtempo.setBounds(80,220,40,20);
																			pbtempo.setBounds(100,220,120,20);
																			add(lbtempo);
																			add(pbtempo);
																			c1.add(a6);
																			c1.validate();
																			a6.btdica.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					pontos-=1500;tfpont.setText(pontos+"");
																				}
																			});
																			a6.btver.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				a6.corre = a6.tfresto.getText().toUpperCase();
																				if(a6.corre.equals("YOU")) {
																						pontos+=1000*cont;
																						Musica7 a7 = new Musica7();
																						c1.removeAll();
																						tfcontador.setText("Vidas: x"+cont);
																						add(tfcontador);
																						tfpont.setText(pontos+"");
																						add(tfpont);
																						tempo = 30;
																						lbtempo = new JLabel(tempo+"");
																						pbtempo = new JProgressBar();
																						pbtempo.setMaximum(30);
																						pbtempo.setValue(30);
																						lbtempo.setBounds(80,220,40,20);
																						pbtempo.setBounds(100,220,120,20);
																						add(lbtempo);
																						add(pbtempo);
																						c1.add(a7);
																						c1.validate();
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
																								pontos+=1000*adicionador;
																								Musica8 a8 = new Musica8();
																								c1.removeAll();
																								tfcontador.setText("Vidas: x"+cont);
																								add(tfcontador);
																								tfpont.setText(pontos+"");
																								add(tfpont);
																								tempo = 30;
																								lbtempo = new JLabel(tempo+"");
																								pbtempo = new JProgressBar();
																								pbtempo.setMaximum(30);
																								pbtempo.setValue(30);
																								lbtempo.setBounds(80,220,40,20);
																								pbtempo.setBounds(100,220,120,20);
																								add(lbtempo);
																								add(pbtempo);
																								c1.add(a8);
																								c1.validate();
																								tfpont.setBounds(490,200,70,20);
																								tfcontador.setBounds(500,20,70,20);
																								tfcontador.setText("Vidas: x"+cont);
																								tfpont.setText(pontos+"");
																								tfpont.setBounds(490,200,70,20);
																								tfcontador.setBounds(500,20,70,20);
																								a8.btdica.addActionListener(new ActionListener() {
																									public void actionPerformed(ActionEvent e) {
																										pontos-=1500;tfpont.setText(pontos+"");
																									}
																								});
																								a8.btver.addActionListener(new ActionListener() {                               
																									public void actionPerformed(ActionEvent e) {
																										a8.corre = a8.tfresto.getText().toUpperCase();
																										if(a8.corre.equals("GLITTERS")) {
																											pontos+=1000*cont;
																											if(pontos == 25000) {
																												JOptionPane.showMessageDialog(null, "Parabéns! Você completou o quiz!\n Pontuação: "+pontos+"\nPontuação Máxima!");
																											}else {
																												JOptionPane.showMessageDialog(null, "Parabéns! Você completou o quiz!\n Pontuação: "+pontos);	
																											}
																											pontos = 0;
																											new Tempo().interrupt();
																											c1.removeAll();
																											c1.add(vazio);
																											c1.validate();
																										}else {
																											cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																										}
																									}
																								});
																							}	
																						});
																					}else {
																						cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																					}
																				}
																			});
																		}else if(a5.rba2.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba1.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba4.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba5.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																	}
																});

															}else if(a4.rba2.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba1.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba4.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba5.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
														}
													});

												}else if(a3.rba1.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba3.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba4.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba5.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
											}
										});
									}else if(a2.rba2.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba3.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba4.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba5.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									
								}
							});
						}
						else if(a1.rba5.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
					}
				});
			}
		});
		//Jogo
		mijojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogo1 a1 = new Jogo1();
				Vazio vazio = new Vazio();
				pde+=1;
				c1.removeAll();
				tfcontador.setText("Vidas: x"+cont);
				add(tfcontador);
				tfpont.setText(pontos+"");
				add(tfpont);
				tempo = 30;
				lbtempo = new JLabel(tempo+"");
				pbtempo = new JProgressBar();
				pbtempo.setMaximum(30);
				pbtempo.setValue(30);
				tfcontador.setBounds(500,20,70,20);
				tfpont.setBounds(490,200,70,20);
				lbtempo.setBounds(80,220,40,20);
				pbtempo.setBounds(100,220,120,20);
				add(lbtempo);
				add(pbtempo);
				new Texto().start();
				if(pde == 1) {
					new Tempo().start();
				}
				c1.add(a1);
				c1.validate();
				a1.btdica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pontos-=1500;tfpont.setText(pontos+"");
					}
				});
				a1.btver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(a1.rba1.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba2.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba3.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba4.isSelected()) {
							pontos+=1000*cont;
							Jogo2 a2 = new Jogo2();
							c1.removeAll();
							tfcontador.setText("Vidas: x"+cont);
							add(tfcontador);
							tfpont.setText(pontos+"");
							add(tfpont);
							tempo = 30;
							lbtempo = new JLabel(tempo+"");
							pbtempo = new JProgressBar();
							pbtempo.setMaximum(30);
							pbtempo.setValue(30);
							lbtempo.setBounds(80,220,40,20);
							pbtempo.setBounds(100,220,120,20);
							add(lbtempo);
							add(pbtempo);
							c1.add(a2);
							c1.validate();
							a2.btdica.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									pontos-=1500;tfpont.setText(pontos+"");
								}
							});
							a2.btver.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(a2.rba1.isSelected()) {
										pontos+=1000*cont;
										Jogo3 a3 = new Jogo3();
										c1.removeAll();
										tfcontador.setText("Vidas: x"+cont);
										add(tfcontador);
										tfpont.setText(pontos+"");
										add(tfpont);
										tempo = 30;
										lbtempo = new JLabel(tempo+"");
										pbtempo = new JProgressBar();
										pbtempo.setMaximum(30);
										pbtempo.setValue(30);
										lbtempo.setBounds(80,220,40,20);
										pbtempo.setBounds(100,220,120,20);
										add(lbtempo);
										add(pbtempo);
										c1.add(a3);
										c1.validate();
										a3.btdica.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												pontos-=1500;tfpont.setText(pontos+"");
											}
										});
										a3.btver.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if(a3.rba2.isSelected()) {
													pontos+=1000*cont;
													Jogo4 a4 = new Jogo4();
													c1.removeAll();
													tfcontador.setText("Vidas: x"+cont);
													add(tfcontador);
													tfpont.setText(pontos+"");
													add(tfpont);
													tempo = 30;
													lbtempo = new JLabel(tempo+"");
													pbtempo = new JProgressBar();
													pbtempo.setMaximum(30);
													pbtempo.setValue(30);
													lbtempo.setBounds(80,220,40,20);
													pbtempo.setBounds(100,220,120,20);
													add(lbtempo);
													add(pbtempo);
													c1.add(a4);
													c1.validate();
													//4
													a4.btdica.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															pontos-=1500;tfpont.setText(pontos+"");
														}
													});
													a4.btver.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															if(a4.rba3.isSelected()) {
																pontos+=1000*cont;
																Jogo5 a5 = new Jogo5();
																c1.removeAll();
																tfcontador.setText("Vidas: x"+cont);
																add(tfcontador);
																tfpont.setText(pontos+"");
																add(tfpont);
																tempo = 30;
																lbtempo = new JLabel(tempo+"");
																pbtempo = new JProgressBar();
																pbtempo.setMaximum(30);
																pbtempo.setValue(30);
																lbtempo.setBounds(80,220,40,20);
																pbtempo.setBounds(100,220,120,20);
																add(lbtempo);
																add(pbtempo);
																c1.add(a5);
																c1.validate();
																//5
																a5.btdica.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		pontos-=1500;tfpont.setText(pontos+"");
																	}
																});
																a5.btver.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		if(a5.rba5.isSelected()) {
																			pontos+=1000*cont;
																			Jogo6 a6 = new Jogo6();
																			c1.removeAll();
																			tfcontador.setText("Vidas: x"+cont);
																			add(tfcontador);
																			tfpont.setText(pontos+"");
																			add(tfpont);
																			tempo = 30;
																			lbtempo = new JLabel(tempo+"");
																			pbtempo = new JProgressBar();
																			pbtempo.setMaximum(30);
																			pbtempo.setValue(30);
																			lbtempo.setBounds(80,220,40,20);
																			pbtempo.setBounds(100,220,120,20);
																			add(lbtempo);
																			add(pbtempo);
																			c1.add(a6);
																			c1.validate();
																			a6.btdica.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					pontos-=1500;tfpont.setText(pontos+"");
																				}
																			});
																			a6.btver.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				a6.corre = a6.tfresto.getText().toUpperCase();
																				if(a6.corre.equals("ROLL")) {
																						pontos+=1000*cont;
																						Jogo7 a7 = new Jogo7();
																						c1.removeAll();
																						tfcontador.setText("Vidas: x"+cont);
																						add(tfcontador);
																						tfpont.setText(pontos+"");
																						add(tfpont);
																						tempo = 30;
																						lbtempo = new JLabel(tempo+"");
																						pbtempo = new JProgressBar();
																						pbtempo.setMaximum(30);
																						pbtempo.setValue(30);
																						lbtempo.setBounds(80,220,40,20);
																						pbtempo.setBounds(100,220,120,20);
																						add(lbtempo);
																						add(pbtempo);
																						c1.add(a7);
																						c1.validate();
																						a7.btver.addActionListener(new ActionListener() {                               
																							public void actionPerformed(ActionEvent e) {																								
																								String abc = "Você acertou: \n";//3 5 7 8
																								int adicionador = 0;
																								if(a7.cbop3.isSelected()) {
																									abc+="Super Mario Bros\n";adicionador+=1;
																								}
																								if(a7.cbop5.isSelected()) {
																									abc+="The Legend of Zelda\n";adicionador+=1;
																								}
																								if(a7.cbop7.isSelected()) {
																									abc+="Pokemon\n";adicionador+=1;
																								}
																								if(a7.cbop8.isSelected()) {
																									abc+="Kirby";adicionador+=1;
																								}
																								JOptionPane.showMessageDialog(null,abc);
																								pontos+=1000*adicionador;
																								Jogo8 a8 = new Jogo8();
																								c1.removeAll();
																								tfcontador.setText("Vidas: x"+cont);
																								add(tfcontador);
																								tfpont.setText(pontos+"");
																								add(tfpont);
																								tempo = 30;
																								lbtempo = new JLabel(tempo+"");
																								pbtempo = new JProgressBar();
																								pbtempo.setMaximum(30);
																								pbtempo.setValue(30);
																								lbtempo.setBounds(80,220,40,20);
																								pbtempo.setBounds(100,220,120,20);
																								add(lbtempo);
																								add(pbtempo);
																								c1.add(a8);
																								c1.validate();
																								tfpont.setBounds(490,200,70,20);
																								tfcontador.setBounds(500,20,70,20);
																								tfcontador.setText("Vidas: x"+cont);
																								tfpont.setText(pontos+"");
																								tfpont.setBounds(490,200,70,20);
																								tfcontador.setBounds(500,20,70,20);
																								a8.btdica.addActionListener(new ActionListener() {
																									public void actionPerformed(ActionEvent e) {
																										pontos-=1500;tfpont.setText(pontos+"");
																									}
																								});
																								a8.btver.addActionListener(new ActionListener() {                               
																									public void actionPerformed(ActionEvent e) {
																										a8.corre = a8.tfresto.getText().toUpperCase();
																										if(a8.corre.equals("OLIMPO")) {
																											pontos+=1000*cont;
																											if(pontos == 25000) {
																												JOptionPane.showMessageDialog(null, "Parabéns! Você completou o quiz!\n Pontuação: "+pontos+"\nPontuação Máxima!");
																											}else {
																												JOptionPane.showMessageDialog(null, "Parabéns! Você completou o quiz!\n Pontuação: "+pontos);	
																											}
																											pontos = 0;
																											new Tempo().interrupt();
																											c1.removeAll();
																											c1.add(vazio);
																											c1.validate();
																										}else {
																											cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																										}
																									}
																								});
																							}	
																						});
																					}else {
																						cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																					}
																				}
																			});
																		}else if(a5.rba2.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba1.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba4.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba5.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																	}
																});

															}else if(a4.rba2.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba1.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba4.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba5.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
														}
													});

												}else if(a3.rba1.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba3.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba4.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba5.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
											}
										});
									}else if(a2.rba2.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba3.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba4.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba5.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									
								}
							});
						}
						else if(a1.rba5.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
					}
				});
			}
		});
		mianime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anime1 a1 = new Anime1();
				Vazio vazio = new Vazio();
				pde+=1;
				c1.removeAll();
				tfcontador.setText("Vidas: x"+cont);
				add(tfcontador);
				tfpont.setText(pontos+"");
				add(tfpont);
				tempo = 30;
				lbtempo = new JLabel(tempo+"");
				pbtempo = new JProgressBar();
				pbtempo.setMaximum(30);
				pbtempo.setValue(30);
				tfcontador.setBounds(500,20,70,20);
				tfpont.setBounds(490,200,70,20);
				lbtempo.setBounds(80,220,40,20);
				pbtempo.setBounds(100,220,120,20);
				add(lbtempo);
				add(pbtempo);
				new Texto().start();
				if(pde == 1) {
					new Tempo().start();
				}
				c1.add(a1);
				c1.validate();
				a1.btdica.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pontos-=1500;tfpont.setText(pontos+"");
					}
				});
				a1.btver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(a1.rba1.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba2.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba3.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
						}
						else if(a1.rba4.isSelected()) {
							pontos+=1000*cont;
							Anime2 a2 = new Anime2();
							c1.removeAll();
							tfcontador.setText("Vidas: x"+cont);
							add(tfcontador);
							tfpont.setText(pontos+"");
							add(tfpont);
							tempo = 30;
							lbtempo = new JLabel(tempo+"");
							pbtempo = new JProgressBar();
							pbtempo.setMaximum(30);
							pbtempo.setValue(30);
							lbtempo.setBounds(80,220,40,20);
							pbtempo.setBounds(100,220,120,20);
							add(lbtempo);
							add(pbtempo);
							c1.add(a2);
							c1.validate();
							a2.btdica.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									pontos-=1500;tfpont.setText(pontos+"");
								}
							});
							a2.btver.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(a2.rba1.isSelected()) {
										pontos+=1000*cont;
										Anime3 a3 = new Anime3();
										c1.removeAll();
										tfcontador.setText("Vidas: x"+cont);
										add(tfcontador);
										tfpont.setText(pontos+"");
										add(tfpont);
										tempo = 30;
										lbtempo = new JLabel(tempo+"");
										pbtempo = new JProgressBar();
										pbtempo.setMaximum(30);
										pbtempo.setValue(30);
										lbtempo.setBounds(80,220,40,20);
										pbtempo.setBounds(100,220,120,20);
										add(lbtempo);
										add(pbtempo);
										c1.add(a3);
										c1.validate();
										a3.btdica.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												pontos-=1500;tfpont.setText(pontos+"");
											}
										});
										a3.btver.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												if(a3.rba2.isSelected()) {
													pontos+=1000*cont;
													Anime4 a4 = new Anime4();
													c1.removeAll();
													tfcontador.setText("Vidas: x"+cont);
													add(tfcontador);
													tfpont.setText(pontos+"");
													add(tfpont);
													tempo = 30;
													lbtempo = new JLabel(tempo+"");
													pbtempo = new JProgressBar();
													pbtempo.setMaximum(30);
													pbtempo.setValue(30);
													lbtempo.setBounds(80,220,40,20);
													pbtempo.setBounds(100,220,120,20);
													add(lbtempo);
													add(pbtempo);
													c1.add(a4);
													c1.validate();
													//4
													a4.btdica.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															pontos-=1500;tfpont.setText(pontos+"");
														}
													});
													a4.btver.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
															if(a4.rba3.isSelected()) {
																pontos+=1000*cont;
																Anime5 a5 = new Anime5();
																c1.removeAll();
																tfcontador.setText("Vidas: x"+cont);
																add(tfcontador);
																tfpont.setText(pontos+"");
																add(tfpont);
																tempo = 30;
																lbtempo = new JLabel(tempo+"");
																pbtempo = new JProgressBar();
																pbtempo.setMaximum(30);
																pbtempo.setValue(30);
																lbtempo.setBounds(80,220,40,20);
																pbtempo.setBounds(100,220,120,20);
																add(lbtempo);
																add(pbtempo);
																c1.add(a5);
																c1.validate();
																//5
																a5.btdica.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		pontos-=1500;tfpont.setText(pontos+"");
																	}
																});
																a5.btver.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		if(a5.rba5.isSelected()) {
																			pontos+=1000*cont;
																			Anime6 a6 = new Anime6();
																			c1.removeAll();
																			tfcontador.setText("Vidas: x"+cont);
																			add(tfcontador);
																			tfpont.setText(pontos+"");
																			add(tfpont);
																			tempo = 30;
																			lbtempo = new JLabel(tempo+"");
																			pbtempo = new JProgressBar();
																			pbtempo.setMaximum(30);
																			pbtempo.setValue(30);
																			lbtempo.setBounds(80,220,40,20);
																			pbtempo.setBounds(100,220,120,20);
																			add(lbtempo);
																			add(pbtempo);
																			c1.add(a6);
																			c1.validate();
																			a6.btdica.addActionListener(new ActionListener() {
																				public void actionPerformed(ActionEvent e) {
																					pontos-=1500;tfpont.setText(pontos+"");
																				}
																			});
																			a6.btver.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																				a6.corre = a6.tfresto.getText().toUpperCase();
																				if(a6.corre.equals("8000")) {
																						pontos+=1000*cont;
																						Anime7 a7 = new Anime7();
																						c1.removeAll();
																						tfcontador.setText("Vidas: x"+cont);
																						add(tfcontador);
																						tfpont.setText(pontos+"");
																						add(tfpont);
																						tempo = 30;
																						lbtempo = new JLabel(tempo+"");
																						pbtempo = new JProgressBar();
																						pbtempo.setMaximum(30);
																						pbtempo.setValue(30);
																						lbtempo.setBounds(80,220,40,20);
																						pbtempo.setBounds(100,220,120,20);
																						add(lbtempo);
																						add(pbtempo);
																						c1.add(a7);
																						c1.validate();
																						a7.btver.addActionListener(new ActionListener() {                               
																							public void actionPerformed(ActionEvent e) {																								
																								String abc = "Você acertou: \n";//3 5 7 8
																								int adicionador = 0;
																								if(a7.cbop3.isSelected()) {
																									abc+="Oolong\n";adicionador+=1;
																								}
																								if(a7.cbop5.isSelected()) {
																									abc+="Android 8\n";adicionador+=1;
																								}
																								if(a7.cbop7.isSelected()) {
																									abc+="Bubbles\n";adicionador+=1;
																								}
																								if(a7.cbop8.isSelected()) {
																									abc+="Gurdo";adicionador+=1;
																								}
																								JOptionPane.showMessageDialog(null,abc);
																								pontos+=1000*adicionador;
																								Anime8 a8 = new Anime8();
																								c1.removeAll();
																								tfcontador.setText("Vidas: x"+cont);
																								add(tfcontador);
																								tfpont.setText(pontos+"");
																								add(tfpont);
																								tempo = 30;
																								lbtempo = new JLabel(tempo+"");
																								pbtempo = new JProgressBar();
																								pbtempo.setMaximum(30);
																								pbtempo.setValue(30);
																								lbtempo.setBounds(80,220,40,20);
																								pbtempo.setBounds(100,220,120,20);
																								add(lbtempo);
																								add(pbtempo);
																								c1.add(a8);
																								c1.validate();
																								tfpont.setBounds(490,200,70,20);
																								tfcontador.setBounds(500,20,70,20);
																								tfcontador.setText("Vidas: x"+cont);
																								tfpont.setText(pontos+"");
																								tfpont.setBounds(490,200,70,20);
																								tfcontador.setBounds(500,20,70,20);
																								a8.btdica.addActionListener(new ActionListener() {
																									public void actionPerformed(ActionEvent e) {
																										pontos-=1500;tfpont.setText(pontos+"");
																									}
																								});
																								a8.btver.addActionListener(new ActionListener() {                               
																									public void actionPerformed(ActionEvent e) {
																										a8.corre = a8.tfresto.getText().toUpperCase();
																										a8.corre2 = a8.tfresto2.getText().toUpperCase();
																										if(a8.corre.equals("GOTA") && a8.corre2.equals("OCEANO")) {
																											pontos+=1000*cont;
																											if(pontos == 25000) {
																												JOptionPane.showMessageDialog(null, "Parabéns! Você completou o quiz!\n Pontuação: "+pontos+"\nPontuação Máxima!");
																											}else {
																												JOptionPane.showMessageDialog(null, "Parabéns! Você completou o quiz!\n Pontuação: "+pontos);	
																											}
																											pontos = 0;
																											new Tempo().interrupt();
																											c1.removeAll();
																											c1.add(vazio);
																											c1.validate();
																										}else {
																											cont-=1;tfcontador.setText("Vidas: x"+cont);
																											if(a8.corre.equals("GOTA")) {
																												JOptionPane.showMessageDialog(null, "Você perdeu uma vida!\nVocê acertou a palavra gota!");
																											}if(a8.corre2.equals("OCEANO")) {
																												JOptionPane.showMessageDialog(null, "Você perdeu uma vida!\nVocê acertou a palavra oceano!");	
																											}
																										}
																									}
																								});
																							}	
																						});
																					}else {
																						cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																					}
																				}
																			});
																		}else if(a5.rba2.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba1.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba4.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																		else if(a5.rba5.isSelected()) {
																			cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
																		}
																	}
																});

															}else if(a4.rba2.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba1.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba4.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
															else if(a4.rba5.isSelected()) {
																cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
															}
														}
													});

												}else if(a3.rba1.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba3.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba4.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
												else if(a3.rba5.isSelected()) {
													cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
												}
											}
										});
									}else if(a2.rba2.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba3.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba4.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									else if(a2.rba5.isSelected()) {
										cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
									}
									
								}
							});
						}
						else if(a1.rba5.isSelected()) {
							cont-=1;tfcontador.setText("Vidas: x"+cont);JOptionPane.showMessageDialog(null, "Você perdeu uma vida!");
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

	public class Texto extends Thread {
		public void run() {
			while(cont > 0) {
				try{
					Thread.sleep(500);
					tfcontador.setText("Vidas: x"+cont);
					tfpont.setText(pontos+"");
				}catch(Exception eas) {
				}
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
			while(pbtempo.getValue() != 0 ) {
				try{
					Thread.sleep(1000);
					pbtempo.setValue(pbtempo.getValue()-1);
					tempo-=1;
					lbtempo.setText(tempo+"");
					if(pbtempo.getValue() == 0) {
						cont-=1;tfcontador.setText("Vidas x"+cont);
						JOptionPane.showMessageDialog(null,"Cuidado! Você perdeu 1 vida pela demora!");
						tempo = 30;
						pbtempo.setValue(30);
					}
					if(cont <= 0) {
						Vazio vazio = new Vazio();
						JOptionPane.showMessageDialog(null,"Você perdeu as 3 vidas!"+"\nPontuação: "+pontos);
						pde = 0;
						pbtempo.setValue(0);
						c1.removeAll();
						cont = 3;tfcontador.setText("Vidas: x"+cont);
						c1.add(vazio);
						c1.validate();
					}
				}catch(Exception e) {
				}
			}
		}
	}
}

