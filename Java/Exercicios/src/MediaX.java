import javax.swing.*;
public class MediaX {
	public static void main(String args[]) {
		double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
		double media = (a+b)/2;
		if(media < 5){
			JOptionPane.showMessageDialog(null,"Sua média foi: "+media+"\n I!");
		}else if(media >= 5 && media < 7) {
			JOptionPane.showMessageDialog(null,"Sua média foi: "+media+"\n R!");			
		}else if(media >= 7 && media < 9){
			JOptionPane.showMessageDialog(null,"Sua média foi: "+media+"\n B!");
		}else if(media >= 9){
			JOptionPane.showMessageDialog(null,"Sua média foi: "+media+"\n MB!");
		}else if(media > 10) {
			JOptionPane.showMessageDialog(null,"Essa média não existe!");
		}
		else if(media < 0) {
			JOptionPane.showMessageDialog(null,"Essa média não existe!");
		}
		}
	}


