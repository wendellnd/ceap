import javax.swing.*;
public class Imc {
	public static void main(String args[]) {
		double massa = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura"));
		double imc = massa/(altura*altura);
		if(imc <= 18.5) {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+imc+"\n Voc� est� abaixo do peso!");
		}else if(imc > 18.5 && imc < 25) {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+imc+"\n Voc� est� com o peso normal!");
		}else {
			JOptionPane.showMessageDialog(null,"Seu IMC �: "+imc+"\n Voc� est� acima do peso!");
		}
	}
}
