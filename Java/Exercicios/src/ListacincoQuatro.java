import javax.swing.*;
public class ListacincoQuatro {
	public static void main(String args[]) {
		int h = 0;
		while(h == 0) {
			int e = Integer.parseInt(JOptionPane.showInputDialog(null," Escolha um dos programas \n 1-Sr.Jao \n 2-Fatora��o \n 3-N�meros entre n�meros \n 4-Sair"));
			if(e == 1) {
				for(int a = 1;a<= 50;a++) {
					System.out.println(a+"-R$"+(a*1.99));
				}
			}else if(e == 2) {
				int c = 0;
				int b = 1;
				int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero que vai ser fatoriado"));
				for(c = a; c >= 1;c--){
					b = b*c;
					System.out.println(b);
				}
			}else if(e == 3) {
				int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n�mero"));
				int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero"));
				for(a = a-1;a < b;a++) {
					System.out.println(a);
				}
			}else if(e == 4) {
				JOptionPane.showMessageDialog(null,"Obrigado por utilizar o programa!");
				h++;
			}else {
				JOptionPane.showMessageDialog(null,"Op��o invalida!");			
			}
		}
	}
}
