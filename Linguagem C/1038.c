#include <stdio.h>
float op, qtd, preco;

int main(){
	scanf("%f %f",&op, &qtd);
	
	if(op == 1){
		op = qtd * 4;
	}else if(op == 2){
		op = qtd * 4.5;
	}else if(op == 3){
		op = qtd * 5;
	}else if(op == 4){
		op = qtd * 2;
	}else if(op == 5){
		op = qtd * 1.50;
	}
	printf("Total: R$ %.2f\n",op);
	return 0;
}
