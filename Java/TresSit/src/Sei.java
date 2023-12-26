import javax.swing.*;
public class Sei {
	public static void main(String args[]) {
		int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a operação: \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Equação de 2º grau"));
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número(A)"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número(B)"));
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
			double d = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número(C)"));
			Bhaskara(a,b,d);
		break;
		default: System.out.println("Operação não encontrada");
		break;
		}
	}
	public static void Som(double a, double b) {
		double total = a+b;
		System.out.println("O resultado é: "+total);
	}
	public static void Sub(double a, double b) {
		double total = a-b;
		System.out.println("O resultado é: "+total);
	}
	public static void Mul(double a, double b) {
		double total = a*b;
		System.out.println("O resultado é: "+total);
	}
	public static void Div(double a, double b) {
		if(b != 0) {
			double total = a/b;
			System.out.println("O resultado é: "+total);
		}else {
			System.out.println("Não se pode dividir um número por 0!");
		}
	}
	public static void Bhaskara(double a,double b,double d) {
		double delta = (b*b)+(-4*a*d);
		double bhask1 = ((-b+Math.sqrt(delta))/(2*a));
		double bhask2 = ((-b-Math.sqrt(delta))/(2*a));
		System.out.println("X I: "+bhask1+"\n X II: "+bhask2);
	}
}