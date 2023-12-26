
public class Escola {
	String nome;
	String turma;
	double media,n1,n2,n3;
	
	public void Media(double n1,double n2,double n3) {
		media = (n1+n2+n3)/3;
	}
	public void Status() {
		if(media > 6 && media <= 10) {
			System.out.println("Aprovado!");
		}
		else if(media < 6 && media > 4) {
			System.out.println("Recuperação!");
		}
		else if(media > 0 && media <= 4) {
			System.out.println("Reprovado!");
		}else {
			System.out.println("Média inválida!");
		}
	}
	
}
