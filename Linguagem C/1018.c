#include <stdio.h>
#include <locale.h>

int n = 0;
int notas[8];

int main(){
setlocale(LC_ALL,"portuguese");
	
	scanf("%i",&n);
	notas[7] = n;
	
		if(n < 0 || n > 1000000){
			scanf("%i",&n);
		}
	
	while(notas[7] >= 100){
			notas[0]++;
			notas[7]-=100;
	}
	while(notas[7] >= 50){
			notas[1]++;
			notas[7]-=50;
	}
	while(notas[7] >= 20){
			notas[2]++;
			notas[7]-=20;
	}
	while(notas[7] >= 10){
			notas[3]++;
			notas[7]-=10;
	}
	while(notas[7] >= 5){
			notas[4]++;
			notas[7]-=5;
	}
	while(notas[7] >= 2){
			notas[5]++;
			notas[7]-=2;
	}
	while(notas[7] >= 1){
			notas[6]++;
			notas[7]-=1;
	}
	printf("%i\n",n);
	printf("%i nota(s) de R$ 100,00\n",notas[0]);
	printf("%i nota(s) de R$ 50,00\n",notas[1]);
	printf("%i nota(s) de R$ 20,00\n",notas[2]);
	printf("%i nota(s) de R$ 10,00\n",notas[3]);
	printf("%i nota(s) de R$ 5,00\n",notas[4]);
	printf("%i nota(s) de R$ 2,00\n",notas[5]);
	printf("%i nota(s) de R$ 1,00\n",notas[6]);
	
	return 0;
}
