import javax.swing.*;
public class Convertor_de_quilos_em_gramas {
	public static void main(String args[]) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor em quilos","Quilos em gramas",JOptionPane.QUESTION_MESSAGE));
		if(a == 0){
			JOptionPane.showMessageDialog(null,"Não é possivel que o valor seja 0","Quilos em gramas",JOptionPane.INFORMATION_MESSAGE);
		}else{
			double b = a*1000;
			JOptionPane.showMessageDialog(null,"O valor em gramas é: "+b+"g","Quilos em gramas",JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}
