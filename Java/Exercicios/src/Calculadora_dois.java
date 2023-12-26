import javax.swing.JOptionPane;
public class Calculadora_dois {
	public static void main(String args[]){
		double a = 0;
		double b = 0;
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a operação:\n 1-Soma\n 2-Subtração\n 3-Multiplicação\n 4-Divisão","Calculadora",JOptionPane.QUESTION_MESSAGE));
			if(escolha == 1){
				a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número","Calculadora",JOptionPane.QUESTION_MESSAGE));
				JOptionPane.showMessageDialog(null,"O resultado da soma é: "+ (a+b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
			}else {
				if(escolha == 2) {
					a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número","Calculadora",JOptionPane.QUESTION_MESSAGE));
					b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número","Calculadora",JOptionPane.QUESTION_MESSAGE));
					JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+ (a-b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);			
				}else {
					if(escolha == 3) {
						a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número","Calculadora",JOptionPane.QUESTION_MESSAGE));
						b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite outro número","Calculadora",JOptionPane.QUESTION_MESSAGE));
						if(a == 0 || b == 0){
							JOptionPane.showMessageDialog(null,"O valor não pode ser 0!");
						}else {
							JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+ (a*b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);				
						}
					}else {
						if(escolha == 4){
							a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do dividendo","Calculadora",JOptionPane.QUESTION_MESSAGE));
							b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do divisor","Calculadora",JOptionPane.QUESTION_MESSAGE));
							if(a == 0 || b == 0){
								JOptionPane.showMessageDialog(null,"O valor não pode ser 0!");
							}else {
								JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+ (a/b),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
							}
						}else{
							JOptionPane.showMessageDialog(null,"Opção inválida!");
						}
					}
				}
			}
	}
}
