import javax.swing.*;
public class Balada {
	public static void main(String args[]) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano que você nasceu \n OBS: Considere ter feito aniversario esse ano"));
		int idade = 2018-ano;
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null,"Sua idade é: "+idade+"\n Você é maior de idade!");
		}else {
			JOptionPane.showMessageDialog(null,"Sua idade é: "+idade+"\n Você é menor de idade!");			
		}
	}
}
