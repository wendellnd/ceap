import javax.swing.*;
public class Km_em_milhas {
	public static void main(String args[]) {
		float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor em km","Quil�metros em milhas",JOptionPane.QUESTION_MESSAGE));
		if(a == 0){
			JOptionPane.showMessageDialog(null,"O valor n�o pode ser 0!","Quil�metros em milhas",JOptionPane.INFORMATION_MESSAGE);
		}else {
			float b = a*0.62137f;
			JOptionPane.showMessageDialog(null,"O valor em milhas �: "+b+"mi","Quil�metros em milhas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
