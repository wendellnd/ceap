
public class CincodoOnzeDeDoisMileDezoito {
	public static void main(String args[]) {
		int a[][] = new int[5][5];
		for (int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				a[i][j] = (int)(Math.random()*25)+1; 
				System.out.print(" "+a[i][j]);
			} 
		System.out.println("");
		}
		System.out.println("");
		for (int i=0; i<=4; i++) {
				System.out.print(" "+a[i][i]);
			} 
		System.out.println("");
		for (int i=4; i>=0; i--) {
			for(int j=4; j>=0; j--) {
				System.out.print(" "+a[i][j]);
			} 
		System.out.println("");
		}
				
	}
}
