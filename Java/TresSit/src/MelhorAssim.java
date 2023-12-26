import javax.swing.*;
public class Sei {
	public static void main(String args[]) {
		int abc = 0;
		while(abc == 0) {
			int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a operação: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão"));
			double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número(A)"));
			double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro número(B)"));
			switch (c) {
			case 1:
				System.out.println(Som(a, b));
				break;
			case 2:
				System.out.println(Sub(a, b));
				break;
			case 3:
				System.out.println(Mul(a, b));
				break;
			case 4:
				if (Div(a, b) != 0) {
					System.out.println(Div(a, b));
				}
				break;
			default:
				System.out.println("Operação não encontrada");
				break;
			}
			abc = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja refazer? \n 0-Sim \n 1-Não"));
		}
	}
	public static double Som(double a, double b) {
		double total = a+b;
		return total;
	}
	public static double Sub(double a, double b) {
		double total = a-b;
		return total;
	}
	public static double Mul(double a, double b) {
		double total = a*b;
		return total;
	}
	public static double Div(double a, double b) {
		if(b != 0) {
			double total = a/b;
			return total;
		}else {
			System.out.println("Não se pode dividir um número por 0!");
			double total = 0;
			return total;
		}
	}
}