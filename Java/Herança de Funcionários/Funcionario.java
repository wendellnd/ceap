import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String a) {
		this.nome = a;
	}
	public void aumentoSalario(double a) {
		this.salario = salario+a;
	}
	public void aumentoLoop() {
		int b = 1;
		while(b == 1) {
			System.out.println("Funcionário: "+nome+"\nCPF: "+cpf+"\nSalário: "+salario+"\n=======================================");
			b = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja dar aumento ao funcionário "+nome+"?\n1-Sim\n2-Sair"));
			switch(b) {
			case 1: aumentoSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantia do aumento")));
			break;
			case 2: b = 2;
			break;
			default: System.out.println("Você digitou errado!");
			}
		}
	}
}

