import javax.swing.*;

public class Trab_Dois {
	public static void main(String args[]) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro n�mero"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro n�mero"));
		int d = Math.max(a,Math.max(b, c));
		int e = Math.min(a,Math.min(b, c));
		System.out.println(" O maior n�mero �: "+d+"\n E o menor �: "+e);
	}
}
