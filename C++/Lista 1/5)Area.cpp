#include <stdio.h>
#include <stdlib.h>
int main(){
	int a,b,c,r_1,r_2,r_3;
	a = 0;
	b = 0;
	c = 0;
	r_1 = 0;
	r_2 = 0;
	r_3 = 0;
	printf(" AREA DO TRAPEZIO, QUADRADO E CIRCULO\n OBS: os resultados serao inteiros\n");
	printf("Digite um numero: \n");
	scanf("%d",&a);
	printf("Digite outro numero: \n");
	scanf("%d",&b);
	printf("Digite outro numero: \n");
	scanf("%d",&c);
	r_1 = ((a+b)*c)/2;
	r_2 = b*b;
	//O resultado é arredondado pra menos
	//Se for multiplicado por 3 vai dar um resultado diferente
	r_3 = 3.14*(c*c);
	printf(" Area do trapezio: %d \n",r_1);
	printf("\n Area do quadrado: %d \n",r_2);
	printf("\n Area do circulo: %d \n",r_3);
}
