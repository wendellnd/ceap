import javax.swing.*;
public class Teste {
	public static void main(String args[]) {
		System.out.println(" Ol� mundo!\n Este � o meu primeiro programa em Java!");
		int soma;

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));

		soma = num1+num2;
		JOptionPane.showMessageDialog(null,"Resultado da soma:"+soma);

	}

}
