import javax.swing.*;
public class Potencia {
	public static void main(String args[]) {
		double num = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero"));
		double pot = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da pot�ncia"));		
		double cont = 0;
		double mult = num;
		if(pot == 1) {
			JOptionPane.showMessageDialog(null,"O resultado �: "+num);
			cont = pot;
		}else {
		while(cont < pot){
			if(cont != 1) {
				num = num*mult;
		}
			cont+=1;
		}
		JOptionPane.showMessageDialog(null,"O resultado �: "+num);
	}
}
}