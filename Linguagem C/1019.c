#include <stdio.h>
#include <locale.h>

int n = 0, h[3];

int main(){
setlocale(LC_ALL,"portuguese");
	scanf("%i",&n);	
	
	h[2] = n;
	while(h[2] >= 60){
		h[2] -=60;
		h[1]++;
	}
	while(h[1] >= 60){
		h[1] -=60;
		h[0]++;
	}
	printf("%i:%i:%i\n",h[0], h[1], h[2]);
	
	return 0;
}
