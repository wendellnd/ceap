import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import javax.swing.*;

public class Lojinha extends JPanel{
	private double total = 0;
	private ImageIcon fundo = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Lojinha\\Imagens\\hood.jpg");
	private JPanel pntb1, pntb2;
	private JTable tb1, tb2;
	private JScrollPane scrolltb1,scrolltb2;
	private JTabbedPane tpabas;
	private JLabel jlcod,jlnm,jlquant,jlpreco,jlcod1,jlquant1,jltotal,jlfundo,jlemail,jlsenha,jllogin;
	private JTextField tfcod,tfnm,tfquant,tfpreco,tfcod1,tfquant1,tftotal,tfemail;
	private JPasswordField tfsenha;
	private JButton btadicionar,btcomprar,btconfirm;
	private int trycont = 0;
	
	DecimalFormat df = new DecimalFormat("#,###.00");
	
	public Lojinha() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(null);
		JPanel pn1, pn2;
		pn1 = new JPanel(null);
		pn2 = new JPanel(null);
		
		Font f = new Font("SansSerif", Font.BOLD, 15);
		Font f2 = new Font("SansSerif", Font.BOLD, 20);
		
		jllogin = new JLabel("Login");
		jllogin.setFont(f2);
		
		jlemail = new JLabel("Email");
		jlsenha = new JLabel("Senha");
		jlemail.setFont(f);
		jlsenha.setFont(f);
		
		tfemail = new JTextField();
		tfsenha = new JPasswordField();
		
		btconfirm = new JButton("Confirmar");
		btconfirm.setFont(f);
		
		jlemail.setBounds(200,100,50,20);
		tfemail.setBounds(200,120,125,20);
		
		jlsenha.setBounds(200,150,50,20);
		tfsenha.setBounds(200,170,125,20);
		
		btconfirm.setBounds(199,200,125,20);
		
		add(jllogin);
		add(jlemail);
		add(jlsenha);
		add(tfemail);
		add(tfsenha);
		add(btconfirm);
		
		pntb1 = new JPanel(new BorderLayout());
		pntb1.setBorder(new TitledBorder("Compras"));
		pntb2 = new JPanel(new BorderLayout());
		pntb2.setBorder(new TitledBorder("Vendas"));
		scrolltb1 = new JScrollPane();
		scrolltb2 = new JScrollPane();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		
		DefaultTableModel tableModel = new DefaultTableModel(
			new String[] {"Cod", "Nome", "Quantidade", "Preço Un." },0) { //cria o layout da tabela , os itens do vetor são os nomes da coluna, o 0 indica que a tabela saíra sem nenhuma linha
			public boolean isCellEditable(int row, int col) { //método para dizer se a celula será editavel ou não
				if (col != -1) {
					return false;
				}else {
					return true;
				}		
			}
		};

		
		tb1 = new JTable(tableModel);
		tb2 = new JTable(tableModel);
		
		tb1.getColumnModel().getColumn(0).setPreferredWidth(50);
		tb1.getColumnModel().getColumn(0).setResizable(false);
		tb1.getColumnModel().getColumn(1).setPreferredWidth(150);
		tb1.getColumnModel().getColumn(1).setResizable(false);
		tb1.getColumnModel().getColumn(2).setPreferredWidth(100);
		tb1.getColumnModel().getColumn(2).setResizable(false);
		tb1.getColumnModel().getColumn(3).setPreferredWidth(100);
		tb1.getColumnModel().getColumn(3).setResizable(false);
		tb1.getTableHeader().setReorderingAllowed(false);
		tb1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrolltb1.setViewportView(tb1);
		pntb1.add(scrolltb1);
		pntb1.setBounds(20,200,413,200);
		pn1.add(pntb1);
		
		jlcod = new JLabel("Digite o código do produto");
		jlnm = new JLabel("Digite o nome do produto");
		jlquant = new JLabel("Digite a quantidade");
		jlpreco = new JLabel("Digite o preço do produto");
		
		tfcod = new JTextField();
		tfnm = new JTextField();
		tfquant = new JTextField();
		tfpreco = new JTextField();

		btadicionar = new JButton("Adicionar produto");
		
		jlcod.setBounds(20,20,200,20);
		tfcod.setBounds(20,40,100,20);
		
		jlnm.setBounds(240,20,200,20);
		tfnm.setBounds(240,40,100,20);
		
		jlquant.setBounds(20,80,200,20);
		tfquant.setBounds(20,100,100,20);
		
		jlpreco.setBounds(240,80,200,20);
		tfpreco.setBounds(240,100,100,20);
		
		btadicionar.setBounds(20,175,150,20);
		
		pn1.add(jlcod);
		pn1.add(tfcod);
		pn1.add(jlnm);
		pn1.add(tfnm);
		pn1.add(jlquant);
		pn1.add(tfquant);
		pn1.add(jlpreco);
		pn1.add(tfpreco);
		pn1.add(btadicionar);
		
