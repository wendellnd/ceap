import javax.swing.*;
public class ExercicioDoisDois {
	public static void main(String args[]) {
		String a = JOptionPane.showInputDialog(null,"Digite qualquer coisa");
		int b = a.length();
		String d = "";
		for(int i = b-1;i >= 0;i--) {
			char c = a.charAt(i);
			d = d+c;
		}
		JOptionPane.showMessageDialog(null,"Voc� digitou:\n"+a+"\n E agora est� assim: \n"+d);
	}
}
