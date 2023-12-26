import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DefinirD extends JLabel{

	int a,b,c,d;
	JLabel lbblue;
	JLabel lbgreen;
	JLabel lbyellow;
	JLabel lbred;
	JButton btblue;
	JButton btgreen;
	JButton btyellow;
	JButton btred;
	
	public DefinirD() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
				if (a == 0) {
					lbblue.setBounds(20,100,40,20);
					lbblue.setForeground(Color.blue);
					a = 1;
				}else {
					lbblue.setBounds(20,20,40,20);
					lbblue.setForeground(Color.black);
					a = 0;
				}
			}
});
		btgreen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (b == 0) {
					lbgreen.setBounds(60,100,40,20);
					lbgreen.setForeground(Color.green);
					b = 1;
				}else {
					lbgreen.setBounds(60,40,40,20);
					lbgreen.setForeground(Color.black);
					b = 0;
				}
			}
});
		btyellow.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (c == 0) {
					lbyellow.setBounds(120,100,50,20);
					lbyellow.setForeground(Color.yellow);
					c = 1;
				}else {
					lbyellow.setBounds(120,20,50,20);
					lbyellow.setForeground(Color.black);
					c = 0;
				}
			}
});
		btred.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (d == 0) {
					lbred.setBounds(180,100,60,20);
					lbred.setForeground(Color.red);
					d = 1;
				}else {
					lbred.setBounds(180,40,60,20);
					lbred.setForeground(Color.black);
					d = 0;
				}
			}
});
	}	
	public static void main(String args[]) {
		JFrame frame = new JFrame("Cores");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new DefinirD());
		frame.setBounds(200,200,400,300);
		frame.setVisible(true);
	}
}