#include <stdio.h>
#include <stdlib.h>
int main(){
	float compra,resultado;
	char c;
	printf("Digite o valor da compra: \n");
	scanf("%f",&compra);
	printf("Digite o codigo do desconto: \n");
	scanf("%s",&c);
	switch(c){
		case '1': printf("O valor original da compra era: %0.2f \n",compra);
		resultado = compra*0.05;
		printf("O valor da compra com desconto eh: %0.2f \n",compra-resultado);
		break;
		case '2': printf("O valor original da compra era: %0.2f \n",compra);
		resultado = compra*0.1;
		printf("O valor da compra com desconto eh: %0.2f \n",compra-resultado);
		break;
		case '3': printf("O valor original da compra era: %0.2f \n",compra);
		resultado = compra*0.2;
		printf("O valor da compra com desconto eh: %0.2f \n",compra-resultado);
		break;
		case '4': printf("O valor original da compra era: %0.2f \n",compra);
		resultado = compra*0.3;
		printf("O valor da compra com desconto eh: %0.2f \n",compra-resultado);
		break;
		default: printf("Desconto invalido!\n O valor da compra eh: %0.2f \n",compra);
		break;
	}
	system("PAUSE");
}
