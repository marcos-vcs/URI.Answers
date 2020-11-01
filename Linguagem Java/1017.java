package pkg1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int tempo = input.nextInt();
        int kmH = input.nextInt();
        double consumo = ((float)tempo * kmH)/12;
        
            System.out.printf("%.3f\n", consumo);
        
        
    }
    
}
