import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Burguer extends JPanel {
	String fim;
	double sand,ba,fri,nug,cas,sun,ms,total;
	ImageIcon bacon,egg,salada,tudo;
	JLabel lbcliente,lbbacon,lbegg,lbsalada,lbtudo,lbfim,lbcliente2,lbsand,lbba,lbfri,lbnug,lbcas,lbsun,lbms;
	JTextField tfcliente;
	JRadioButton rbbacon,rbegg,rbsalada,rbtudo,rbbap,rbbam,rbbag,rbfrip,rbfrim,rbfrig;
	JCheckBox cbnuggets,cbcasquinha,cbsundae,cbms;
	JButton btfinalizar;
	ButtonGroup bgsand,bgbatata,bgfri;
	public Burguer(){
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
		
		lbcliente = new JLabel("Cliente");
		
		bacon = new ImageIcon("C:\\Users\\root\\Downloads\\bacon.png");
		egg = new ImageIcon("C:\\Users\\root\\Downloads\\egg.png");
		salada = new ImageIcon("C:\\Users\\root\\Downloads\\salada.png");
		tudo = new ImageIcon("C:\\Users\\root\\Downloads\\tudo.png");
		
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
		
		bgsand = new ButtonGroup();
		bgbatata = new ButtonGroup();
		bgfri = new ButtonGroup();
		
		tfcliente = new JTextField();
		
		rbbacon = new JRadioButton("X Bacon: R$ 17,00");
		rbegg = new JRadioButton("X Egg: R$ 15,00");
		rbsalada = new JRadioButton("X Salada: R$ 14,00");
		rbtudo = new JRadioButton("X Tudo: R$ 20,00");
		bgsand.add(rbbacon);
		bgsand.add(rbegg);
		bgsand.add(rbsalada);
		bgsand.add(rbtudo);
		
		rbbap = new JRadioButton("Batata P: R$ 12,00");
		rbbam = new JRadioButton("Batata M: R$ 14,00");
		rbbag = new JRadioButton("Batata G: R$ 16,00");
		bgbatata.add(rbbap);
		bgbatata.add(rbbam);
		bgbatata.add(rbbag);
		
		rbfrip = new JRadioButton("Refri P: R$ 8,00");
		rbfrim = new JRadioButton("Refri M: R$ 10,00");
		rbfrig = new JRadioButton("Refri G: R$ 12,00");
		bgfri.add(rbfrip);
		bgfri.add(rbfrim);
		bgfri.add(rbfrig);
		
		cbnuggets = new JCheckBox("Nuggets: R$ 8,00");
		cbsundae = new JCheckBox("Sundae: R$ 6,00");
		cbcasquinha = new JCheckBox("Casquinha: R$ 2,00");
		cbms = new JCheckBox("Milk Shake: R$ 8,00");
		
		btfinalizar = new JButton("Finalizar");
		
		lbcliente.setBounds(20,20,50,20);
		tfcliente.setBounds(80,20,80,20);
		rbbacon.setBounds(20,50,130,20);
		rbegg.setBounds(20,80,130,20);
		rbsalada.setBounds(20,110,140,20);
		rbtudo.setBounds(20,140,130,20);
		lbbacon.setBounds(160,50,162,100);
		lbegg.setBounds(160,50,162,100);
		lbsalada.setBounds(160,50,162,100);
		lbtudo.setBounds(160,50,162,100);
		rbbap.setBounds(20,180,130,20);
		rbbam.setBounds(20,210,140,20);
		rbbag.setBounds(20,240,130,20);
		rbfrip.setBounds(160,180,130,20);
		rbfrim.setBounds(160,210,130,20);
		rbfrig.setBounds(160,240,130,20);
		cbnuggets.setBounds(20,280,130,20);
		cbcasquinha.setBounds(20,310,140,20);
		cbsundae.setBounds(160,280,130,20);
		cbms.setBounds(160,310,160,20);
		btfinalizar.setBounds(100,350,100,20);
		lbcliente2.setBounds(100,370,130,20);
		lbsand.setBounds(100,400,130,20);
		lbba.setBounds(100,430,130,20);
		lbfri.setBounds(100,460,130,20);
		lbnug.setBounds(100,490,130,20);
		lbcas.setBounds(100,520,130,20);
		lbsun.setBounds(100,550,130,20);
		lbms.setBounds(100,580,130,20);
		lbfim.setBounds(100,610,130,20);
		
		add(lbcliente);
		add(tfcliente);
		add(lbbacon);
		add(lbegg);
		add(lbsalada);
		add(lbtudo);
		add(rbbacon);
		add(rbegg);
		add(rbsalada);
		add(rbtudo);
		add(rbbap);
		add(rbbam);
		add(rbbag);
		add(rbfrip);
		add(rbfrim);
		add(rbfrig);
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
		rbbacon.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbbacon.setVisible(true);
				lbegg.setVisible(false);
				lbsalada.setVisible(false);
				lbtudo.setVisible(false);
			}
});
		rbegg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbbacon.setVisible(false);
				lbegg.setVisible(true);
				lbsalada.setVisible(false);
				lbtudo.setVisible(false);
			}
});
		rbsalada.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbbacon.setVisible(false);
				lbegg.setVisible(false);
				lbsalada.setVisible(true);
				lbtudo.setVisible(false);
			}
});
		rbtudo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbbacon.setVisible(false);
				lbegg.setVisible(false);
				lbsalada.setVisible(false);
				lbtudo.setVisible(true);
			}
});
		btfinalizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(rbbacon.isSelected()) {
					sand = 17;
					lbsand.setText(rbbacon.getText());
				}else if(rbegg.isSelected()) {
					sand = 15;
					lbsand.setText(rbegg.getText());
				}else if(rbsalada.isSelected()) {
					sand = 14;
					lbsand.setText(rbsalada.getText());
				}else if(rbtudo.isSelected()) {
					sand = 20;
					lbsand.setText(rbtudo.getText());
				}
				if(rbbap.isSelected()) {
					ba = 12;
					lbba.setText(rbbap.getText());
				}else if(rbbam.isSelected()) {
					ba = 14;
					lbba.setText(rbbam.getText());
				}else if(rbbag.isSelected()) {
					ba = 16;
					lbba.setText(rbbag.getText());
				}
				if(rbfrip.isSelected()) {
					fri = 8;
					lbfri.setText(rbfrip.getText());
				}else if(rbfrim.isSelected()) {
					fri = 10;
					lbfri.setText(rbfrim.getText());
				}else if(rbfrig.isSelected()) {
					fri = 12;
					lbfri.setText(rbfrig.getText());
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
		frame.getContentPane().add(new Burguer());
		frame.setBounds(100,0,350,670);
		frame.setVisible(true);
	}
}
