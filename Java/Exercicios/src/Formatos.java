import javax.swing.*;
public class Formatos {
	public static void main(String args[]) {
		ImageIcon qua = new ImageIcon("quadrado.jpg");
		ImageIcon ret = new ImageIcon("retangulo.png");
		ImageIcon tri = new ImageIcon("triangulo.png");
		ImageIcon cir = new ImageIcon("circulo.png");
		double resultado = 0;
		int opcao = 1;
		while(opcao == 1){
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite A forma desejada:\n 1-Quadrado\n 2-Retângulo\n 3-Triângulo\n 4-Circulo","Calculo de área",JOptionPane.QUESTION_MESSAGE));
			if(escolha == 1){
				double lado = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor do lado","Calculo de área",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("quadrado.jpg"),null,""));
				resultado = lado*lado;
				JOptionPane.showMessageDialog(null,"Área do quadrado: "+resultado,"Calculo de área",JOptionPane.INFORMATION_MESSAGE,qua);
			}else if(escolha == 2) {
				double base = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da base","Calculo de área",JOptionPane.INFORMATION_MESSAGE,ret,null,""));
				double altura = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da altura","Calculo de área",JOptionPane.INFORMATION_MESSAGE,ret,null,""));
				resultado = base*altura;
				JOptionPane.showMessageDialog(null,"Área do retângulo é: "+resultado,"Calculo de área",JOptionPane.INFORMATION_MESSAGE,ret);
			}else if(escolha == 3) {
				double base_t = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da base","Calculo de área",JOptionPane.INFORMATION_MESSAGE,tri,null,""));
				double altura_t = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor da altura","Calculo de área",JOptionPane.INFORMATION_MESSAGE,tri,null,""));
				resultado = (base_t*altura_t)/2;
				JOptionPane.showMessageDialog(null, "Área do triângulo: "+resultado,"Calculo de área",JOptionPane.INFORMATION_MESSAGE,tri);
			}else if(escolha == 4) {
				double raio = Double.parseDouble((String)JOptionPane.showInputDialog(null,"Digite o valor do raio","Calculo de área",JOptionPane.INFORMATION_MESSAGE,cir,null,""));
				resultado = 3.140*(raio*raio);
				JOptionPane.showMessageDialog(null, "Área do circulo: "+resultado,"Calculo de área",JOptionPane.INFORMATION_MESSAGE,cir);
			}else {
				JOptionPane.showMessageDialog(null,"Opção Inválida!",null,JOptionPane.ERROR_MESSAGE);
				//WARNING_MESSAGE (valor: 2): Mensagem de alerta.
				//QUESTION_MESSAGE (valor: 3): Mensagem de requisição ou pergunta. Esta é a opção padrão do método showInputDialog().
				//INFORMATION_MESSAGE (valor: 1): Mensagem informativa.
				//ERROR_MESSAGE (valor: 0): Mensagem de erro.
				//PLAIN_MESSAGE (valor: -1): Mensagem limpa, sem nenhum ícone.
			}
		opcao = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Deseja refazer o programa?\n 1-Refazer\n 2-Sair","Calculo de área",JOptionPane.QUESTION_MESSAGE,null,null,""));
		if(opcao == 1) {
			opcao = 1;
		}else if(opcao == 2) {
			opcao = 2;
		}else{
			JOptionPane.showMessageDialog(null,"Opção Inválida!","Calculo de área",JOptionPane.ERROR_MESSAGE);
		}
	}
	}
}