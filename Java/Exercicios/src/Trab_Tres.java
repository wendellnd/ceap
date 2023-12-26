import javax.swing.*;
public class Trab_Tres {
	public static void main(String args[]) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de C"));
		double delta = Math.pow(b, 2)-(4*a*c);
		System.out.println("Delta é: "+delta);
	}
}
