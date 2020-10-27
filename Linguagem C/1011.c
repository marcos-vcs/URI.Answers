#include <stdio.h>
double r, volume, pi = 3.14159;

int main(){
	scanf("%lf",&r);
	
	volume = (4/3.0)*pi*(r*r*r);
	printf("VOLUME = %.3lf\n",volume);
	
	return 0;
}
