import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Inimigo {
	
	private BufferedImage desenho;
	
	private int x;
	private int y;
	private int speed;
	private int direcao;
	
	public Inimigo(BufferedImage imagem, int inicioX,int inicioY, int direcao) {
		this.desenho = imagem;
		this.x = inicioX;
		this.y = inicioY;
		speed = 3;
		this.direcao = direcao;
	}
	
	public void atualizar() {
		x += speed * direcao;
	}

	public void mudaDirecao() {
		direcao = direcao * -1;
		y+=25;
	}
	
	public void pintar(Graphics2D g) {
		g.drawImage(desenho, x, y, x + (MainJogo.monitor.getWidth()/100)*3,y + (MainJogo.monitor.getWidth()/100)*3, 0, 0, desenho.getWidth(), desenho.getHeight(),null);
	}
	
	public int getX() {
		return x;
	}
	public int getTamX() {
		return (MainJogo.monitor.getWidth()/100)*3;
	}
	public int getY() {
		return y;
	}
	public int getTamY() {
		return (MainJogo.monitor.getWidth()/100)*3;
	}
}
