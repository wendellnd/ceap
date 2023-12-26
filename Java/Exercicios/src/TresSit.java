import javax.swing.*;
import java.util.Arrays;
public class Sei {
	public static void main(String[] args) {
		int[] vetor =new int[5];
		for(int i = 0; i < 5; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		}
		Arrays.sort(vetor);
		for(int i = 0;i < 5; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("\n Pares:");
		for(int i = 0;i < 5; i++) {
			if(vetor[i]%2 == 0) {
				System.out.println(vetor[i]);
			}
		}
		System.out.println("\n Impares: ");
		for(int i = 0;i < 5; i++) {
			if(vetor[i]%2 != 0) {
				System.out.println(vetor[i]);
			}
		
	}
	}
}

