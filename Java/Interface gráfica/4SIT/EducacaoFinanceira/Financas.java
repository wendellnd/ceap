import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Financas extends JPanel{
	
	JPanel pnmain = new JPanel();
	JPanel pnobj = new JPanel();
	JPanel pnabout = new JPanel();
	
	ImageIcon user = new ImageIcon("E:/Wendell/Java/Interface gráfica/4SIT/EducacaoFinanceira/profile.png");
	ImageIcon obj = new ImageIcon("E:/Wendell/Java/Interface gráfica/4SIT/EducacaoFinanceira/obj.png");
	ImageIcon plus = new ImageIcon("E:/Wendell/Java/Interface gráfica/4SIT/EducacaoFinanceira/plus.png");
	
	JButton btuser = new JButton(user);
	
	JLabel lbobj = new JLabel(obj);
	JButton btobj = new JButton("Objetivos");
	
	JLabel lbplus = new JLabel(plus);
	JButton btplus = new JButton("Aprenda +");
	
	JButton btabout = new JButton("Sobre o app"); 
	
	public Financas() {
		inicializarComponentes();
		definirEventos();
	}
	public void inicializarComponentes() {
		int dimx = 700;
		int dimy = 500;
		
		setLayout(null);
		
		pnmain.setLayout(null);
		
		pnmain.setBounds(0,0,dimx,dimy);
		
		pnobj.setLayout(new GridLayout(3,3));
		
		pnobj.setBounds(0,0,dimx,470);
		
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		pnobj.add(new Button("a"));
		
		btuser.setBounds(625,10,50,50);
		
		btuser.setOpaque(false);
		btuser.setContentAreaFilled(false);
		btuser.setBorderPainted(false);

		lbobj.setBounds(25,75,50,50);
		btobj.setBounds(80,95,100,20);
		
		lbplus.setBounds(200,80,50,50);
		btplus.setBounds(255,95,100,20);
		
		btabout.setBounds(550,430,125,20);
		
		pnmain.add(btuser);
		pnmain.add(lbobj);
		pnmain.add(btobj);
		pnmain.add(lbplus);
		pnmain.add(btplus);
		pnmain.add(btabout);
		
		add(pnmain);
		add(pnobj);
		pnobj.setVisible(false);
		
	}
	public void definirEventos() {
		btuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dimx = 300;
				int dimy = 200;
				JFrame userFrame = new JFrame();
				userFrame.setBounds((1366-dimx)/2,(768-dimy)/2,dimx,dimy);
				userFrame.setVisible(true);
				userFrame.setLayout(null);
				
				JButton btuser2 = new JButton(user);
				
				JLabel lbnome = new JLabel("Lucas Araújo Souza");
				JLabel lbemail = new JLabel("lucas@email.com");
				
				btuser2.setBounds(10,10,50,50);
				
				lbnome.setBounds(70,10,150,20);
				lbemail.setBounds(70,40,150,20);
				
				btuser2.setOpaque(false);
				btuser2.setContentAreaFilled(false);
				btuser2.setBorderPainted(false);
				
				userFrame.add(btuser2);
				userFrame.add(lbnome);
				userFrame.add(lbemail);
				
			}
		});
		btobj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnmain.setVisible(false);
				pnobj.setVisible(true);
			}
		});
		btabout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				int dimx = 500;
				int dimy = 400;
				JFrame aboutFrame = new JFrame();
				aboutFrame.setBounds((1366-dimx)/2,(768-dimy)/2,dimx,dimy);
				aboutFrame.setVisible(true);
				aboutFrame.setLayout(null);
				
				JTextArea taabout = new JTextArea("Lorem ipsum velit egestas elit tristique sed, per facilisis eros inceptos leo dui, feugiat augue suscipit eros rutrum. porta lacus aliquet nulla non egestas ullamcorper purus malesuada augue torquent, porttitor molestie dapibus nisl quis primis nullam torquent habitasse. integer erat molestie tellus adipiscing eget curabitur molestie enim, at nostra platea ante malesuada in porttitor, hendrerit morbi felis senectus purus aliquam ullamcorper suspendisse, libero non per eget vel convallis. donec senectus nulla non et laoreet scelerisque ut sagittis at posuere, ipsum faucibus malesuada libero aptent integer velit ante neque semper, varius vivamus ornare pharetra pretium pellentesque ligula turpis malesuada. \r\n" + 
						"\r\n" + 
						"	Euismod nullam ac a aptent dictumst fringilla class mi, molestie rutrum placerat turpis ut odio vivamus eros mi, dolor semper sapien vitae aliquam taciti sed. arcu ligula quis auctor condimentum quisque dictumst odio, consequat donec suspendisse quis dictum donec mi, augue mollis enim duis est cursus. ipsum senectus faucibus cursus dui orci diam sociosqu aliquam etiam primis tristique, platea magna malesuada fringilla posuere ullamcorper nisl faucibus torquent. aliquam dolor justo conubia libero integer condimentum congue dolor, turpis erat vulputate viverra lacinia magna ultrices, metus nunc commodo nisl senectus aliquet conubia. \r\n" + 
						"\r\n" + 
						"	Tortor luctus facilisis id aliquet netus duis nullam, ligula tincidunt varius aptent varius orci, bibendum primis potenti ut in tortor. hendrerit mollis facilisis lacinia luctus nisi feugiat per pellentesque convallis hendrerit vivamus lacinia, blandit feugiat non venenatis libero lacus sit eleifend volutpat amet hendrerit rhoncus libero, consectetur eget nec eget condimentum inceptos feugiat vel inceptos faucibus iaculis. dolor massa posuere nisl class libero est integer dolor gravida bibendum est commodo libero, conubia vel molestie sociosqu habitasse vehicula vivamus tellus amet euismod pretium. quisque augue quisque rutrum faucibus ultrices mauris in nunc, dictum orci litora est donec eros condimentum, neque elementum mattis magna sit semper urna. \r\n" + 
						"\r\n" + 
						"	Tempus dictum faucibus himenaeos condimentum, morbi aptent.");
				
				taabout.setEditable(false);
				
				JScrollPane sppane = new JScrollPane(taabout);
				
				sppane.setBounds(0,0,485,362);
				
				aboutFrame.add(sppane);
			}
		});
	}
	public static void main(String args[]) {
		int dimx = 700;
		int dimy = 500;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Financas());
		frame.setBounds((1366-dimx)/2,(768-dimy)/2,dimx,dimy);
		frame.setVisible(true);
	}

}

