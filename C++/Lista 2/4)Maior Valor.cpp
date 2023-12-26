#include <stdio.h>
#include <stdlib.h>

int main(){
	float a,b,c;
	a = 0;
	b = 0;
	c = 0;
	printf("Digite o valor de A: ");
	scanf("%f",&a);
	printf("Digite o valor de B: ");
	scanf("%f",&b);
	printf("Digite o valor de C: ");
	scanf("%f",&c);
	if(a > b || a > c){
		printf("A tem o maior valor!\n");
	}else{
		if(b > c){
			printf("B tem o maior valor!\n");
		}else{
			printf("C tem o maior valor!\n");
		}
	}
	system("PAUSE");
}
