import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tutorial extends JPanel{
	JTextArea tatetitotu;
	JButton btvoltar;
	public Tutorial() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setBackground(new Color(173,216,230));
		tatetitotu = new JTextArea(20,50);
		tatetitotu.setBounds(20,20,10,10);
		add(tatetitotu);
		tatetitotu.setOpaque(false);
		Font f = new Font("SansSerif", Font.BOLD, 12);
		tatetitotu.setFont(f);
		tatetitotu.setEditable(false);
		tatetitotu.setText("BEM-VINDO AO NOSSO QUIZ!!\n\n\n"
				+ "1. Neste quiz ter� acesso a 3 temas com 8 perguntas cada;\n\n"
				+ "2. Ter� 3 vidas por jogada;\n\n"
				+ "3. As vidas s�o perdidas ao errar 1 pergunta ou demorar para responde-la;\n\n"
				+ "4. Cada vez que acerta, ganhar� 1000 pontos multiplicados pela sua quantidade de vidas atual;\n\n"
				+ "5. Ter� acesso a 1 dica por pergunta, ela pode ser leg�vel ou aud�vel;\n\n"
				+ "6. Sempre que acessar a dica, perder� pontos;\n\n"
				+ "7. O quiz acaba quando as 3 vidas s�o perdidas ou as 8 perguntas s�o respondidas corretamente.\n\n\n\n\nBOA SORTE!!!!");
		btvoltar = new JButton("Voltar");
		btvoltar.setBounds(500,500,60,20);
		add(btvoltar);
	}
	public void DefinirEventos() {
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Tutorial");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Tutorial());
		frame.setBounds(100,100,600,600);
		frame.setVisible(true);
	}
}
