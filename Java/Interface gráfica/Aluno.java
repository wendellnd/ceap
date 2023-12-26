import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Aluno extends JLabel{
	
	double a,b,c;
	ImageIcon icon = new ImageIcon("C:\\Users\\root\\Documents\\foto.jpg");
	JLabel lbsit;
	JLabel lbmedia;
	JLabel lbicon;
	JLabel lbnome;
	JLabel lbidade;
	JLabel lbtele;
	JLabel lbturma;
	JLabel lbperiodo;
	
	JLabel lbnomep;
	JLabel lbidadep;
	JLabel lbtelep;
	JLabel lbturmap;
	JLabel lbperiodop;
	
	JLabel lbnota1;
	JLabel lbnota2;
	
	JTextField tfnome;
	JTextField tfidade;
	JTextField tftele;
	JTextField tfturma;
	JTextField tfperiodo;
	JTextField tfnota1;
	JTextField tfnota2;
	
	JButton btinfo;
	JButton btavg;
	
	public Aluno() {
		InicializarComponentes();
		DefinirEventos();
	}
	
	public void InicializarComponentes() {
		setLayout(null);
	
		lbnome = new JLabel("Nome:");
		lbidade = new JLabel("Idade:");
		lbtele = new JLabel("Telefone:");
		lbturma = new JLabel("Turma:");
		lbperiodo = new JLabel("Período:");
		lbnota1 = new JLabel("Nota 1:");
		lbnota2 = new JLabel("Nota 2:");
		lbicon = new JLabel(icon);
		
		lbsit = new JLabel("");
		lbmedia = new JLabel("");
		
		lbnomep = new JLabel("");
		lbidadep = new JLabel("");
		lbtelep = new JLabel("");
		lbturmap = new JLabel("");
		lbperiodop = new JLabel("");
		
		tfnome = new JTextField(50);
		tfidade = new JTextField(2);
		tftele = new JTextField(11);
		tfturma = new JTextField(10);
		tfperiodo = new JTextField(7);
		tfnota1 = new JTextField(4);
		tfnota2 = new JTextField(4);
		
		btinfo = new JButton("Informações");
		btavg = new JButton("Média");
		
		lbnome.setBounds(20,20,40,20);
		lbidade.setBounds(20,50,35,20);
		lbtele.setBounds(20,80,70,20);
		lbturma.setBounds(20,110,40,20);
		lbperiodo.setBounds(20,140,60,20);
		lbnota1.setBounds(20,170,40,20);
		lbnota2.setBounds(95,170,40,20);
		
		tfnome.setBounds(65,20,80,20);
		tfidade.setBounds(60,50,20,20);
		tftele.setBounds(80,80,80,20);
		tfturma.setBounds(65,110,30,20);
		tfperiodo.setBounds(75,140,40,20);
		tfnota1.setBounds(65,170,20,20);
		tfnota2.setBounds(140,170,20,20);

		lbnomep.setBounds(20,260,200,20);
		lbidadep.setBounds(20,290,200,20);
		lbtelep.setBounds(20,320,200,20);
		lbturmap.setBounds(20,350,200,20);
		lbperiodop.setBounds(20,380,200,20);
		
		lbmedia.setBounds(20,410,200,20);
		lbsit.setBounds(20,430,200,20);
		
		btinfo.setBounds(25,200,120,20);
		btavg.setBounds(43,230,80,20);
		
		lbicon.setBounds(200, 20, 20, 20);
		
		add(lbnome);
		add(lbidade);
		add(lbtele);
		add(lbturma);
		add(lbperiodo);
		add(lbnota1);
		add(lbnota2);
		
		add(tfnome);
		add(tfidade);
		add(tftele);
		add(tfturma);
		add(tfperiodo);
		add(tfnota1);
		add(tfnota2);
		
		add(btinfo);
		add(btavg);

		add(lbnomep);
		add(lbidadep);
		add(lbtelep);
		add(lbturmap);
		add(lbperiodop);

		add(lbmedia);
		add(lbsit);
		
		lbnomep.setVisible(false);
		lbidadep.setVisible(false);
		lbtelep.setVisible(false);
		lbturmap.setVisible(false);
		lbperiodop.setVisible(false);
		lbmedia.setVisible(false);
		lbsit.setVisible(false);
		
	}
	public void DefinirEventos() {
		btinfo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbnomep.setText("Nome: "+tfnome.getText());
				lbidadep.setText("Idade: "+tfidade.getText());
				lbtelep.setText("Telefone: "+tftele.getText());
				lbturmap.setText("Turma: "+tfturma.getText());
				lbperiodop.setText("Periodo: "+tfperiodo.getText());
				
				lbnomep.setVisible(true);
				lbidadep.setVisible(true);
				lbtelep.setVisible(true);
				lbturmap.setVisible(true);
				lbperiodop.setVisible(true);
				
			}
});
		btavg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(tfnota1.getText());
				b = Double.parseDouble(tfnota2.getText());
				c = (a+b)/2;
				lbmedia.setText("Média: "+c);
				if(c >= 6) {
					lbsit.setText("Aprovado!");
					lbsit.setForeground(Color.green);
					lbsit.setVisible(true);
				}else if(c > 4 && c < 6) {
					lbsit.setText("Recuperação!");
					lbsit.setForeground(Color.yellow);
					lbsit.setVisible(true);
				}else{
					lbsit.setText("Reprovado!");
					lbsit.setForeground(Color.red);
					lbsit.setVisible(true);
				}
				lbmedia.setVisible(true);
			}
});
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Aluno");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Aluno());
		frame.setBounds(100,100,250,500);
		frame.setVisible(true);
	}

}
