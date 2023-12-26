import javax.swing.*;
public class Teste_Icone {
	public static void main(String args[]) {
		ImageIcon qua = new ImageIcon("quadrado.jpg");
		
		JOptionPane.showInputDialog(null,"<- Olha lá!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("circulo.png"),null,"Digite");
		JOptionPane.showMessageDialog(null,"<- Olha só!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,qua);
	}
}
