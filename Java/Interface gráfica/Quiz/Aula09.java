import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula09 extends JFrame{
	private Container c1;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair,miCaixa, miExercicio;
	

	public Aula09() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		c1 = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		miSair = new JMenuItem("Sair");
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		miCaixa = new JMenuItem("Caixa de Opção");
		miExercicio = new JMenuItem("Exercicio");
		mnArquivo.add(miSair);
		mnExemplos.add(miCaixa);
		mnExemplos.add(miExercicio);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		setJMenuBar(mnBarra);
		
	}
	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		miCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musica1 a1 = new Musica1();
				c1.removeAll();
				c1.add(a1);
				c1.validate();
				
			
			}
		});
		miExercicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Musica1 a1 = new Musica1();
				c1.removeAll();
				c1.add(a1);
				c1.validate();
				
				
			
			}
		});
	}

	public static void main(String args[]) {
		 Aula09 frame = new Aula09();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 frame.setBounds(0,0,500,300);
		 frame.setVisible(true);

	}

}
