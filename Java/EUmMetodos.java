
public class EUmMetodos {
	public static int Pilha(int a) {
		a = (int)(Math.random()*10)+1;
		return a;
	}
	public static int Pmao(int b) {
		b = Pilha(b)+Pilha(b);
		return b;
	}
	public static int Mao(int c) {
		c = c+Pilha(c);
		return c;
	}
	public static int Ver(int d,int e, int f) {
		if(d == 21) {
			System.out.println("Voce ganhou!");
			e++;
		}else if(d > 21) {
			System.out.println("Voce perdeu!");
			e++;
		}else if(d < 21) {
			if(f == 0) {
				d = Mao(d);
				return d;
			}else if(f == 1) {
				e++;
			}else if(f == 2) {
				e++;
			}
		}
		return e;
}

	
	
	
}
