import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Eto extends JPanel{
	ImageIcon img = new ImageIcon("C:\\Users\\root\\Documents\\download.jpg");
	JTextField tfcont = new JTextField();
	JButton btimg = new JButton(img);
	JLabel lba = new JLabel("Dinhero q c vai acha no chão hj");
	int cont = 0;
	float a = 0;
	float b = 0;
	float c = 0;
	public Eto() {
		InicializarComponentes();
		DefinirEventos();
	}
	
	public void InicializarComponentes() {
		setLayout(null);
		setBackground(Color.yellow);
		btimg.setBounds(20,20,75,49);
		tfcont.setBounds(110,20,75,20);
		lba.setBounds(110,50,200,20);
		
		tfcont.setEditable(false);
		tfcont.setText("0");
		tfcont.setBackground(Color.CYAN);
		
		add(btimg);
		add(tfcont);
		add(lba);
	}
	public void DefinirEventos() {
		
		btimg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont+=1;
				tfcont.setText(""+cont);
				lba.setBounds(110,50+(cont*2),200,20);
				btimg.setBounds(20,20+(cont*2),75,49);
				tfcont.setBounds(110,20+(cont*2),75,20);
				
				a = (int) (Math.random()*256);
				b = (int) (Math.random()*256);
				c = (int) (Math.random()*256);
				
				setBackground(Color.getHSBColor(a, b, c));

				
			}
});

	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("nao sei");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Eto());
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
	}

}
