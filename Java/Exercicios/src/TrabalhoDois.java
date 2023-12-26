import javax.swing.*;
public class TrabalhoDois {
	public static void main(String[] args) {
		double funcio = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcionários"));
		int cont = 0;
		for(int i = 1;i <= funcio;i++){
			int quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o salário do "+i+"°"+" funcinário"));
		cont = cont+quant;
		}
		System.out.println("A média salarial da empresa é: R$"+(cont/funcio));
	}

}