		tb2.getColumnModel().getColumn(0).setPreferredWidth(50);
		tb2.getColumnModel().getColumn(0).setResizable(false);
		tb2.getColumnModel().getColumn(1).setPreferredWidth(150);
		tb2.getColumnModel().getColumn(1).setResizable(false);
		tb2.getColumnModel().getColumn(2).setPreferredWidth(100);
		tb2.getColumnModel().getColumn(2).setResizable(false);
		tb2.getColumnModel().getColumn(3).setPreferredWidth(100);
		tb2.getColumnModel().getColumn(3).setResizable(false);
		tb2.getTableHeader().setReorderingAllowed(false);
		tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrolltb2.setViewportView(tb2);
		pntb2.add(scrolltb2);
		pntb2.setBounds(20,200,413,200);
		pn2.add(pntb2);
		
		jlcod1 = new JLabel("Digite o código do produto");
		jlquant1 = new JLabel("Digite a quantidade");
		
		tfcod1 = new JTextField();
		tfquant1 = new JTextField();

		btcomprar = new JButton("Comprar");

		tftotal = new JTextField();
		tftotal.setEditable(false);
		tftotal.setText("R$0,00");
		tftotal.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		
		jltotal = new JLabel("TOTAL:");
		
		jlcod1.setBounds(20,20,200,20);
		tfcod1.setBounds(20,40,100,20);
		
		jlquant1.setBounds(20,80,200,20);
		tfquant1.setBounds(20,100,100,20);

		btcomprar.setBounds(20,175,150,20);
		jltotal.setBounds(460,355,100,20);
		tftotal.setBounds(460,375,100,20);
		
		pn2.add(jlcod1);
		pn2.add(tfcod1);
		pn2.add(jlquant1);
		pn2.add(tfquant1);
		pn2.add(btcomprar);
		pn2.add(jltotal);
		pn2.add(tftotal);

		tpabas = new JTabbedPane();
		tpabas.addTab("Compras",pn1);
		tpabas.addTab("Vendas", pn2);
		tpabas.setBounds(0,0,600,500);
		
		jlfundo = new JLabel(fundo);
		jlfundo.setBounds(0,0,600,500);
		
		add(tpabas);
		add(jlfundo);
		tpabas.setVisible(false);
		jlfundo.setVisible(false);
	}
	public void DefinirEventos() {
		btconfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(trycont < 3) {
					if(tfemail.getText().equals("wendell@email.com") && tfsenha.getText().equals("senha1234")) {
						JOptionPane.showMessageDialog(null,"Acesso liberado!");
						tpabas.setVisible(true);
						jlfundo.setVisible(true);
						tfemail.setVisible(false);
						tfsenha.setVisible(false);
						jlemail.setVisible(false);
						jlsenha.setVisible(false);
						jllogin.setVisible(false);
						btconfirm.setVisible(false);
					}else if(tfemail.getText().equals("") || tfsenha.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					}else {
						trycont++;
						JOptionPane.showMessageDialog(null,"Acesso negado!\n Mais "+(3-trycont)+" tentativas!");
					}
					if(trycont >= 3) {
						JOptionPane.showMessageDialog(null, "Você só tem 3 tentativas!");
					}
				}
			}
		});
		btadicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfcod.equals("") || tfnm.getText().equals("") || tfquant.getText().equals("") ||tfpreco.getText().equals("")) {
					JOptionPane.showMessageDialog(pntb1, "Preencha todos os campos");
				}else {
					DefaultTableModel dtm = (DefaultTableModel) tb1.getModel();
					dtm.addRow(new Object[] {Integer.parseInt(tfcod.getText()),tfnm.getText(),Integer.parseInt(tfquant.getText()),df.format(Double.parseDouble(tfpreco.getText()))});
					limpaCampos();
				}
			}
		});
		btcomprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfcod1.equals("") || tfquant1.getText().equals("")) {
					JOptionPane.showMessageDialog(pntb1, "Preencha todos os campos");
				}else {
					DefaultTableModel dtm2 = (DefaultTableModel) tb2.getModel();
					int a = dtm2.getRowCount();
					int without = 0;
					for(int i = 0; i <= a-1; i++) {
						if(Integer.parseInt(tfcod1.getText()) == (int)dtm2.getValueAt(i,0)) {
							int x = 0;
							int y = 0;
							int z = 0;
							String totalh = (String)dtm2.getValueAt(i,3);
							totalh = totalh.replace(",",".");
							x = (int) dtm2.getValueAt(i, 2);
							y = Integer.parseInt(tfquant1.getText());
							z = x - y;
							if(y <= x) {
								dtm2.setValueAt(z, i, 2);
								double xyz = y*Double.parseDouble(totalh);
								total+=xyz;
								tftotal.setText("R$"+df.format(total));
								tftotal.requestFocus();
								if((int)dtm2.getValueAt(i, 2) == 0) {
									dtm2.removeRow(i);
								}
							}else {
								JOptionPane.showMessageDialog(pntb2, "Esta quantidade não está disponível no estoque!");
							}
						}else {
							without++;
						}
					}
					if(without > 0) {
						JOptionPane.showMessageDialog(pntb2,"Este código não existe!");
					}
					limpaCampos();
				}
			}
		});
		
	}
	public void limpaCampos() {
		tfcod.setText("");
		tfnm.setText("");
		tfquant.setText("");
		tfcod1.setText("");
		tfquant1.setText("");
		tfpreco.setText("");
		tfcod.requestFocus();
	}
	public static void main(String args[]) {
		int x = 600;
		int y = 500;
		JFrame frame = new JFrame("Lojinha");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Lojinha());
		frame.setBounds((1366-x)/2,(768-y)/2, x, y);
		frame.setVisible(true);
	}
}
