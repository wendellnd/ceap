import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Nave {
	
	BufferedImage desenho;
	
	private int x;
	private int y;
	private int speed;
	private boolean podeAtirar;
	private int recarregando;
	public Nave() {
		try {
			desenho = ImageIO.read(new File("Imagens/falcon.png"));
		}catch(IOException e) {
			System.out.println("imagem não encontrada");
			e.printStackTrace();
		}
		podeAtirar = true;
		x = 683;
		y = MainJogo.monitor.getHeight() - 150;
		speed = 4;
		recarregando = 0;
	}
	
	public void pintar(Graphics2D g) {
		g.drawImage(
				desenho,											//imagem que vai ser desenhada
				x, y,				//posição x e y
				x + (MainJogo.monitor.getWidth()/100)*5,			//altura da imagem
				y + (MainJogo.monitor.getHeight()/100)*10,			//largura da imagem
				0,0,												//canto superior esquerdo da imagem
				desenho.getWidth(), desenho.getHeight(),			//tamanho original da imagem
				null);
	}
	
	//retorna um tiro
	public Tiro atirar() {
		podeAtirar = false;
		recarregando = 0;
		Tiro piu = new Tiro(x+30, MainJogo.monitor.getHeight() - 160);
		return piu;
	}
	
	public void movimentar(int valor) {
		if(valor == 1) {
			x+=speed;
		}else if(valor == -1) {
			x-=speed;
		}	
		if(recarregando >= 10) {
			podeAtirar = true;
			recarregando = 0;
		}else {
			recarregando++;
		}
	}
	
	public boolean podeAtirar() {
		return podeAtirar;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getTamX() {
		return (MainJogo.monitor.getWidth()/100)*5;
	}
	public int getTamY() {
		return (MainJogo.monitor.getHeight()/100)*10;
	}
	
	
}
