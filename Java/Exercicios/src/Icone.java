import javax.swing.*;
public class Icone {
	public static void main(String args[]) {
		//47x52
		ImageIcon icone = new ImageIcon("raio.jpg");
		ImageIcon icone2 = new ImageIcon("raio2.jpg");
		ImageIcon qua = new ImageIcon("quadrado.jpg");
		ImageIcon ret = new ImageIcon("retangulo.png");
		ImageIcon tri = new ImageIcon("triangulo.png");
		ImageIcon cir = new ImageIcon("circulo.png");
		ImageIcon kratos = new ImageIcon("image.png");
		ImageIcon pontoa = new ImageIcon("a.png");
		ImageIcon pontob = new ImageIcon("b.png");
		
		JOptionPane.showInputDialog(null,"<- Olha lá!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,cir,null,"");
		JOptionPane.showMessageDialog(null,"<- Olha só!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,qua);
		JOptionPane.showMessageDialog(null,"<- Olha que...Legal!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,ret);
		JOptionPane.showMessageDialog(null,"<- Olha lá!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,tri);
		JOptionPane.showMessageDialog(null,"<- Olha o ponto A!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,pontoa);
		JOptionPane.showMessageDialog(null,"<- Olha o ponto B!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,pontob);

		JOptionPane.showMessageDialog(null,"<- Bunitu!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,kratos);
		
		JOptionPane.showMessageDialog(null,"Olha esses raios de luz!!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,icone);
		JOptionPane.showMessageDialog(null,"OLHA ESSES RAIOS DE LUZ!!!!!","Boa Tarde, pessoal!",JOptionPane.INFORMATION_MESSAGE,icone2);
	}
}
