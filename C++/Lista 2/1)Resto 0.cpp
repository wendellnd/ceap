#include <stdio.h>
#include <stdlib.h>
int main(){
	float a, b, c;
	a=0;
	b=0;
	c=0;
	
	printf("DIGITE O DIVIDENDO: ");
	scanf("%f", &a);
	printf("DIGITE O DIVISOR: ");
	scanf("%f", &b);
	
	if (b==0){
		printf("ERRO\n");
		printf("NAO TEM COMO DIVIDIR NADA POR ZERO.\n");
	}
	else{
		c=a/b;
		printf("RESULTADO DA DIVISAO: %0.2f",c);		
		printf("\n");
	}
	
	
	
	system("PAUSE");
	
}
