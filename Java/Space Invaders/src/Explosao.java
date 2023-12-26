import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Explosao {
	private BufferedImage imagem;
	private int x,y,duracao,linha,coluna, animacaoTotal;
	public Explosao(BufferedImage imagem,int x, int y) {
		this.imagem = imagem;
		this.x = x;
		this.y = y;
		duracao = 0;
		linha = 0;
		coluna = 0;
		animacaoTotal = 20;
	}
	public void atualizar() {
		duracao++;
		linha = duracao/6;
		coluna = duracao % 5;
	}
	public void pintar(Graphics2D g) {
		g.drawImage(imagem, x, y, x+50, y+50, 192 * coluna, 192 * linha, 192* coluna + 192, 192 * linha +192, null);
	}
	public boolean acabou() {
		if(duracao >= animacaoTotal) {
			return true;
		}else {
			return false;
		}
	}
}
