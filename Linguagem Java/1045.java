package pkg1045;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double aux;
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if(b > a && b > c){
            aux = a;
            a = b;
            b = aux;
        }else if(c > a){
            aux = a;
            a = c;
            c = aux;
        }
        
        if(a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");   
        }else{
            		if (a*a == (b*b) + (c*c)) System.out.println("TRIANGULO RETANGULO");
			if (a*a > (b*b) + (c*c)) System.out.println("TRIANGULO OBTUSANGULO");
			if (a*a < (b*b) + (c*c)) System.out.println("TRIANGULO ACUTANGULO");
			if (a == b && a == c) System.out.println("TRIANGULO EQUILATERO");
			if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) System.out.println("TRIANGULO ISOSCELES");
        }


    }
    
}
