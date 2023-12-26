import javax.swing.*;
public class Troco {
	public static void main(String args[]) {
		double valortotal = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor total da compra"));
		double valorpago = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor pago"));
		double troco = valorpago-valortotal;
		JOptionPane.showMessageDialog(null,"O valor do troco é: "+troco);
	}
}
