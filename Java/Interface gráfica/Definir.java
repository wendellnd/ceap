import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Definir extends JLabel{
	//a,b,c,d - São os valores de quando a palavra está colorida e a1[...], são de quando a palavra esta preta
	public void Teste(JLabel lb, int b,int c,int d,int e,int b1, int c1,int d1,int e1,Color cor,int num) {
		if (num == 0) {
			lb.setBounds(b,c,d,e);
			lb.setForeground(cor);
			if(cor == Color.blue) {
				num1 = 1;
			}
			if(cor == Color.green) {
				num2 = 1;
			}
			if(cor == Color.yellow) {
				num3 = 1;
			}
			if(cor == Color.red) {
				num4 = 1;
			}
		}else {
			lb.setBounds(b1,c1,d1,e1);
			lb.setForeground(Color.black);
			if(cor == Color.blue) {
				num1 = 0;
			}
			if(cor == Color.green) {
				num2 = 0;
			}
			if(cor == Color.yellow) {
				num3 = 0;
			}
			if(cor == Color.red) {
				num4 = 0;
			}
		}
	}
	int num1,num2,num3,num4;
	JLabel lbblue;
	JLabel lbgreen;
	JLabel lbyellow;
	JLabel lbred;
	JButton btblue;
	JButton btgreen;
	JButton btyellow;
	JButton btred;
	
	public Definir() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
		lbblue = new JLabel("Azul");
		lbgreen = new JLabel("Verde");
		lbyellow = new JLabel("Amarelo");
		lbred = new JLabel("Vermelho");
		btblue = new JButton("");
		btgreen = new JButton("");
		btyellow = new JButton("");
		btred = new JButton("");
		
		lbblue.setForeground(Color.black);
		lbgreen.setForeground(Color.black);
		lbyellow.setForeground(Color.black);
		lbred.setForeground(Color.black);
		
		lbblue.setBounds(20,20,40,20);
		lbgreen.setBounds(60,40,40,20);
		lbyellow.setBounds(120,20,50,20);
		lbred.setBounds(180,40,60,20);
		btblue.setBounds(24,41,20,20);
		btgreen.setBounds(68,61,20,20);
		btyellow.setBounds(134,41,20,20);
		btred.setBounds(198,61,20,20);
		
		add(lbblue);
		add(lbgreen);
		add(lbyellow);
		add(lbred);
		add(btblue);
		add(btgreen);
		add(btyellow);
		add(btred);
		
	}
	public void DefinirEventos() {
		btblue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Teste(lbblue,20,100,40,20,20,20,40,20,Color.blue,num1);
			}
});
		btgreen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Teste(lbgreen,60,100,40,20,60,40,40,20,Color.green,num2);
			}
});
		btyellow.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Teste(lbyellow,120,100,50,20,120,20,50,20,Color.yellow,num3);
			}
});
		btred.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Teste(lbred,180,100,60,20,180,40,60,20,Color.red,num4);
			}
});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Cores");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Definir());
		frame.setBounds(200,200,400,300);
		frame.setVisible(true);
	}
}
