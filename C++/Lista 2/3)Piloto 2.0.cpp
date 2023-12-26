#include <stdio.h>
#include <stdlib.h>
int main(){
	char a[30];
	float b,c,d;
	b = 0;
	c = 0;
	d = 0;
	printf("Digite o nome do piloto: ");
	scanf("%s",&a);
	printf("Digite a distancia percorrida em KM: ");
	scanf("%f",&b);
	printf("Digite o tempo em horas: ");
	scanf("%f",&c);
	if(b < 0 || c < 0){
		printf("Numero negativo eh invalido!\n");
	}else{
		if(b == 0 || c == 0){
			printf("O numero 0 eh invalido!\n");
		}else{
				d = b/c;
				printf("A velocidade media do piloto %s",a);
				printf(" foi de %0.2f",d);
				printf("Km/h");
		}
	}
system("PAUSE");
}
