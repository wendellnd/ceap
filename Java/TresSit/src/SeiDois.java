import javax.swing.*;
public class SeiDois {
	public static void main(String args[]) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite b"));
		double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite c"));
		Bhaskara(a,b,c);
	}
	public static void Bhaskara(double a,double b,double c) {
		double delta = (b*b)+(-4*a*c);
		double bhask1 = ((-b+Math.sqrt(delta))/(2*a));
		double bhask2 = ((-b-Math.sqrt(delta))/(2*a));
		System.out.println("X I: "+bhask1+"\n X II: "+bhask2);
	}
}