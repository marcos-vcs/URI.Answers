#include <stdio.h>

const double pi = 3.14159;
double a = 0, b = 0, c = 0;
double triangulo = 0, circulo = 0, trapezio = 0, quadrado = 0, retangulo = 0;

int main(){
	scanf("%lf",&a);
	scanf("%lf",&b);
	scanf("%lf",&c);
	
	triangulo = (a * c)/2;
	printf("TRIANGULO: %.3lf\n",triangulo);
	
	circulo = pi * (c*c);
	printf("CIRCULO: %.3lf\n",circulo);
	
	trapezio = ((a + b) / 2)*c;
	printf("TRAPEZIO: %.3lf\n",trapezio);
	
	quadrado = b * b;
	printf("QUADRADO: %.3lf\n",quadrado);
	
	retangulo = a * b;
	printf("RETANGULO: %.3lf\n",retangulo);
	
	return 0;
}
