import javax.swing.*;
public class Troco {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da compra"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor pago"));
		if(a <= b) {
			System.out.println(Troco(a,b));
		}else {
			System.out.println("O valor dado é menor que o da compra!");
		}
	}
	public static double Troco(double a, double b) {
		double troco = b-a;
		return troco;
	}

}
