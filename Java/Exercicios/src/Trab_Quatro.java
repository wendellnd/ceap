import javax.swing.*;
public class Trab_Quatro {
	public static void main(String args[]) {
		int a = (int)(Math.random()*11);
		int b;
		for(int i = 0;i < 3;i++) {
			b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
			if(b == a) {
				JOptionPane.showMessageDialog(null,"Parabéns! Você acertou o número sorteado!!!");
				i = 4;
			}else {
				JOptionPane.showMessageDialog(null,"Você errou;-;");
			}
			if(i == 2) {
				JOptionPane.showMessageDialog(null,"O número era: "+a);
			}
		}
	}
}
