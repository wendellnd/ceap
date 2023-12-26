import javax.swing.*;
public class Exerciciodois {
	public static void main(String args[]) {
		int d,c,e = 1;
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da última tabuada(A) \n Exemplo: A*B = X","Tabuada",JOptionPane.QUESTION_MESSAGE));

		while(e == 1){
			int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o limite da última tabuada(B) \n Exemplo: A*B = X","Tabuada",JOptionPane.QUESTION_MESSAGE));
			if(b <= 10) {
			for(c = 1; c < a;c++){
				for(d = 1;d <= 10;d++){
					System.out.println(c+"X"+d+"="+(c*d));
				}
			}
			for(d = 1;d <= b;d++){
				System.out.println(c+"X"+d+"="+(c*d));
			}
			e = 2;
			}else {
				JOptionPane.showMessageDialog(null,"O valor de B só pode ir até o 10!");
			}
			}
	}
}
