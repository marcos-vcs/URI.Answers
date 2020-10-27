#include <stdio.h>
#include <locale.h>
double x, y;

int main(){
	setlocale(LC_ALL,"portuguese");
	
	scanf("%lf %lf",&x,&y);
	printf("%.3lf km/l\n",x/y);
	
	return 0;
}
