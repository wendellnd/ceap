#include <stdio.h>
#include <stdlib.h>
int main(){
	float a,b;
	char c;
	printf("Digite um numero: \n");
	scanf("%f",&a);
	printf("Digite outro numero: \n");
	scanf("%f",&b);
	printf("Operacao\n 1-Soma\n 2-Subtracao\n 3-Multiplicacao\n 4-Divisao\n Digite a opcao: \n");
	scanf("%s",&c);
	switch(c){
		case '1': printf("O valor da soma eh: %0.3f \n",a+b);
		break;
		case '2': printf("O valor da subtracao eh: %0.3f \n",a-b);
		break;
		case '3': printf("O valor da multiplicacao eh: %0.3f \n",a*b);
		break;
		case '4': printf("O valor da divisao eh: %0.3f \n",a/b);
		break;
		default: printf("Opcao invalida! \n");
	}
	system("PAUSE");
}
