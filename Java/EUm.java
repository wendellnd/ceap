import javax.swing.*;
public class EUm {
	public static void main(String args[]) {
		int a = 0;
		int b = 0;
		b = EUmMetodos.Pmao(b);
		int c = 0;
		while(a == 0) {
			System.out.println("Sua mão é: "+b);
			c = JOptionPane.showConfirmDialog(null,"Deseja receber mais uma carta?");
			a = EUmMetodos.Ver(b,a,c);
		}
		if(b < 21) {
			System.out.println("Sua mão terminou em: "+b);
		}
		if(c == 2) {
			System.out.println("Voce cancelou o jogo!");
		}
	}
}
