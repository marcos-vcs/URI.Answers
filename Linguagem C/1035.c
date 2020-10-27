#include <stdio.h>
#include <locale.h>
int a, b, c, d,s_1, s_2;

int main(){
setlocale(LC_ALL,"portuguese");
	scanf("%i %i %i %i",&a,&b,&c,&d);
	s_1 = c+d;
	s_2 = a+b;
	if(b > c && d > a && s_1 > s_2 && c >= 0 && d >= 0 && a % 2 == 0){
		printf("Valores aceitos\n");
	}else{
		printf("Valores nao aceitos\n");
	}
	
	
	return 0;
}
