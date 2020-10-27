#include <stdio.h>
#include <locale.h>
const consumo = 12;
int temp = 0, v_media = 0;
float litros = 0;

int main(){
setlocale(LC_ALL,"portuguese");
	scanf("%i %i",&temp,&v_media);
	litros = v_media*temp;
	litros = litros/consumo;
		printf("%.3f\n",litros);
	
	return 0;
}
