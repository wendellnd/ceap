#include <stdio.h>
#include <stdlib.h>
int main()
{
	int a,b,c,d;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	printf("MEDIA:\n");
	printf("Digite a primeira nota:\n");
	scanf("%d",&a);
	printf("Digite a segunda nota:\n");
	scanf("%d",&b);
	printf("Digite a terceira nota:\n");
	scanf("%d",&c);
	d = (a+b+c)/4;
	printf("Sua media e: %d \n",d);
	system("PAUSE");
}
