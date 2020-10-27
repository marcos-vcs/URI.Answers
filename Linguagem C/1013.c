#include <stdio.h>
#include <locale.h>

int a , b , c, maiorAB;

int main(){
	setlocale(LC_ALL,"portuguese");
	
	scanf("%i %i %i",&a,&b,&c);
	
		maiorAB = (a+b+abs(a-b))/2;
	if(maiorAB < c){
		printf("%i eh o maior\n",c);
	}
	if(maiorAB > c){
		printf("%i eh o maior\n",maiorAB);
	}
	return 0;
}
