import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Formatosdois {
	public static void main(String args[]) {
		ImageIcon qua = new ImageIcon("quadrado.jpg");
		ImageIcon ret = new ImageIcon("retangulo.png");
		ImageIcon tri = new ImageIcon("triangulo.png");
		ImageIcon cir = new ImageIcon("circulo.png");
		double resultado = 0;
		int opcao = 1;
		int continua = 0;
		while(opcao == 1){
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite A forma desejada:\n 1-Quadrado\n 2-Ret�ngulo\n 3-Tri�ngulo\n 4-Circulo","Calculo de �rea",JOptionPane.QUESTION_MESSAGE));
			if(escolha == 1){
				double lado = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor do lado","Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("quadrado.jpg"),null,""));
				resultado = lado*lado;
				JOptionPane.showMessageDialog(null,"�rea do quadrado: "+resultado,"Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,qua);
				continua = 0;
			}else if(escolha == 2) {
				double base = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da base","Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,ret,null,""));
				double altura = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da altura","Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,ret,null,""));
				resultado = base*altura;
				JOptionPane.showMessageDialog(null,"�rea do ret�ngulo �: "+resultado,"Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,ret);
				continua = 0;
			}else if(escolha == 3) {
				double base_t = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da base","Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,tri,null,""));
				double altura_t = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da altura","Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,tri,null,""));
				resultado = (base_t*altura_t)/2;
				JOptionPane.showMessageDialog(null, "�rea do tri�ngulo: "+resultado,"Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,tri);
				continua = 0;
			}else if(escolha == 4) {
				double raio = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor do raio","Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,cir,null,""));
				resultado = 3.140*(raio*raio);
				JOptionPane.showMessageDialog(null, "�rea do circulo: "+resultado,"Calculo de �rea",JOptionPane.INFORMATION_MESSAGE,cir);
				continua = 0;
			}else {
				JOptionPane.showMessageDialog(null,"Op��o Inv�lida!",null,JOptionPane.ERROR_MESSAGE);
				continua = 1;
				//WARNING_MESSAGE (valor: 2): Mensagem de alerta.
				//QUESTION_MESSAGE (valor: 3): Mensagem de requisi��o ou pergunta. Esta � a op��o padr�o do m�todo showInputDialog().
				//INFORMATION_MESSAGE (valor: 1): Mensagem informativa.
				//ERROR_MESSAGE (valor: 0): Mensagem de erro.
				//PLAIN_MESSAGE (valor: -1): Mensagem limpa, sem nenhum �cone.
			}
			while(continua == 0) {
				opcao = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Deseja refazer o programa?\n 1-Refazer\n 2-Sair","Calculo de �rea",JOptionPane.QUESTION_MESSAGE,null,null,""));
				if(opcao == 1) {
					opcao = 1;
					continua = 1;
				}else if(opcao == 2) {
					opcao = 2;
					continua = 1;
				}else{
					JOptionPane.showMessageDialog(null,"Op��o Inv�lida!","Calculo de �rea",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
}