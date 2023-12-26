import java.util.Arrays;
public class CincodoOnzeDeDoisMileDezoitoDois {
	public static void main(String args[]) {
		int a[] = new int[10];
		String c[] = new String[10];
		for(int i = 0; i < a.length;i++) {
			a[i] = (int)(Math.random()*100)+1;
			c[i].valueOf(a[i]);
		}
		Arrays.sort(a);
		for(int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("");
		for(int i = 0; i < a.length; i++) {
			int b = a[i];
			if(b%2 == 0) {
				c[i] = "#";
			}else {
				c[i] = "*";
			}
			System.out.println(a[i]+"-"+c[i]);
	}
	}
}
