import javax.swing.JOptionPane;

public class Banco {
	String cliente;
	int num_conta;
	double saldo;
	
	public void Consultar() {
		System.out.println("Seu saldo é: R$"+saldo);
	}
	public void Depositar(double x) {
		saldo = saldo+x;
	}
	public void Sacar(double x) {
		if(x <= saldo) {
			saldo = saldo-x;
		}else {
			System.out.println("Você não possui esta quantia!");
		}
	}
	public void Processo() {
		int i = 0;
		int opcao = 0;
		System.out.println("Bom dia "+cliente+"!");
		while(i == 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção correspondente a ação:\n 1-Depositar\n2-Sacar\n3-Consulta\n4-Cancelar a operação"));
			switch(opcao) {
				case 1:
					Depositar(Double.parseDouble(JOptionPane.showInputDialog(null,"Deposite o dinheiro")));
					Consultar();
					break;
				case 2:
					Sacar(Double.parseDouble(JOptionPane.showInputDialog(null,"Saque o dinheiro")));
					Consultar();
					break;
				case 3:
					Consultar();
					break;
				case 4:
					i = 1;
					break;
				default:
					System.out.println("Você digitou errado!");
					break;
			}
		}
		System.out.println("Tenha um bom dia!");
	}
}
