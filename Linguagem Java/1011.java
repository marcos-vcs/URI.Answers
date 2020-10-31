package pkg1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pi = 3.14159;
        double r = input.nextDouble();
        double volume = ((4/3.0)*pi*Math.pow(r, 3));
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
        
    }
    
}
