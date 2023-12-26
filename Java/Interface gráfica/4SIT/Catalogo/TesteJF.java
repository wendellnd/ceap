import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class TesteJF {

	public static void main(String[] args) throws Exception {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(new Rectangle(500,500));
		JPanel painel = new JPanel(){
			public void paintComponent (Graphics g) {
				super.paintComponent(g);
				for(int x = 0; x < 1000; x+=20) {
					g.drawRect(x + 10, 250, 15, 15);
				}
			}
		};
		painel.setPreferredSize(new Dimension(1000,1000));
		final JScrollPane pane = new JScrollPane(painel);
		f.getContentPane().add(pane);
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						pane.getHorizontalScrollBar().setValue(pane.getHorizontalScrollBar().getValue() + 1);
					}
				});
			}
		};
		f.setVisible(true);
		new Timer().schedule(task, 0, 10); 
	}

}
