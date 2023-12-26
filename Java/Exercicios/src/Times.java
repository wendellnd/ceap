import javax.swing.*;
public class Times {
	public static void main(String args[]) {
		int placarA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o placar do time da casa"));
		int placarB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o placar do time visitante"));
		if(placarA>placarB) {
			JOptionPane.showMessageDialog(null,"O time da casa venceu!");
		}else if(placarB>placarA) {
			JOptionPane.showMessageDialog(null,"O time visitante venceu!");
		}else {
			JOptionPane.showMessageDialog(null,"Empate!");
		}
	}
}
