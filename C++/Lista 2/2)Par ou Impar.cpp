#include <stdio.h>
#include <stdlib.h>
int main(){
	int a;
	a = 0;

	printf("DIGITE UM NUMERO: ");
	scanf("%d",&a);



	if(a%2==0){
		printf("NUMERO PAR\n");
	
	}else{
		printf("NUMERO IMPAR\n");
	}

	system("PAUSE");
}
