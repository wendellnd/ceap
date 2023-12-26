import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Descricao extends JPanel{
	
	static DisplayMode monitor = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
	Font f = new Font("Consolas",Font.BOLD,15);
	
	JTextArea taDescricao = new JTextArea();
	JButton btVoltar = new JButton("Voltar");
	
	public Descricao() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		setLayout(null);
		
		taDescricao.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
		taDescricao.setOpaque(false);
		taDescricao.setForeground(Color.white);
		taDescricao.setFont(f);
		taDescricao.setEditable(false);
		taDescricao.setBounds(10,20,monitor.getWidth(),monitor.getHeight());
		
		btVoltar.setForeground(Color.white);
		btVoltar.setBackground(Color.black);
		btVoltar.setBounds(monitor.getWidth()-150,monitor.getHeight()-70,100,20);
		
		add(btVoltar);
		add(taDescricao);
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Descricao());
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
	}
	
}
