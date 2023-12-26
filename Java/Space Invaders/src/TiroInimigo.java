import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TiroInimigo {
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
	public TiroInimigo(int startX, int startY) {
		this.x = startX;
		this.y = startY;
		speed = 7;
		tiro(file);
	}
	
	public void pintar(Graphics2D g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, tamX, tamY);
	}
	public void atualizar() {
		y+=speed;
	}
	public boolean destroy() {
		return y > MainJogo.monitor.getHeight();
	}
	public boolean colideCom(Nave nave) {
		if(x >= nave.getX() && x+tamX < nave.getX()+nave.getTamX()) {
			if(y >= nave.getY() - ((MainJogo.monitor.getHeight()/100)*5)) {
				return true;
			}
		}
		return false;
	}
}
