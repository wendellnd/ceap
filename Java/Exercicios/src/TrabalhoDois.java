import javax.swing.*;
public class TrabalhoDois {
	public static void main(String[] args) {
		double funcio = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcion�rios"));
		int cont = 0;
		for(int i = 1;i <= funcio;i++){
			int quant = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o sal�rio do "+i+"�"+" funcin�rio"));
		cont = cont+quant;
		}
		System.out.println("A m�dia salarial da empresa �: R$"+(cont/funcio));
	}

}
