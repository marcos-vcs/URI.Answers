package pkg1036;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double t = 0;
        double x1, x2;
        
        
        if(((b * b) - 4 * c) < 0 || a == 0){
           System.out.println("Impossivel calcular"); 
        }else{
            t = Math.sqrt((b * b) - 4 * a * c);
            x1 = (-b + t) / (2 * a);
            x2 = (-b - t) / (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
            
      
        }
        
        
    }
    
}
