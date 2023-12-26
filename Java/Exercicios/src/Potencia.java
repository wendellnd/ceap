import javax.swing.*;
public class Potencia {
	public static void main(String args[]) {
		double num = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número"));
		double pot = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da potência"));		
		double cont = 0;
		double mult = num;
		if(pot == 1) {
			JOptionPane.showMessageDialog(null,"O resultado é: "+num);
			cont = pot;
		}else {
		while(cont < pot){
			if(cont != 1) {
				num = num*mult;
		}
			cont+=1;
		}
		JOptionPane.showMessageDialog(null,"O resultado é: "+num);
	}
}
}