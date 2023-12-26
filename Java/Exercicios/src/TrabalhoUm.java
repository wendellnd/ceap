import javax.swing.JOptionPane;

public class TrabalhoUm {
	public static void main(String args[]) {
		int b = 1;
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número que vai ser fatoriado"));
		for(int c = a; c >= 1;c--){
			b = b*c;
			System.out.println(b);
		}
	}
}
