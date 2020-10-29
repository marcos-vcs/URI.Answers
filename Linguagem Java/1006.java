package pkg1006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double a = input.nextDouble();
            while(a > 10){
                a = input.nextDouble();
            }
            
        double b = input.nextDouble();
            while(b > 10){
                b = input.nextDouble();
            }
            
        double c = input.nextDouble();
            while(c > 10){
                c = input.nextDouble();
            }
        
        double media = ((a*2)+(b*3)+(c*5))/10;
            System.out.printf("MEDIA = %.1f", media);
            System.out.println("");
        
    }
    
}
