import javax.swing.*;
public class Pedir {
	public static void main(String args[]) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tamanho da altura"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tamanho do comprimento"));
		double area = Azuleijo.Multiplicacao(a,b);
		double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tamanho da altura do azuleijo"));
		double d = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tamanho do comprimento do azuleijo"));
		double area2 = Azuleijo.Multiplicacao(c,d);
		JOptionPane.showMessageDialog(null, "A quantidade de azuleijos necessária para preencher a área é: "+Azuleijo.Divisao(area,area2));
		
		
	}
}
