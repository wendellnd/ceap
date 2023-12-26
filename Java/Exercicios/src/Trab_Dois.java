import javax.swing.*;

public class Trab_Dois {
	public static void main(String args[]) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número"));
		int d = Math.max(a,Math.max(b, c));
		int e = Math.min(a,Math.min(b, c));
		System.out.println(" O maior número é: "+d+"\n E o menor é: "+e);
	}
}
