#include <stdio.h>
#include <stdlib.h>
int main(){
	int n;
	printf("Digite sua nota: \n");
	scanf("%i",&n);
	switch(n){
		case 0: printf("Seu conceito foi E \n");
		break;
		case 1: printf("Seu conceito foi E \n");
		break;
		case 2: printf("Seu conceito foi E \n");
		break;
		case 3: printf("Seu conceito foi D \n");
		break;
		case 4: printf("Seu conceito foi D \n");
		break;
		case 5: printf("Seu conceito foi D \n");
		break;
		case 6: printf("Seu conceito foi C \n");
		break;
		case 7: printf("Seu conceito foi C \n");
		break;
		case 8: printf("Seu conceito foi B \n");
		break;
		case 9: printf("Seu conceito foi B \n");
		break;
		case 10: printf("Seu conceito foi A \n");
		break;
		default: printf("Esse conceito nao existe!");
	}
}

