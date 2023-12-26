import javax.swing.*;
public class Balada {
	public static void main(String args[]) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a sua idade"));
		if (idade >= 18) {
			System.out.println("Entrada permitida!");
		}else {
			System.out.println("Entrada Negada!");
		}
		
	}
}
