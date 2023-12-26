import javax.swing.*;
public class ExercicioDoisCompacto {
	public static void main(String args[]) {
		String a = JOptionPane.showInputDialog(null,"Digite qualquer coisa");
		int b = a.length();
		for(int i=b-1;i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}
