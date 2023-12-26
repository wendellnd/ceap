import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Loja extends JPanel{
	
	ImageIcon raze = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\razer.jpg");
	ImageIcon prod0 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\fone.png");
	ImageIcon prod1 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\fone2.png");
	ImageIcon prod2 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\fone3.png");
	ImageIcon prod3 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\fone4.png");
	ImageIcon prod4 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mousep.png");
	ImageIcon prod5 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mousep2.png");
	ImageIcon prod6 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mousep3.png");
	ImageIcon prod7 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mousep4.png");
	
	ImageIcon prod8 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\teclado.png");
	ImageIcon prod9 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\teclado2.png");
	ImageIcon prod10 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\teclado3.png");
	ImageIcon prod11 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\teclado4.png");
	ImageIcon prod12 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mouse.png");
	ImageIcon prod13 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mouse2.png");
	ImageIcon prod14 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mouse3.png");
	ImageIcon prod15 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\mouse4.png");
	
	ImageIcon arrowg = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\arwg.png");
	ImageIcon arrowb = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\Imagens\\arwb.png");
	
	JLabel lbraze = new JLabel(raze);
	
	//Produto 1
		JLabel lbprod0 = new JLabel(prod0);
		JLabel lbprod0pri = new JLabel("R$219,90");
		JLabel lbprod0name = new JLabel("Headset Razer Kraken Essencial");
		JTextArea taprod0 = new JTextArea(10,10);

	//Produto 2
		JLabel lbprod1 = new JLabel(prod1);
		JLabel lbprod1pri = new JLabel("R$439,90");
		JLabel lbprod1name = new JLabel("Headset Razer Kraken 71 V2");
		JTextArea taprod1 = new JTextArea(10,10);
	
	//Produto 3
		JLabel lbprod2 = new JLabel(prod2);
		JLabel lbprod2pri = new JLabel("R$599,90");
		JLabel lbprod2name = new JLabel("Headset Razer Kraken Quartz");
		JTextArea taprod2 = new JTextArea(10,10);
	
	//Produto 4
		JLabel lbprod3 = new JLabel(prod3);
		JLabel lbprod3pri = new JLabel("R$120,00");
		JLabel lbprod3name = new JLabel("Razer Kitty Ears Para Kraken");
		JTextArea taprod3 = new JTextArea(10,10);
		
	//Produto 5
		JLabel lbprod4 = new JLabel(prod4);
		JLabel lbprod4pri = new JLabel("R$329,29");
		JLabel lbprod4name = new JLabel("Mousepad Razer Firefly");
		JTextArea taprod4 = new JTextArea(10,10);

	//Produto 6
		JLabel lbprod5 = new JLabel(prod5);
		JLabel lbprod5pri = new JLabel("R$45,90");
		JLabel lbprod5name = new JLabel("Mousepad Gamer Razer Goliathus");
		JTextArea taprod5 = new JTextArea(10,10);
	
	//Produto 7
		JLabel lbprod6 = new JLabel(prod6);
		JLabel lbprod6pri = new JLabel("R$59,99");
		JLabel lbprod6name = new JLabel("Mousepad Sphex V2 Mini");
		JTextArea taprod6 = new JTextArea(10,10);

	//Produto 8
		JLabel lbprod7 = new JLabel(prod7);
		JLabel lbprod7pri = new JLabel("R$194,75");
		JLabel lbprod7name = new JLabel("Mousepad Gamer Goliathus X");
		JTextArea taprod7 = new JTextArea(10,10);
	
	JButton jbarrowg = new JButton(arrowg);
	
	JPanel jpprodutos = new JPanel(new GridLayout(3,3,3,3));
	
	//Produto 9
		JLabel lbprod8 = new JLabel(prod8);
		JLabel lbprod8pri = new JLabel("R$284,90");
		JLabel lbprod8name = new JLabel("Teclado Deathstalker Essencial");
		JTextArea taprod8 = new JTextArea(10,10);

	//Produto 10
		JLabel lbprod9 = new JLabel(prod9);
		JLabel lbprod9pri = new JLabel("R$322,91");
		JLabel lbprod9name = new JLabel("Teclado Cynosa Chroma");
		JTextArea taprod9 = new JTextArea(10,10);
	
	//Produto 11
		JLabel lbprod10 = new JLabel(prod10);
		JLabel lbprod10pri = new JLabel("R$1063,03");
		JLabel lbprod10name = new JLabel("Teclado Razer Deathstalker");
		JTextArea taprod10 = new JTextArea(10,10);
	
	//Produto 12
		JLabel lbprod11 = new JLabel(prod11);
		JLabel lbprod11pri = new JLabel("R$717,49");
		JLabel lbprod11name = new JLabel("Razer Chroma USB Teclado");
		JTextArea taprod11 = new JTextArea(10,10);
		
	//Produto 13
		JLabel lbprod12 = new JLabel(prod12);
		JLabel lbprod12pri = new JLabel("R$1.015,55");
		JLabel lbprod12name = new JLabel("Mouse Gamer Naga Epic Chroma");
		JTextArea taprod12 = new JTextArea(10,10);

	//Produto 14
		JLabel lbprod13 = new JLabel(prod13);
		JLabel lbprod13pri = new JLabel("R$129,99");
		JLabel lbprod13name = new JLabel("Mouse Gamer Abyssus V2 5000");
		JTextArea taprod13 = new JTextArea(10,10);
	
	//Produto 15
		JLabel lbprod14 = new JLabel(prod14);
		JLabel lbprod14pri = new JLabel("R$302,99");
		JLabel lbprod14name = new JLabel("Razer Mouse Deathadder Elite");
		JTextArea taprod14 = new JTextArea(10,10);

	//Produto 16
		JLabel lbprod15 = new JLabel(prod15);
		JLabel lbprod15pri = new JLabel("R$1.319,12");
		JLabel lbprod15name = new JLabel("Mouse Sem Fio Razer Ouroboros");
		JTextArea taprod15 = new JTextArea(10,10);
	
	JButton jbarrowb = new JButton(arrowb);
	
	JPanel jpprodutos1 = new JPanel(new GridLayout(3,3,3,3));
	
	
	JButton[] botao = new JButton[8];
	public Loja() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(new BorderLayout());

		JPanel jpprod[] = new JPanel[8];
		for(int i = 0; i < 8;i++) {
			jpprod[i] = new JPanel(null);
		}
		JPanel jpprod1[] = new JPanel[8];
		for(int i = 0; i < 8;i++) {
			jpprod1[i] = new JPanel(null);
		}
		jpprodutos.setBackground(Color.black);
		jpprodutos1.setBackground(Color.black);
		
		//West
		JPanel jpwest = new JPanel();
		jpwest.setBackground(Color.black);
		jpwest.add(lbraze);
		
		//Center
		//Produto 1
		lbprod0name.setBounds(130,20,200,20);
		
		lbprod0pri.setBounds(185,165,100,20);
		
		lbprod0.setBounds(20,20,100,100);
		
		taprod0.setEditable(false);
		taprod0.setText("A Razer cuidadosamente \n"
				+ "construiu o Razer Kraken\n"
				+ "Essencial, com isolamento\n"
				+ "de ruído externo, ao mesmo\n"
				+ "tempo em que apresenta\n"
				+ "um áudio rico e preciso.");
		taprod0.setBounds(130,50,175,100);
		
		taprod0.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod0.setBackground(new Color(255,255,255));
		
		jpprod[0].add(lbprod0);
		jpprod[0].add(lbprod0name);
		jpprod[0].add(lbprod0pri);
		jpprod[0].add(taprod0);
		jpprod[0].setBackground(new Color(33,240,30));

		//Produto 2
		lbprod1name.setBounds(130,20,200,20);
		
		lbprod1pri.setBounds(185,165,100,20);
		
		lbprod1.setBounds(20,20,100,100);
		
		taprod1.setEditable(false);
		taprod1.setText("O Razer Kraken 7.1 V2 propor-\n"
				+ "ciona uma experiência de\n"
				+ "jogo com som surround que\n"
				+ "aumenta a sua noção de loca-\n"
				+ "lização auditiva. Você sempre\n"
				+ "ouvirá de onde o inimigo virá.");
		taprod1.setBounds(130,50,175,100);
		
		taprod1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod1.setBackground(new Color(255,255,255));
		
		jpprod[1].add(lbprod1);
		jpprod[1].add(lbprod1name);
		jpprod[1].add(lbprod1pri);
		jpprod[1].add(taprod1);
		jpprod[1].setBackground(new Color(33,240,30));

		//Produto 3
		lbprod2name.setBounds(130,20,200,20);
		
		lbprod2pri.setBounds(185,165,100,20);
		
		lbprod2.setBounds(20,20,100,100);
		
		taprod2.setEditable(false);
		taprod2.setText("Desde a sua criação o Razer\n"
				+ "Kraken vem construindo uma\n"
				+ "reputação de clássico cult na\n"
				+ "comunidade dos jogos e se\n"
				+ "impôs como uma presença\n"
				+ "básica em incontáveis eventos.");
		taprod2.setBounds(130,50,175,100);
		
		taprod2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod2.setBackground(new Color(255,255,255));
		
		jpprod[2].add(lbprod2);
		jpprod[2].add(lbprod2name);
		jpprod[2].add(lbprod2pri);
		jpprod[2].add(taprod2);
		jpprod[2].setBackground(new Color(33,240,30));

		//Produto 4
		lbprod3name.setBounds(130,20,200,20);
		
		lbprod3pri.setBounds(185,165,100,20);
		
		lbprod3.setBounds(20,20,100,100);
		
		taprod3.setEditable(false);
		taprod3.setText("Edição disponivel em três\n"
				+ "cores vibrantes para combinar\n"
				+ "perfeitamente com o headset!\n"
				+ "Modelo: Kitty Ears.");
		taprod3.setBounds(130,50,175,100);
		
		taprod3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod3.setBackground(new Color(255,255,255));
		
		jpprod[3].add(lbprod3);
		jpprod[3].add(lbprod3name);
		jpprod[3].add(lbprod3pri);
		jpprod[3].add(taprod3);
		jpprod[3].setBackground(new Color(33,240,30));
		
		//Produto 5
		lbprod4name.setBounds(130,20,200,20);
		
		lbprod4pri.setBounds(185,165,100,20);
		
		lbprod4.setBounds(20,20,100,100);
		
		taprod4.setEditable(false);
		taprod4.setText("A fim de alcançar o equilíbrio\n"
				+ "perfeito entre controle e veloci-\n"
				+ "dade, o Razer Firefly apresenta\n"
				+ "um acabamento rígido e micro\n"
				+ "texturizado que lhe dá precisão\n"
				+ "sem esforço.");
		taprod4.setBounds(130,50,175,100);
		
		taprod4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod4.setBackground(new Color(255,255,255));
		
		jpprod[4].add(lbprod4);
		jpprod[4].add(lbprod4name);
		jpprod[4].add(lbprod4pri);
		jpprod[4].add(taprod4);
		jpprod[4].setBackground(new Color(33,240,30));
		
		//Produto 6
		lbprod5name.setBounds(130,20,200,20);
		
		lbprod5pri.setBounds(185,165,100,20);
		
		lbprod5.setBounds(20,20,100,100);
		
		taprod5.setEditable(false);
		taprod5.setText("O tecido do D.Va Razer Golia-\n"
				+ "thus é esticado para criar uma\n"
				+ "superfície lisa e uniforme,\n"
				+ "permitindo que o seu mouse\n"
				+ "deslize rapidamente e sem\n"
				+ "dificuldade.");
		taprod5.setBounds(130,50,175,100);
		
		taprod5.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod5.setBackground(new Color(255,255,255));
		
		jpprod[5].add(lbprod5);
		jpprod[5].add(lbprod5name);
		jpprod[5].add(lbprod5pri);
		jpprod[5].add(taprod5);
		jpprod[5].setBackground(new Color(33,240,30));
		
		//Produto 7
		lbprod6name.setBounds(130,20,200,20);
		
		lbprod6pri.setBounds(185,165,100,20);
		
		lbprod6.setBounds(20,20,100,100);
		
		taprod6.setEditable(false);
		taprod6.setText("Superfície ultrafina de 0.5 mm.\n"
				+ "Excelente resposta ao rastreamento de\n"
				+ "mouses ópticos e a laser.\n"
				+ "Acabamento de policarbonato\n"
				+ "extradurável.");
		taprod6.setBounds(130,50,175,100);
		
		taprod6.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod6.setBackground(new Color(255,255,255));
		
		jpprod[6].add(lbprod6);
		jpprod[6].add(lbprod6name);
		jpprod[6].add(lbprod6pri);
		jpprod[6].add(taprod6);
		jpprod[6].setBackground(new Color(33,240,30));

		//Produto 8
		lbprod7name.setBounds(130,20,200,20);
		
		lbprod7pri.setBounds(185,165,100,20);
		
		lbprod7.setBounds(20,20,100,100);
		
		taprod7.setEditable(false);
		taprod7.setText("O Mousepad Gamer Razer \n"
				+ "Goliathus V2 X Large Controle\n"
				+ "Gravity possui a dose certa de\n"
				+ "atrito para que seu mouse faça\n"
				+ "movimentos rápidos e precisos,\n"
				+ "oferecendo conforto.");
		taprod7.setBounds(130,50,175,100);
		
		taprod7.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod7.setBackground(new Color(255,255,255));
		
		jpprod[7].add(lbprod7);
		jpprod[7].add(lbprod7name);
		jpprod[7].add(lbprod7pri);
		jpprod[7].add(taprod7);
		jpprod[7].setBackground(new Color(33,240,30));
			
		jpprodutos.add(jpprod[0]);
		jpprodutos.add(jpprod[1]);
		jpprodutos.add(jpprod[2]);
		jpprodutos.add(jpprod[3]);
		jpprodutos.add(jpprod[4]);
		jpprodutos.add(jpprod[5]);
		jpprodutos.add(jpprod[6]);
		jpprodutos.add(jpprod[7]);
		
		jbarrowg.setBackground(null);
		jbarrowg.setBorder(null);
		
		jpprodutos.add(jbarrowg);
		
		//for(int i = 0; i < 1; i++) {
			//botao[i] = new JButton("a");
			//jpprodutos.add(botao[i]);
		//}

		
		
		
		//Produto 9
		lbprod8name.setBounds(130,20,200,20);
		
		lbprod8pri.setBounds(185,165,100,20);
		
		lbprod8.setBounds(20,20,100,100);
		
		taprod8.setEditable(false);
		taprod8.setText("Teclado Com Interface Usb\n"
				+ "V2.0, Leiaute Americano \n"
				+ "(Inglês), 104 Teclas, Teclas\n"
				+ "Com Design Chiclet, 10 Perfis\n"
				+ "Personalizáveis.");
		taprod8.setBounds(130,50,175,100);
		
		taprod8.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod8.setBackground(new Color(255,255,255));
		
		jpprod1[0].add(lbprod8);
		jpprod1[0].add(lbprod8name);
		jpprod1[0].add(lbprod8pri);
		jpprod1[0].add(taprod8);
		jpprod1[0].setBackground(new Color(33,240,30));

		//Produto 10
		lbprod9name.setBounds(130,20,200,20);
		
		lbprod9pri.setBounds(185,165,100,20);
		
		lbprod9.setBounds(20,20,100,100);
		
		taprod9.setEditable(false);
		taprod9.setText("Se você acha que um teclado\n"
				+ "com todos os itens essenciais\n"
				+ "não poderia melhorar, pense\n"
				+ "novamente. Com o Razer\n"
				+ "Cynosa Chroma, a Razer apri-\n"
				+ "morou os recursos.");
		taprod9.setBounds(130,50,175,100);
		
		taprod9.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod9.setBackground(new Color(255,255,255));
		
		jpprod1[1].add(lbprod9);
		jpprod1[1].add(lbprod9name);
		jpprod1[1].add(lbprod9pri);
		jpprod1[1].add(taprod9);
		jpprod1[1].setBackground(new Color(33,240,30));

		//Produto 11
		lbprod10name.setBounds(130,20,200,20);
		
		lbprod10pri.setBounds(185,165,100,20);
		
		lbprod10.setBounds(20,20,100,100);
		
		taprod10.setEditable(false);
		taprod10.setText("O teclado Razer DeathStalker\n"
				+ "Ultimate junta as mais novas\n"
				+ "inovações da tecnologia\n"
				+ "Switchblade e teclas chiclet,\n"
				+ "sendo uma central de controle.");
		taprod10.setBounds(130,50,175,100);
		
		taprod10.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod10.setBackground(new Color(255,255,255));
		
		jpprod1[2].add(lbprod10);
		jpprod1[2].add(lbprod10name);
		jpprod1[2].add(lbprod10pri);
		jpprod1[2].add(taprod10);
		jpprod1[2].setBackground(new Color(33,240,30));

		//Produto 12
		lbprod11name.setBounds(130,20,200,20);
		
		lbprod11pri.setBounds(185,165,100,20);
		
		lbprod11.setBounds(20,20,100,100);
		
		taprod11.setEditable(false);
		taprod11.setText("O Razer Orbweaver Chroma\n"
				+ "fornece controle total na\n"
				+ "palma da sua mão. Obtenha\n"
				+ "acesso a comandos e \n"
				+ "macros infinitos.");
		taprod11.setBounds(130,50,175,100);
		
		taprod11.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod11.setBackground(new Color(255,255,255));
		
		jpprod1[3].add(lbprod11);
		jpprod1[3].add(lbprod11name);
		jpprod1[3].add(lbprod11pri);
		jpprod1[3].add(taprod11);
		jpprod1[3].setBackground(new Color(33,240,30));
		
		//Produto 13
		lbprod12name.setBounds(130,20,200,20);
		
		lbprod12pri.setBounds(185,165,100,20);
		
		lbprod12.setBounds(20,20,100,100);
		
		taprod12.setEditable(false);
		taprod12.setText("O Razer Naga Epic Chroma\n"
				+ "dispõe um total de 19 botões,\n"
				+ "incluindo o controle mecânico\n"
				+ "para polegar com 12 botões\n"
				+ "para maximizar as ações\n"
				+ "disponíveis.");
		taprod12.setBounds(130,50,175,100);
		
		taprod12.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod12.setBackground(new Color(255,255,255));
		
		jpprod1[4].add(lbprod12);
		jpprod1[4].add(lbprod12name);
		jpprod1[4].add(lbprod12pri);
		jpprod1[4].add(taprod12);
		jpprod1[4].setBackground(new Color(33,240,30));
		
		//Produto 14
		lbprod13name.setBounds(130,20,200,20);
		
		lbprod13pri.setBounds(185,165,100,20);
		
		lbprod13.setBounds(20,20,100,100);
		
		taprod13.setEditable(false);
		taprod13.setText("O Razer Abyssus V2 é um\n"
				+ "Mouse Gamer com super reso-\n"
				+ "lução de 5000 DPI, projetado\n"
				+ "somente com os recursos\n"
				+ "mais importantes para jogos\n"
				+ "de torneios.");
		taprod13.setBounds(130,50,175,100);
		
		taprod13.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod13.setBackground(new Color(255,255,255));
		
		jpprod1[5].add(lbprod13);
		jpprod1[5].add(lbprod13name);
		jpprod1[5].add(lbprod13pri);
		jpprod1[5].add(taprod13);
		jpprod1[5].setBackground(new Color(33,240,30));
		
		//Produto 15
		lbprod14name.setBounds(130,20,200,20);
		
		lbprod14pri.setBounds(185,165,100,20);
		
		lbprod14.setBounds(20,20,100,100);
		
		taprod14.setEditable(false);
		taprod14.setText("Equipado com um poderoso\n"
				+ "sensor óptico, o Razer Death-\n"
				+ "Adder Elite dá a você a vanta-\n"
				+ "gem absoluta de possuir um\n"
				+ "sensor muito veloz.");
		taprod14.setBounds(130,50,175,100);
		
		taprod14.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod14.setBackground(new Color(255,255,255));
		
		jpprod1[6].add(lbprod14);
		jpprod1[6].add(lbprod14name);
		jpprod1[6].add(lbprod14pri);
		jpprod1[6].add(taprod14);
		jpprod1[6].setBackground(new Color(33,240,30));

		//Produto 16
		lbprod15name.setBounds(130,20,200,20);
		
		lbprod15pri.setBounds(185,165,100,20);
		
		lbprod15.setBounds(20,20,100,100);
		
		taprod15.setEditable(false);
		taprod15.setText("De um apoio arqueado ajusta-\n"
				+ "vel a uma traseira retratil, bem\n"
				+ "como quatro paineis intercam-\n"
				+ "biaveis, o Razer Ouroboros e\n"
				+ "totalmente personalizavel as\n"
				+ "suas necessidades pessoais.");
		taprod15.setBounds(130,50,175,100);
		
		taprod15.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
		taprod15.setBackground(new Color(255,255,255));
		
		jpprod1[7].add(lbprod15);
		jpprod1[7].add(lbprod15name);
		jpprod1[7].add(lbprod15pri);
		jpprod1[7].add(taprod15);
		jpprod1[7].setBackground(new Color(33,240,30));
			
		jpprodutos1.add(jpprod1[0]);
		jpprodutos1.add(jpprod1[1]);
		jpprodutos1.add(jpprod1[2]);
		jpprodutos1.add(jpprod1[3]);
		jpprodutos1.add(jpprod1[4]);
		jpprodutos1.add(jpprod1[5]);
		jpprodutos1.add(jbarrowb);
		jpprodutos1.add(jpprod1[6]);
		jpprodutos1.add(jpprod1[7]);
		
		jbarrowb.setBackground(null);
		jbarrowb.setBorder(null);
		add(jpprodutos,"Center");
		
		add(jpwest,"West");
	}
	public void DefinirEventos() {
		jbarrowg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(jpprodutos);
				add(jpprodutos1,"Center");
				repaint();
				validate();
			}
		});
		jbarrowb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(jpprodutos1);
				add(jpprodutos,"Center");
				repaint();
				validate();
			}
		});
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Catálogo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Loja());
		frame.setBounds(100,0,1250,750);
		frame.setVisible(true);
	}
}
