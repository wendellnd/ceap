import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
public class Pasta extends JPanel{	
	ImageIcon add = new ImageIcon("C://Users//root//Downloads//add.png");
	ImageIcon del = new ImageIcon("C://Users//root//Downloads//del.png");
	ImageIcon sea = new ImageIcon("C://Users//root//Downloads//sea.png");
	
	JButton btadd = new JButton(add);
	JButton btdel = new JButton(del);
	JButton btsea = new JButton(sea);
	
	JTextField tfadd = new JTextField();
	JTextField tfdel = new JTextField();
	JTextField tfsea = new JTextField();
	
	public Pasta() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		
		tfadd.setBounds(20,60,200,20);
		tfdel.setBounds(20,130,200,20);
		tfsea.setBounds(20,200,200,20);
		
		btadd.setBounds(240,60,64,64);
		btdel.setBounds(240,130,64,64);
		btsea.setBounds(240,200,64,64);
		
		add(tfadd);
		add(tfdel);
		add(tfsea);
		
		add(btadd);
		add(btdel);
		add(btsea);
	}
	public void DefinirEventos() {
		btadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File dir = new File(tfadd.getText());
				if(!dir.exists()) {
					dir.mkdir();
					JOptionPane.showMessageDialog(null, "Pasta criada com sucesso!");	
				}else {
					JOptionPane.showMessageDialog(null, "Esta pasta já existe!");
				}
			}
		});
		btdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File dir = new File(tfdel.getText());
				String x = "";
				if(dir.isDirectory()) {
					if(dir.delete()) {
						x = "Diretório "+dir.getName()+" excluido com sucesso!";
					}else {
						if(excluirFilhos(dir)) {
							x = "Diretório "+dir.getName()+" excluidos com sucesso!";
						}else {
							x = "Falha na exclusão de "+dir.getName();
						}
					}
				}
				JOptionPane.showMessageDialog(null, x);
			}
		});
		btsea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String caminho = tfsea.getText();
				File dir = new File(caminho);
				if(dir.isDirectory()) {
					String abc = "";
					String s[] = dir.list();
					for(int i = 0; i < s.length;i++) {
						abc = abc+s[i]+"\n";
					}
					JOptionPane.showMessageDialog(null, "Pastas existentes em "+caminho+": \n"+abc);
				}else {
					JOptionPane.showMessageDialog(null, "Digite o caminho corretamente!");
				}
			}
		});
	}
	private static boolean excluirFilhos(File dir) {
		if(dir.isDirectory()) {
			String abc = "Pastas Excluidas: \n";
			String s[] = dir.list();
			for(int i = 0; i < s.length;i++) {
				boolean success = excluirFilhos(new File(dir,s[i]));
				if(success) {
					abc+=s[i]+"\n";
				}else {
					JOptionPane.showMessageDialog(null, "O diretório não pode ser excluido!");		
					return false;
				}
			}
		}
		return dir.delete();
	}
	public static void main(String args[]) {
		int a = 350;
		int b = 350;
		JFrame frame = new JFrame("Administrador de pasta");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Pasta());
		frame.setBounds((1366-a)/2,(768-b)/2,a,b);
		frame.setVisible(true);
	}
}
