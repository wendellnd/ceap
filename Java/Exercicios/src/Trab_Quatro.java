import javax.swing.*;
public class Trab_Quatro {
	public static void main(String args[]) {
		int a = (int)(Math.random()*11);
		int b;
		for(int i = 0;i < 3;i++) {
			b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero"));
			if(b == a) {
				JOptionPane.showMessageDialog(null,"Parab�ns! Voc� acertou o n�mero sorteado!!!");
				i = 4;
			}else {
				JOptionPane.showMessageDialog(null,"Voc� errou;-;");
			}
			if(i == 2) {
				JOptionPane.showMessageDialog(null,"O n�mero era: "+a);
			}
		}
	}
}
