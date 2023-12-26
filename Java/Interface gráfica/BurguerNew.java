import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BurguerNew extends JPanel {
	String fim;
	JComboBox cbburguer,cbbatata,cbrefri;
	double sand,ba,fri,nug,cas,sun,ms,total;
	ImageIcon bacon,egg,salada,tudo,bap,bam,bag,rep,rem,reg;
	JLabel lbcliente,lbbacon,lbegg,lbsalada,lbtudo,lbfim,lbcliente2,lbsand,lbba,lbfri,lbnug,lbcas,lbsun,lbms,lbbap,lbbam,lbbag,lbrep,lbrem,lbreg;
	JTextField tfcliente;
	JCheckBox cbnuggets,cbcasquinha,cbsundae,cbms;
	JButton btfinalizar;
	public BurguerNew(){
		InicializarComponentes();
		DefinirEventos();
	}

	public void InicializarComponentes() {
		setLayout(null);
		sand = 0;
		ba = 0;
		fri = 0;
		nug = 0;
		total = 0;
		
		cbburguer = new JComboBox();
		cbburguer.addItem("X Bacon: R$17,00");
		cbburguer.addItem("X Egg: R$15,00");
		cbburguer.addItem("X Salada: R$14,00");
		cbburguer.addItem("X Tudo: R$20,00");

		cbbatata = new JComboBox();
		cbbatata.addItem("Batata P: R$12,00");
		cbbatata.addItem("Batata M: R$14,00");
		cbbatata.addItem("Batata G: R$16,00");
		
		cbrefri = new JComboBox();
		cbrefri.addItem("Refri P: R$8,00");
		cbrefri.addItem("Refri M: R$10,00");
		cbrefri.addItem("Refri G: R$12,00");
		
		lbcliente = new JLabel("Cliente:");
		
		bacon = new ImageIcon("C:\\Users\\wende\\Downloads\\bacon.png");
		egg = new ImageIcon("C:\\Users\\wende\\Downloads\\egg.png");
		salada = new ImageIcon("C:\\Users\\wende\\Downloads\\salada.png");
		tudo = new ImageIcon("C:\\Users\\wende\\Downloads\\tudo.png");
		bap = new ImageIcon("C:\\Users\\wende\\Downloads\\bap.png");
		bam = new ImageIcon("C:\\Users\\wende\\Downloads\\bam.png");
		bag = new ImageIcon("C:\\Users\\wende\\Downloads\\bag.png");
		rep = new ImageIcon("C:\\Users\\wende\\Downloads\\rep.png");
		rem = new ImageIcon("C:\\Users\\wende\\Downloads\\rem.png");
		reg = new ImageIcon("C:\\Users\\wende\\Downloads\\reg.png");
		
		lbcliente2 = new JLabel("");
		lbsand = new JLabel("");
		lbba = new JLabel("");
		lbfri = new JLabel("");
		lbnug = new JLabel("");
		lbcas = new JLabel("");
		lbsun = new JLabel("");
		lbms = new JLabel("");
		
		lbfim = new JLabel("");
		
		lbbacon = new JLabel(bacon);
		lbegg = new JLabel(egg);
		lbsalada = new JLabel(salada);
		lbtudo = new JLabel(tudo);
		lbbap = new JLabel(bap);
		lbbam = new JLabel(bam);
		lbbag = new JLabel(bag);
		lbrep = new JLabel(rep);
		lbrem = new JLabel(rem);
		lbreg = new JLabel(reg);
		
		tfcliente = new JTextField();
		
		cbnuggets = new JCheckBox("Nuggets: R$ 8,00");
		cbsundae = new JCheckBox("Sundae: R$ 6,00");
		cbcasquinha = new JCheckBox("Casquinha: R$ 2,00");
		cbms = new JCheckBox("Milk Shake: R$ 8,00");
		
		btfinalizar = new JButton("Finalizar");
		
		cbburguer.setBounds(20,50,130,20);
		lbbacon.setBounds(20,80,162,100);
		lbegg.setBounds(20,80,162,100);
		lbsalada.setBounds(20,80,162,100);
		lbtudo.setBounds(20,80,162,100);
		
		cbbatata.setBounds(20,180,130,20);
		lbbap.setBounds(20,210,100,100);
		lbbam.setBounds(20,210,100,100);
		lbbag.setBounds(20,210,110,100);
		
		cbrefri.setBounds(160,180,130,20);
		lbrep.setBounds(160,210,100,100);
		lbrem.setBounds(160,210,100,100);
		lbreg.setBounds(160,210,100,100);
		
		lbcliente.setBounds(20,20,50,20);
		tfcliente.setBounds(80,20,80,20);
		cbnuggets.setBounds(20,310,130,20);
		cbcasquinha.setBounds(20,340,140,20);
		cbsundae.setBounds(160,310,130,20);
		cbms.setBounds(160,340,160,20);
		btfinalizar.setBounds(100,380,100,20);
		lbcliente2.setBounds(100,400,130,20);
		lbsand.setBounds(100,430,130,20);
		lbba.setBounds(100,460,130,20);
		lbfri.setBounds(100,490,130,20);
		lbnug.setBounds(100,520,130,20);
		lbcas.setBounds(100,550,130,20);
		lbsun.setBounds(100,580,130,20);
		lbms.setBounds(100,610,130,20);
		lbfim.setBounds(100,630,130,20);
		
		add(cbburguer);
		add(cbbatata);
		add(cbrefri);
		add(lbbap);
		add(lbbam);
		add(lbbag);
		add(lbrep);
		add(lbrem);
		add(lbreg);
		
		add(lbcliente);
		add(tfcliente);
		add(lbbacon);
		add(lbegg);
		add(lbsalada);
		add(lbtudo);
		add(cbnuggets);
		add(cbsundae);
		add(cbcasquinha);
		add(cbms);
		add(btfinalizar);
		add(lbcliente2);
		add(lbsand);
		add(lbba);
		add(lbfri);
		add(lbnug);
		add(lbcas);
		add(lbsun);
		add(lbms);
		add(lbfim);
		
		btfinalizar.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true));
		
		
		lbbap.setVisible(false);
		lbbam.setVisible(false);
		lbbag.setVisible(false);
		lbrep.setVisible(false);
		lbrem.setVisible(false);
		lbreg.setVisible(false);
		lbbacon.setVisible(false);
		lbegg.setVisible(false);
		lbsalada.setVisible(false);
		lbtudo.setVisible(false);
		lbcliente2.setVisible(false);
		lbsand.setVisible(false);
		lbba.setVisible(false);
		lbfri.setVisible(false);
		lbnug.setVisible(false);
		lbcas.setVisible(false);
		lbsun.setVisible(false);
		lbms.setVisible(false);
		lbfim.setVisible(false);
	}
	public void DefinirEventos() {
		
		cbburguer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(cbburguer.getSelectedIndex() == 0) {
					lbbacon.setVisible(true);
					lbegg.setVisible(false);
					lbsalada.setVisible(false);
					lbtudo.setVisible(false);
				}
				if(cbburguer.getSelectedIndex() == 1) {
					lbbacon.setVisible(false);
					lbegg.setVisible(true);
					lbsalada.setVisible(false);
					lbtudo.setVisible(false);
				}
				if(cbburguer.getSelectedIndex() == 2) {
					lbbacon.setVisible(false);
					lbegg.setVisible(false);
					lbsalada.setVisible(true);
					lbtudo.setVisible(false);
				}
				if(cbburguer.getSelectedIndex() == 3) {
					lbbacon.setVisible(true);
					lbegg.setVisible(false);
					lbsalada.setVisible(false);
					lbtudo.setVisible(true);
				}
			}
});
		cbbatata.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(cbbatata.getSelectedIndex() == 0) {
					lbbap.setVisible(true);
					lbbam.setVisible(false);
					lbbag.setVisible(false);
				}
				if(cbbatata.getSelectedIndex() == 1) {
					lbbap.setVisible(false);
					lbbam.setVisible(true);
					lbbag.setVisible(false);
				}
				if(cbbatata.getSelectedIndex() == 2) {
					lbbap.setVisible(false);
					lbbam.setVisible(false);
					lbbag.setVisible(true);
				}
			}
});
		cbrefri.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(cbrefri.getSelectedIndex() == 0) {
					lbrep.setVisible(true);
					lbrem.setVisible(false);
					lbreg.setVisible(false);
				}
				if(cbrefri.getSelectedIndex() == 1) {
					lbrep.setVisible(false);
					lbrem.setVisible(true);
					lbreg.setVisible(false);
				}
				if(cbrefri.getSelectedIndex() == 2) {
					lbrep.setVisible(false);
					lbrem.setVisible(false);
					lbreg.setVisible(true);
				}
			}
});
		
		btfinalizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(cbburguer.getSelectedItem().equals("X Bacon: R$17,00")) {
					sand = 17;
					lbsand.setText("X Bacon: R$17,00");
				}else if(cbburguer.getSelectedItem().equals("X Egg: R$15,00")) {
					sand = 15;
					lbsand.setText("X Bacon: R$15,00");
				}else if(cbburguer.getSelectedItem().equals("X Salada: R$14,00")) {
					sand = 14;
					lbsand.setText("X Salada: R$14,00");
				}else if(cbburguer.getSelectedItem().equals("X Tudo: R$20,00")) {
					sand = 20;
					lbsand.setText("X Tudo: R$20,00");
				}
				if(cbbatata.getSelectedItem().equals("Batata P: R$12,00")) {
					ba = 12;
					lbba.setText("Batata P: R$12,00");
				}else if(cbbatata.getSelectedItem().equals("Batata M: R$14,00")) {
					ba = 14;
					lbba.setText("Batata P: R$14,00");
				}else if(cbbatata.getSelectedItem().equals("Batata G: R$16,00")) {
					ba = 16;
					lbba.setText("Batata G: R$16,00");
				}
				if(cbrefri.getSelectedItem().equals("Refri P: R$8,00")) {
					fri = 8;
					lbfri.setText("Refri P: R$8,00");
				}else if(cbrefri.getSelectedItem().equals("Refri M: R$10,00")) {
					fri = 10;
					lbfri.setText("Refri M: R$10,00");
				}else if(cbrefri.getSelectedItem().equals("Refri G: R$12,00")) {
					fri = 12;
					lbfri.setText("Refri G: R$12,00");
				}

				if(cbnuggets.isSelected()) {
					nug = 8;
					lbnug.setText(cbnuggets.getText());
				}else {
					lbnug.setText("");
				}
				if(cbsundae.isSelected()) {
					sun = 6;
					lbsun.setText(cbsundae.getText());
				}else {
					lbsun.setText("");
				}
				if(cbcasquinha.isSelected()) {
					cas = 2;
					lbcas.setText(cbcasquinha.getText());
				}else {
					lbcas.setText("");
				}
				if(cbms.isSelected()) {
					ms = 8;
					lbms.setText(cbms.getText());
				}else {
					lbms.setText("");
				}
				total = sand+ba+fri+nug+sun+cas+ms;
				lbfim.setText("Total: "+total);
				lbcliente2.setText("Cliente: "+tfcliente.getText());
				lbcliente2.setVisible(true);
				lbsand.setVisible(true);
				lbba.setVisible(true);
				lbfri.setVisible(true);
				lbnug.setVisible(true);
				lbcas.setVisible(true);
				lbsun.setVisible(true);
				lbms.setVisible(true);
				lbfim.setVisible(true);
				nug = 0;sun = 0;cas = 0;ms = 0;
			}
});
}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Nosso Burguer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BurguerNew());
		frame.setBounds(100,0,350,690);
		frame.setVisible(true);
	}
}
