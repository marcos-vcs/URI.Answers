package pkg1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();
        float perimetro, area;
        
        if(A < B+C && B < A+C && C < A+B){
           perimetro = A + B + C;
           System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
         
        
        
    }
    
}
