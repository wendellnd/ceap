import javax.swing.*;
public class Hipo {
	public static void main(String args[]) {
		double[] vetor = new double[2];
		vetor[0] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O valor de B"));
		vetor[1] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O valor de C"));
		System.out.println("O valor da hipotenusa é: "+Tenusa.Hipo(vetor));
	}
}
