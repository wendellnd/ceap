import javax.swing.*;
public class Calculadora {
	public static void main(String args[]){
		double a = 0;double b = 0;
		int enquanto = 1;
		while(enquanto == 1){
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opera��o:\n 1-Soma\n 2-Subtra��o\n 3-Multiplica��o\n 4-Divis�o\n 5-Pot�ncia\n 6-Raiz quadrada","Calculadora",JOptionPane.QUESTION_MESSAGE));
			if(escolha == 1){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				JOptionPane.showMessageDialog(null,"O resultado da soma �: "+ (a+b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
			}else if(escolha == 2){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				JOptionPane.showMessageDialog(null,"O resultado da subtra��o �: "+ (a-b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);			
			}else if(escolha == 3){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(a == 0 || b == 0){
					JOptionPane.showMessageDialog(null,"O valor n�o pode ser 0!");
				}else {
					JOptionPane.showMessageDialog(null,"O resultado da multiplica��o �: "+ (a*b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);				
				}
			}else if(escolha == 4){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do dividendo","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do divisor","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(a == 0 || b == 0){
					JOptionPane.showMessageDialog(null,"O valor n�o pode ser 0!");
				}else {
					JOptionPane.showMessageDialog(null,"O resultado da divis�o �: "+ (a/b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(escolha == 5){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da pot�ncia","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(a == 0 || b == 0){
					JOptionPane.showMessageDialog(null,"O valor n�o pode ser 0!");
				}else {
					double c = Math.pow(a,b);
					JOptionPane.showMessageDialog(null,"O resultado da pot�ncia �: "+ c,"Calculadora",JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(escolha == 6){
				int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(x == 0){
					JOptionPane.showMessageDialog(null,"O valor n�o pode ser 0!");
				}else{
					JOptionPane.showMessageDialog(null,"O resultado da raiz quadrada �: "+ (Math.sqrt(x)),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
				}
			}else{
				JOptionPane.showMessageDialog(null,"Op��o Inv�lida!");
			}
			enquanto = JOptionPane.showConfirmDialog(null,"Deseja sair?");
			while(enquanto == 2){
				enquanto = 1;
				enquanto = JOptionPane.showConfirmDialog(null,"Deseja sair?");
			}
		}
	}
}
