import javax.swing.*;
public class ListacincoDois {
	public static void main(String args[]){
		int c = 0;
		int b = 1;
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número que vai ser fatoriado"));
		for(c = a; c >= 1;c--){
			b = b*c;
			System.out.println(b);
		}
	}
}
