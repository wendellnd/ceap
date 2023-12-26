import javax.swing.*;
public class Aluno {
	public static void main(String args[]) {
		Escola aluno1 = new Escola();
		aluno1.nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno");
		aluno1.turma = "1º ano A";
		aluno1.n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
		aluno1.n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
		aluno1.n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota"));
		aluno1.Media(aluno1.n1,aluno1.n2,aluno1.n3);
		System.out.println("A média do aluno é: "+aluno1.media);
		aluno1.Status();
		System.out.println("Aluno: "+aluno1.nome);
		System.out.println("Turma: "+aluno1.turma);
	}
}
