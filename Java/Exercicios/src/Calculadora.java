import javax.swing.*;
public class Calculadora {
	public static void main(String args[]){
		double a = 0;double b = 0;
		int enquanto = 1;
		while(enquanto == 1){
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a operação:\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão\n 5-Potência\n 6-Raiz quadrada","Calculadora",JOptionPane.QUESTION_MESSAGE));
			if(escolha == 1){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				JOptionPane.showMessageDialog(null,"O resultado da soma é: "+ (a+b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
			}else if(escolha == 2){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+ (a-b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);			
			}else if(escolha == 3){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(a == 0 || b == 0){
					JOptionPane.showMessageDialog(null,"O valor não pode ser 0!");
				}else {
					JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+ (a*b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);				
				}
			}else if(escolha == 4){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do dividendo","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do divisor","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(a == 0 || b == 0){
					JOptionPane.showMessageDialog(null,"O valor não pode ser 0!");
				}else {
					JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+ (a/b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(escolha == 5){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da potência","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(a == 0 || b == 0){
					JOptionPane.showMessageDialog(null,"O valor não pode ser 0!");
				}else {
					double c = Math.pow(a,b);
					JOptionPane.showMessageDialog(null,"O resultado da potência é: "+ c,"Calculadora",JOptionPane.INFORMATION_MESSAGE);
				}
			}else if(escolha == 6){
				int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				if(x == 0){
					JOptionPane.showMessageDialog(null,"O valor não pode ser 0!");
				}else{
					JOptionPane.showMessageDialog(null,"O resultado da raiz quadrada é: "+ (Math.sqrt(x)),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
				}
			}else{
				JOptionPane.showMessageDialog(null,"Opção Inválida!");
			}
			enquanto = JOptionPane.showConfirmDialog(null,"Deseja sair?");
			while(enquanto == 2){
				enquanto = 1;
				enquanto = JOptionPane.showConfirmDialog(null,"Deseja sair?");
			}
		}
	}
}
