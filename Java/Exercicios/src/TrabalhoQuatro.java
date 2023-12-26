import javax.swing.*;
public class TrabalhoQuatro {
	public static void main(String args[]) {
		int tent = 0;
		while(tent < 3){
			String senha = JOptionPane.showInputDialog(null,"Digite a senha");
			if(senha.equals("java")) {
					JOptionPane.showMessageDialog(null,"Acesso liberado!");
				tent = 4;
			}else{
				tent++;
			}
			if(tent == 3) {
				JOptionPane.showMessageDialog(null,"Senha bloqueada!");
			}
		}

	}
}
