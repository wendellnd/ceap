import javax.swing.*;
import java.util.*;
public class OsExercicios {
	public static void main(String args[]) {
		//1)Sorteio
		int a[] = new int[10];
		for(int i = 0; i < a.length; i++) {
			int sorte = (int)(Math.random()*10)+1;
			a[i] = sorte;
		}
		//a)Separa impar e par
		int b[] = new int[10];
		int c[] = new int[10];
		for(int i = 0; i < a.length;i++) {
			if(a[i]%2 == 0) {
				b[i] = a[i];
			}else {
				c[i] = a[i];
			}
		}
		System.out.println("Pares:");
		for(int i = 0;i < b.length;i++) {
			if(b[i] != 0){
			System.out.println(b[i]);
			}
		}
		System.out.println("Impares:");
		for(int i = 0;i < c.length;i++) {
		if(c[i] != 0) {
			System.out.println(c[i]);
		}
		}
		//b)Soma
		int d = 0;
		for(int i = 0; i < a.length; i++) {
			d = d+a[i];
		}
		System.out.println("A soma entre os números do vetor é: "+d);
		//c)Menor e maior
		Arrays.sort(a);
		System.out.println("O menor é: "+a[0]);
		System.out.println("O maior é: "+a[9]);
		//d)Crescente e decrescente
		System.out.println("Crescentes:");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Decrescente");
		for(int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		//e)Acerta mizeravi
		int h = 0;
		for(int i = 0; i < 3;i++) {
			h = Integer.parseInt(JOptionPane.showInputDialog(null,"Chuta ae meu parceiro"));
			for(int j = 0; j < a.length;j++) {
				if(h == a[j]) {
					System.out.println("Você acertou parceiro, posição: "+a[j]);
					i = 4;
					j = 1235;
				}
			}
		}
	}
}
