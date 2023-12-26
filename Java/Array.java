
public class Array {
	public static void main(String args[]) {
		int[] a = new int[10];
		for(int i = 0; i < a.length;i++) {
			a[i] = (int) (Math.random()*100);
		}
		int abc = 0;
		while(abc <= 9) {
		for(int g = 0; g < a.length; g++) {
			int auxilio = 0;
			if(g+1 < a.length) {
				if(a[g] >= a[g+1]) {
					auxilio = a[g];
					a[g] = a[g+1];
					a[g+1] = auxilio;
				}
			}
		}
		abc++;
		}
		for(int i = 0;i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}