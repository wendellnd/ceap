import javax.swing.*;
public class Exerciciodois {
	public static void main(String args[]) {
		int d = 1;
		int c = 1;
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número","Tabuada",JOptionPane.QUESTION_MESSAGE));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número","Tabuada",JOptionPane.QUESTION_MESSAGE));
		for(c = 1; c < a;c++){
			for(d = 1;d <= 10;d++){
				System.out.println(c+"X"+d+"="+(c*d));
			}
		}
		for(d = 1;d <= b;d++){
			System.out.println(c+"X"+d+"="+(c*d));
		}
	}
}
