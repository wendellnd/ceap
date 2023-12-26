import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SpaceInvaders3 extends JPanel implements Runnable, KeyListener{
	private Font f = new Font("Consolas", Font.BOLD,20);
	Nave nave;
	private ArrayList<Inimigo> inimigos;
	private ArrayList<Explosao> explosao;
	int direcao = 0;
	ArrayList<Tiro> tiros; //parecido com o vetor, mas podemos retirar e adicionar elementos
	private PlanoDeFundo fundo;
	private boolean perdeu, venceu;
	BufferedImage desenhoIn,desenhoEx;
	
	public SpaceInvaders3() {
		nave = new Nave();
		inimigos = new ArrayList<Inimigo>();
		tiros = new ArrayList<Tiro>();
		fundo = new PlanoDeFundo();
		explosao = new ArrayList<Explosao>();
		venceu = false;
		perdeu = false;
		try {
			desenhoEx = ImageIO.read(new File("Imagens/explosao.png"));
			desenhoIn = ImageIO.read(new File("Imagens/tie.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 80;i++) {
			inimigos.add(new Inimigo(desenhoIn,50 + i%20 * 55,50 + i/20 * 55,1));
		}
		
		Thread lacoDoJogo = new Thread(this);
		lacoDoJogo.start();
	}
	
	public void run() {
		
		while(true) {
			long tempoInicial = System.currentTimeMillis();
			update();
			repaint();
			long tempoFinal = System.currentTimeMillis();
			long diferenca = 16 - (tempoInicial-tempoFinal);
			if(diferenca > 0) {
				dorme(diferenca);
			}
		}
	}
	
	private void update() {
		if(nave.getX() <= 0) {
			nave.movimentar(1);
		}
		if(nave.getX()+(MainJogo.monitor.getWidth()/100)*5 >= MainJogo.monitor.getWidth()) {
			nave.movimentar(-1);
		}
		nave.movimentar(direcao);
		for(int i = 0; i < inimigos.size();i++) {
			inimigos.get(i).atualizar();
			
			if(inimigos.get(i).getY() >= MainJogo.monitor.getHeight() - 200 && perdeu == false) {
				perdeu = true;
			}
		}
		for(int i = 0;i < tiros.size(); i++) {
			tiros.get(i).atualizar();
			
			if(tiros.get(i).destroy()) {
				tiros.remove(i);
				i--;
			}else {
			for(int j = 0; j < inimigos.size();j++) {
					if(tiros.get(i).colideCom(inimigos.get(j))) {
						explosao.add(new Explosao(desenhoEx,inimigos.get(j).getX(),inimigos.get(j).getY()));
						inimigos.remove(j);
						tiros.remove(i);
						break;
					}
				}
			}
		}
		for(int i = 0; i < inimigos.size();i++) {
			if(inimigos.get(i).getX() <= 0 || inimigos.get(i).getX() >= MainJogo.monitor.getWidth() - 56) {
				for(int j = 0; j < inimigos.size();j++) {
					inimigos.get(j).mudaDirecao();
				}
				break;
			}
		}
		for(int i = 0; i < explosao.size();i++) {
			explosao.get(i).atualizar();
			
			if(explosao.get(i).acabou()) {
				explosao.remove(i);
				i--;
			}
		}
	}
	int x = 0;
	
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2); //limpar a tela
		//Para ligar o anti allasing, sem serrilhagem
		Graphics2D g = (Graphics2D) g2.create();
		g.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		fundo.pintar(g);
		for(int i = 0; i < explosao.size();i++) {
			explosao.get(i).pintar(g);
		}
		nave.pintar(g);
		
		for(int i = 0; i < inimigos.size();i++) {
			inimigos.get(i).pintar(g);
		}
		for(int i = 0;i < tiros.size(); i++) {
			tiros.get(i).pintar(g);
		}
		if(inimigos.size() == 0 && perdeu == false) {
			venceu = true;
			g.setColor(Color.white);
			g.setFont(f);
			g.drawString("VOCÊ VENCEU!", MainJogo.monitor.getHeight()/2 + 250, MainJogo.monitor.getHeight()/2);
		}
		if(perdeu == true && venceu == false) {
			g.setColor(Color.white);
			g.setFont(f);
			g.drawString("VOCÊ PERDEU!", MainJogo.monitor.getHeight()/2 + 250, MainJogo.monitor.getHeight()/2);	
		}
		
	}
	private void dorme(long duracao) {
		try {
			Thread.sleep(duracao);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D) {
			direcao = 1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			direcao = -1;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE && nave.podeAtirar()) {
			tiros.add(nave.atirar());
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D) {
			direcao = 0;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			direcao = 0;
		}
	}
}
