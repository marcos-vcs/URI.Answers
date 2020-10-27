#include <stdio.h>
#include <locale.h>
int n = 0, d[2];

int main(){
setlocale(LC_ALL,"portuguese");
	scanf("%i",&n);
	
	while(n >= 365){
		n-=365;
		d[0]++;
	}
	while(n >= 30){
		n-=30;
		d[1]++;
	}
	printf("%i ano(s)\n%i mes(es)\n%i dia(s)\n",d[0],d[1],n);
	
	return 0;
}
