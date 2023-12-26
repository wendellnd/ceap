import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PlanoDeFundo {
	
	private BufferedImage imagem;
	private int y = 0;
	public PlanoDeFundo(){
		try {
		imagem = ImageIO.read(new File("Imagens/fundo.png"));
		}catch(IOException e) {
			System.out.println("Sem fundo");
			e.printStackTrace();
		}
	}

	public void pintar(Graphics2D g) {
		
		g.drawImage(imagem, 0, y - MainJogo.monitor.getHeight()*2, imagem.getWidth(), imagem.getHeight(), null);
		
		g.drawImage(imagem, 0, y, imagem.getWidth(), -imagem.getHeight(), null);
		
		g.drawImage(imagem, 0, y, imagem.getWidth(), imagem.getHeight(), null);
		
		y+=3;
		if(y >= MainJogo.monitor.getHeight() * 2) {
			y = 0;
		}
	}
}
