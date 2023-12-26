import javax.swing.*;
public class Lalala {
	public static void main(String args[]) {
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o calculo: \n 1-Bhaskara \n 2-Pitagoras \n 3-Velocidade média\n 4-Área do quadrado \n 5-Área do triangulo\n 6-Área do circulo"));
		switch(a) {
		case 1:  
			double num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite A"));
			double num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite B"));
			double num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite C"));
			for(double i = 0; i < 2; i++) {
				System.out.println("O valor de XII é: "+Bhaskara(num1,num2,num3,i));
			}
			break;
		case 2:
			double num5 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite B"));
			double num4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite C"));
			System.out.println("Valor da hipotenusa: "+Pi(num5,num4));
			break;
		case 3:
			double num6 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a distância"));
			double num7 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o tempo"));
			System.out.println("A velocidade média é: "+Vel(num6,num7));
			break;
		case 4:
			double num8 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do lado"));
			System.out.println("A velocidade média é: "+Qua(num8));
			break;
		case 5:
			double num9 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da base"));
			double num10 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da altura"));			
			System.out.println("A velocidade média é: "+Tri(num9,num10));
			break;
		case 6:
			double num11 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do raio"));
			System.out.println("A velocidade média é: "+Cir(num11));
			break;

		}

	}
	public static double Bhaskara(double a,double b,double c, double i) {
		double x = -4*a*c;
		double delta = (b*b)+x;
		double del = Math.sqrt(delta);
		double etapa1 = -b+del;
		double etapa2 = -b-del;
			if(i == 0) {
				double bhask = (etapa1/(2*a));
				return bhask;
			}else {
				double bhask = (etapa2/(2*a));
				return bhask;
			}
	}
	public static double Pi(double a, double b) {
		double var = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		return var;
	}
	public static double Vel(double a, double b) {
		double vel = a/b;
		return vel;
	}
	public static double Qua(double a) {
		double qua = a*a;
		return qua;
	}
	public static double Tri(double a, double b) {
		double tri = (a*b)/2;
		return tri;
	}
	public static double Cir(double a) {
		double cir = 3.14*(a*a);
		return cir;
	}
}