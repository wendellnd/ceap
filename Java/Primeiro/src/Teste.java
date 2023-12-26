import javax.swing.*;
public class Teste {
	public static void main(String args[]) {
		System.out.println(" Olá mundo!\n Este é o meu primeiro programa em Java!");
		int soma;

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));

		soma = num1+num2;
		JOptionPane.showMessageDialog(null,"Resultado da soma:"+soma);

	}

}
