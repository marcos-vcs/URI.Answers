#include <stdio.h>
#include <locale.h>
float n, notas[7], moedas[7];


int main(){
	scanf("%f",&n);
		while(n < 0 || n > 1000000.00){
			scanf("%f",&n);
		}
	
	
	
		while( n >= 100){
			n-=100;
			notas[0]++; 
		}
		while( n >= 50){
			n-=50;
			notas[1]++; 
		}
		while( n >= 20){
			n-=20;
			notas[2]++; 
		}
		while( n >= 10){
			n-=10;
			notas[3]++; 
		}
		while( n >= 5){
			n-=5;
			notas[4]++; 
		}
		while( n >= 2){
			n-=2;
			notas[5]++; 
		}
		while( n >= 1){
			n-=1;
			moedas[0]++; 
		}
		while( n >= 0.50){
			n -=0.50;
			moedas[1]++;
		}
		while( n >= 0.25){
			n -=0.25;
			moedas[2]++;
		}
		while( n >= 0.10){
			n-=0.10;
			moedas[3]++;
		}
		while( n >= 0.05){
			n-=0.05;
			moedas[4]++;
		}
		moedas[5] = n;
		moedas[5] *=100;
		
		
		printf("NOTAS:\n");
		printf("%.0f nota(s) de R$ 100.00\n",notas[0]);
		printf("%.0f nota(s) de R$ 50.00\n",notas[1]);
		printf("%.0f nota(s) de R$ 20.00\n",notas[2]);
		printf("%.0f nota(s) de R$ 10.00\n",notas[3]);
		printf("%.0f nota(s) de R$ 5.00\n",notas[4]);
		printf("%.0f nota(s) de R$ 2.00\n",notas[5]);
		
		printf("MOEDAS:\n");
		printf("%.0f moeda(s) de R$ 1.00\n",moedas[0]);
		printf("%.0f moeda(s) de R$ 0.50\n",moedas[1]);
		printf("%.0f moeda(s) de R$ 0.25\n",moedas[2]);
		printf("%.0f moeda(s) de R$ 0.10\n",moedas[3]);
		printf("%.0f moeda(s) de R$ 0.05\n",moedas[4]);
		printf("%.0f moeda(s) de R$ 0.01\n",moedas[5]);
		
	
	return 0;
}
