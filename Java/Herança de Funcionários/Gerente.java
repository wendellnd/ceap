import javax.swing.JOptionPane;

public class Gerente extends Funcionario{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void aumentoBonus(double a) {
		this.bonus = bonus+a;
	}
	public void opcaoGerente() {
		int b = 0;
		while(b == 0) {
			System.out.println("Funcion�rio: "+getNome()+"\nCPF: "+getCpf()+"\nSal�rio: "+getSalario()+"\nB�nus: "+bonus+"\n=======================================");
			int a = Integer.parseInt(JOptionPane.showInputDialog(null,"O que deseja dar ao gerente?\n1-Aumento\n2-B�nus\n3-Sair"));
			switch(a) {
			case 1: aumentoSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do aumento")));
			break;
			case 2: aumentoBonus(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do b�nus")));
			break;
			case 3: b = 1;
			break;
			default: System.out.println("Voc� digitou errado!");
			}
		}
	}
}
