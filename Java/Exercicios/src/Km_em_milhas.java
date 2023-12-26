import javax.swing.*;
public class Km_em_milhas {
	public static void main(String args[]) {
		float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor em km","Quilômetros em milhas",JOptionPane.QUESTION_MESSAGE));
		if(a == 0){
			JOptionPane.showMessageDialog(null,"O valor não pode ser 0!","Quilômetros em milhas",JOptionPane.INFORMATION_MESSAGE);
		}else {
			float b = a*0.62137f;
			JOptionPane.showMessageDialog(null,"O valor em milhas é: "+b+"mi","Quilômetros em milhas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
