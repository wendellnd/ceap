import java.awt.Color;
import java.awt.Graphics2D;

public class Tiro {

	private int x;
	private int y;
	private int tamX = 3;
	private int tamY = 25;
	private int speed;
	
	public Tiro(int startX, int startY) {
		this.x = startX;
		this.y = startY;
		speed = 10;
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
