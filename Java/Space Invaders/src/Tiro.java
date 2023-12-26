import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Tiro {

	private int x;
	private int y;
	private int tamX = 3;
	private int tamY = 25;
	private int speed;
	private File file = new File("Musicas/shoot.wav");
	
	public void tiro(File Sound) {
		Clip clip;
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
		}catch(Exception e) {
		}
	}
	public Tiro(int startX, int startY) {
		this.x = startX;
		this.y = startY;
		speed = 10;
		tiro(file);
	}
	
	public void pintar(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, tamX, tamY);
	}
	public void atualizar() {
		y-=speed;
	}
	public boolean destroy() {
		return y < 0;
	}
	public boolean colideCom(Inimigo inimigo) {
		if(x >= inimigo.getX() && x+tamX < inimigo.getX()+inimigo.getTamX()) {
			if(y <= inimigo.getY() + inimigo.getTamY()) {
				return true;
			}
		}
		return false;
	}
}
