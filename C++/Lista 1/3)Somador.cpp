#include <stdio.h>
#include <stdlib.h>
int main()
{
	int a, b, c;
	a=0;
	b=0;
	c=0;
	printf("SOMA DE DOIS NUMEROS:\nOBS: Digite somente numeros inteiros, obrigado:)\n");
	printf("Digite um numero: ");
	scanf("%d", &a);
	printf("Digite outro numero: ");
	scanf("%d", &b);
	c = a+b;
	printf("O resultado da soma: %d \n",c);
	system("PAUSE");
}
