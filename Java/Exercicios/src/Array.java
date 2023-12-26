
public class Uno {
	public static void main(String args[]) {
		int[] a = new int[10];
		for(int i = 0; i < a.length;i++) {
			a[i] = (int) (Math.random()*100);
		}
		for(int i = 0;i < a.length;i++) {
			int d = i-1;
			if(d >= 0) {
				int c = Math.max(a[i],a[d]);
				System.out.println(c);
			}
		}
	}
}
