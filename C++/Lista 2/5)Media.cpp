#include <stdio.h>
#include <stdlib.h>
int main()
{
	float a,b,c,d;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	printf("MEDIA:\n");
	printf("Digite a primeira nota:\n");
	scanf("%d",&a);
	printf("Digite a segunda nota:\n");
	scanf("%d",&b);
	printf("Digite a nota do trabalho:\n OBS: a nota maxima eh 1\n");
	scanf("%d",&c);
	d = ((a+b)/2)+(0.7 * c *0.3);
	printf("Sua media e: %d \n",d);
	if(d >= 6){
		printf("Aprovado!\n");
	}else{
		if(d < 6 && d >= 4){
			printf("Recuperacao!\n");
		}else{
			if(d < 4){
				printf("Reprovado!\n");
			}
		}
	}
	system("PAUSE");
}
