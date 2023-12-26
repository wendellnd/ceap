
public class Trab_Um {
	public static void main(String args[]) {
		int a,b = 0;
		for(int i = 0;i < 3; i++) {
			a = (int)(Math.random()*6)+1;
			System.out.println(a);
			b = b+a;
		}
		System.out.println("A soma dos três é: "+b);
	}
}
