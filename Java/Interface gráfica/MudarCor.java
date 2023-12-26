import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MudarCor extends JPanel{
	int a,b,c,d,f,a1,b1,c1,d1,f1;
	JLabel lbpessoa,lbnome,lbidade,lbendereco,lbcidade,lbcargo;
	JTextField tfnome,tfidade,tfendereco,tfcidade,tfcargo;
	ImageIcon pessoa;
	JProgressBar pbprocesso;
	
	public MudarCor() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		f = 0;
		a1 = 0;
		b1 = 0;
		c1 = 0;
		d1 = 0;
		f1 = 0;
		lbnome = new JLabel("Nome:");
		lbidade = new JLabel("Idade:");
		lbendereco = new JLabel("Endereço:");
		lbcidade = new JLabel("Cidade:");
		lbcargo = new JLabel("Cargo:");
		
		pessoa = new ImageIcon("C:\\Users\\root\\Desktop\\ser.jpg");
		lbpessoa = new JLabel(pessoa);
		
		tfnome = new JTextField();
		tfidade = new JTextField();
		tfendereco = new JTextField();
		tfcidade = new JTextField();
		tfcargo = new JTextField();
		
		pbprocesso = new JProgressBar();
		pbprocesso.setStringPainted(true);
		
		lbnome.setBounds(20,20,40,20);
		lbidade.setBounds(20,50,40,20);
		lbendereco.setBounds(20,80,60,20);
		lbcidade.setBounds(20,110,45,20);
		lbcargo.setBounds(20,140,40,20);
		
		tfnome.setBounds(70,20,100,20);
		tfidade.setBounds(70,50,25,20);
		tfendereco.setBounds(90,80,100,20);
		tfcidade.setBounds(75,110,100,20);
		tfcargo.setBounds(70,140,100,20);
		
		lbpessoa.setBounds(200,20,100,100);
		
		pbprocesso.setBounds(100,170,100,20);
		
		add(lbnome);
		add(lbidade);
		add(lbendereco);
		add(lbcidade);
		add(lbcargo);
		add(lbpessoa);
		add(tfnome);
		add(tfidade);
		add(tfendereco);
		add(tfcidade);
		add(tfcargo);
		add(pbprocesso);
		
	}
	public void DefinirEventos() {
		tfnome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfnome.getText().equals("")) {
					pbprocesso.setValue(pbprocesso.getValue()-20);
				}else{
					pbprocesso.setValue(pbprocesso.getValue()+20);
				}
			}
		});	
		tfidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfidade.getText().equals("")) {
					pbprocesso.setValue(pbprocesso.getValue()-20);
				}else{
					pbprocesso.setValue(pbprocesso.getValue()+20);					
				
				}
			}
		});	
		tfendereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfendereco.getText().equals("")) {
					pbprocesso.setValue(pbprocesso.getValue()-20);
				}else{
					pbprocesso.setValue(pbprocesso.getValue()+20);					
				}
			}
		});	
		tfcidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfcidade.getText().equals("")) {
					pbprocesso.setValue(pbprocesso.getValue()-20);
				}else{
					pbprocesso.setValue(pbprocesso.getValue()+20);					
				}
			}
		});	
		tfcargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfcargo.getText().equals("")) {
					pbprocesso.setValue(pbprocesso.getValue()-20);
				}else{
					pbprocesso.setValue(pbprocesso.getValue()+20);					
				}
			}
		});	

	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("a");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MudarCor());
		frame.setBounds(100,100,325,325);
		frame.setVisible(true);
	}
}
