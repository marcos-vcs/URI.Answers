#include <stdio.h>
#include <locale.h>
const dist = 30, tempo = 60;
int dif = 0, result;

int main(){
	setlocale(LC_ALL,"portuguese");
	
	scanf("%i",&dif);
	
	result = (tempo / dist);
	result = result * dif;
	printf("%i minutos\n",result);
	
	return 0;
}
