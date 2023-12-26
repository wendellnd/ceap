import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Aerotorpo extends JPanel{

	JCheckBox cadeiras[] = new JCheckBox[20];
	JCheckBox cbhelpa = new JCheckBox();
	JCheckBox cbhelpb = new JCheckBox();
	JCheckBox cbhelpc = new JCheckBox();
	JLabel custo = new JLabel("Passagem: R$400.00");
	JLabel empty = new JLabel("");
	JLabel rowa = new JLabel("A");
	JLabel rowb = new JLabel("B");
	JLabel rowc = new JLabel("C");
	JLabel rowd = new JLabel("D");
	JLabel col[] = new JLabel[5];
	JLabel lbhelpa = new JLabel("Livre");
	JLabel lbhelpb = new JLabel("Selecionado");
	JLabel lbhelpc = new JLabel("Ocupado");
	JLabel head = new JLabel("AVIAOZINHO CORPS");
	ImageIcon aviaozinho = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\aviaozinho.png");
	JLabel lbaviaozinho = new JLabel(aviaozinho);
	JButton btend = new JButton("Finalizar Compra");
	public void Check(JCheckBox cd) {
		if(cd.isSelected() == true) {
			cd.setBackground(Color.blue);
		}else {
			cd.setBackground(Color.green);			
		}
	}
	public Aerotorpo() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		
		JPanel jpcenter = new JPanel();
		JPanel jpnorth = new JPanel(new FlowLayout());
		JPanel jpwest = new JPanel();
		JPanel jpeast = new JPanel(new GridLayout(2,1));
		
		jpcenter.setLayout(null);
		
		setLayout(new BorderLayout());
		
		//Center
		
		for(int i = 0; i < 5; i++) {
			col[i] = new JLabel(""+(i+1));
			jpcenter.add(col[i]);
		}
		
		rowa.setBounds(60,20,20,20);
		jpcenter.add(rowa);
		
		rowb.setBounds(100,20,20,20);
		jpcenter.add(rowb);

		rowc.setBounds(140,20,20,20);
		jpcenter.add(rowc);
		
		rowd.setBounds(180,20,20,20);
		jpcenter.add(rowd);
		
		int a = 50;
		for(int i = 0;i < 5;i++) {
			col[i].setBounds(40,a,20,20);
			a+=40;
		}
		
		for(int i = 0; i < 20; i++) {
			cadeiras[i] = new JCheckBox("");
			cadeiras[i].setBackground(Color.GREEN);
		}
		int x = 55;
		int y = 50;
		int cad = 0;
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j < 4;j++) {
				cadeiras[cad].setBounds(x,y,20,20);
				jpcenter.add(cadeiras[cad]);
				x+=40;
				cad++;
			}
			x = 55;
			y+=40;
		}
		
		cbhelpa.setBackground(Color.green);
		cbhelpa.setSelected(true);
		cbhelpa.setEnabled(false);
		cbhelpa.setBounds(55,250,20,20);
		lbhelpa.setBounds(80,250,30,20);
		
		cbhelpb.setBackground(Color.blue);
		cbhelpb.setSelected(true);
		cbhelpb.setEnabled(false);
		cbhelpb.setBounds(130,250,20,20);
		lbhelpb.setBounds(155,250,70,20);
		
		cbhelpc.setBackground(Color.red);
		cbhelpc.setSelected(true);
		cbhelpc.setEnabled(false);
		cbhelpc.setBounds(245,250,20,20);
		lbhelpc.setBounds(270,250,70,20);
		
		jpcenter.add(cbhelpa);
		jpcenter.add(lbhelpa);
		jpcenter.add(cbhelpb);
		jpcenter.add(lbhelpb);
		jpcenter.add(cbhelpc);
		jpcenter.add(lbhelpc);
		
		
		//North
		jpnorth.add(head);
		jpnorth.add(lbaviaozinho);
		
		//South
		btend.setBackground(Color.black);
		btend.setForeground(Color.white);
		
		//East
		jpeast.add(custo);
		jpeast.add(empty);
		
		add(jpcenter,"Center");
		add(jpnorth,"North");
		add(btend,"South");
		add(jpwest,"West");
		add(jpeast,"East");

	}
	public void DefinirEventos() {
		cadeiras[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[0]);
			}
		});
		cadeiras[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[1]);
			}
		});
		cadeiras[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[2]);
			}
		});
		cadeiras[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[3]);
			}
		});
		cadeiras[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[4]);
			}
		});
		cadeiras[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[5]);
			}
		});
		cadeiras[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[6]);
			}
		});
		cadeiras[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[7]);
			}
		});
		cadeiras[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[8]);
			}
		});
		cadeiras[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[9]);
			}
		});
		cadeiras[10].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[10]);
			}
		});
		cadeiras[11].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[11]);
			}
		});
		cadeiras[12].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[12]);
			}
		});
		cadeiras[13].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[13]);
			}
		});
		cadeiras[14].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[14]);
			}
		});
		cadeiras[15].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[15]);
			}
		});
		cadeiras[16].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[16]);
			}
		});
		cadeiras[17].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[17]);
			}
		});
		cadeiras[18].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[18]);
			}
		});
		cadeiras[19].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check(cadeiras[19]);
			}
		});
		btend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total = 0;
				String assento = "";
				for(int i = 0; i < 20; i++) {
					if(cadeiras[i].isSelected() == true) {
						cadeiras[i].setBackground(Color.red);
						cadeiras[i].setEnabled(false);
						total+=400;
					}
				}
				for(int j = 0; j < 17; j+=4) {
					if(cadeiras[j].isSelected() == true) {
						assento+="A";
							if(cadeiras[0].isSelected() && j == 0) {
								assento+="1 ";
							}else if(cadeiras[4].isSelected() && j == 4){
								assento+="2 ";
							}else if(cadeiras[8].isSelected() && j == 8){
								assento+="3 ";
							}else if(cadeiras[12].isSelected() && j == 12){
								assento+="4 ";
							}else if(cadeiras[16].isSelected() && j == 16){
								assento+="5 ";
							}
					}
				}
				for(int j = 1; j < 18; j+=4) {
					if(cadeiras[j].isSelected() == true) {
						assento+="B";
						if(cadeiras[1].isSelected() && j == 1) {
							assento+="1 ";
						}else if(cadeiras[5].isSelected() && j == 5){
							assento+="2 ";
						}else if(cadeiras[9].isSelected() && j == 9){
							assento+="3 ";
						}else if(cadeiras[13].isSelected() && j == 13){
							assento+="4 ";
						}else if(cadeiras[17].isSelected() && j == 17){
							assento+="5 ";
						}
					}
				}
				for(int j = 2; j < 19; j+=4) {
					if(cadeiras[j].isSelected() == true) {
						assento+="C";
					}
					if(cadeiras[2].isSelected() && j == 2) {
						assento+="1 ";
					}else if(cadeiras[6].isSelected() && j == 6){
						assento+="2 ";
					}else if(cadeiras[10].isSelected() && j == 10){
						assento+="3 ";
					}else if(cadeiras[14].isSelected() && j == 14){
						assento+="4 ";
					}else if(cadeiras[18].isSelected() && j == 18){
						assento+="5 ";
					}
				}
				for(int j = 3; j < 20; j+=4) {
					if(cadeiras[j].isSelected() == true) {
						assento+="D";
					}
					if(cadeiras[3].isSelected() && j == 3) {
						assento+="1 ";
					}else if(cadeiras[7].isSelected() && j == 7){
						assento+="2 ";
					}else if(cadeiras[11].isSelected() && j == 11){
						assento+="3 ";
					}else if(cadeiras[15].isSelected() && j == 15){
						assento+="4 ";
					}else if(cadeiras[19].isSelected() && j == 19){
						assento+="5 ";
					}
				}
				JOptionPane.showMessageDialog(null,"Total a pagar: "+total+"\n Assentos reservados: "+assento+"\n Tenha uma boa viagem!");
				
			}
		});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Aerotorpo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aerotorpo());
		frame.setBounds(200, 25, 500, 450);
		frame.setVisible(true);
	}
}
