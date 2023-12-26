
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	public class Aula07 extends JPanel{  
		private JTabbedPane tpAbas;
		private JButton[] botoes = new JButton[15];
		
		public Aula07(){
			inicializarComponentes();
		}
		
		private void inicializarComponentes(){
			setLayout(null);
			for(int i =0; i<15;i++){
				botoes[i] = new JButton("Botão" +(i + 1));
			}
			//GridLayout
			JPanel panel1 = new JPanel(new GridLayout(2,3,10,10));
			for(int i = 0; i<5; i++){
				panel1.add(botoes[i]);
			}
			//FlowLayout
			JPanel panel2 = new JPanel(new FlowLayout());
			for(int i=5; i<10; i++){
				panel2.add(botoes[i]);
			}
			//BorderLayout
			JPanel panel3 = new JPanel(new BorderLayout(10,20));
			panel3.add(botoes[10], "North");
			panel3.add(botoes[11], "West");
			panel3.add(botoes[12], "Center");
			panel3.add(botoes[13], "East");
			panel3.add(botoes[14], "South");
			
			tpAbas = new JTabbedPane();
			tpAbas.addTab("GridLayout",panel1);
			tpAbas.addTab("FlowLayout",panel2);
			tpAbas.addTab("BorderLayout",panel3);
			tpAbas.setBounds(0,0,1000,1000);
			add(tpAbas);
		}
		public static void main(String args[]){
	 		JFrame frame = new JFrame("Layouts");
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.getContentPane().add(new Aula07());
			 frame.setBounds(300,300,1000,1000);
			 frame.setVisible(true);
		 }
	}

