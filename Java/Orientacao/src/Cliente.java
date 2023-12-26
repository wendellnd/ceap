import javax.swing.*;
public class Cliente {
	public static void main(String args[]) {
		Banco cliente1 = new Banco();
		
		cliente1.cliente = JOptionPane.showInputDialog(null,"Digite seu nome");
		cliente1.num_conta = 001;
		cliente1.saldo = 100;
		System.out.println("Nome do cliente: "+cliente1.cliente);
		System.out.println("Conta: "+cliente1.num_conta);
		System.out.println("Saldo: R$"+cliente1.saldo);
		System.out.println("##############################################################################");
		cliente1.Processo();
	}
}
