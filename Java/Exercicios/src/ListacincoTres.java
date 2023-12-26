import javax.swing.*;
public class ListacincoTres {
	public static void main(String args[]) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número"));
		for(a = a-1;a < b;a++) {
			System.out.println(a);
		}
	}
}
