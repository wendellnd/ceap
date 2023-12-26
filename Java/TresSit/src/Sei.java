import javax.swing.*;
public class Sei {
	public static void main(String args[]) {
		int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opera��o: \n 1-Soma \n 2-Subtra��o \n 3-Multiplica��o \n 4-Divis�o \n 5-Equa��o de 2� grau"));
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero(A)"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro n�mero(B)"));
		switch(c) {
		case 1: Som(a,b);
		break;
		case 2: Sub(a,b);
		break;
		case 3: Mul(a,b);
		break;
		case 4: Div(a,b);
		break;
		case 5:
			double d = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro n�mero(C)"));
			Bhaskara(a,b,d);
		break;
		default: System.out.println("Opera��o n�o encontrada");
		break;
		}
	}
	public static void Som(double a, double b) {
		double total = a+b;
		System.out.println("O resultado �: "+total);
	}
	public static void Sub(double a, double b) {
		double total = a-b;
		System.out.println("O resultado �: "+total);
	}
	public static void Mul(double a, double b) {
		double total = a*b;
		System.out.println("O resultado �: "+total);
	}
	public static void Div(double a, double b) {
		if(b != 0) {
			double total = a/b;
			System.out.println("O resultado �: "+total);
		}else {
			System.out.println("N�o se pode dividir um n�mero por 0!");
		}
	}
	public static void Bhaskara(double a,double b,double d) {
		double delta = (b*b)+(-4*a*d);
		double bhask1 = ((-b+Math.sqrt(delta))/(2*a));
		double bhask2 = ((-b-Math.sqrt(delta))/(2*a));
		System.out.println("X I: "+bhask1+"\n X II: "+bhask2);
	}
}