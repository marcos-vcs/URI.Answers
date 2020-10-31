package pkg1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
            int cod1 = input.nextInt();
            int nmr1 = input.nextInt();
            double vlrUni1 = input.nextDouble();
            vlrUni1 = nmr1 * vlrUni1;
            
            int cod2 = input.nextInt();
            int nmr2 = input.nextInt();
            double vlrUni2 = input.nextDouble();
            vlrUni2 = nmr2 * vlrUni2;
            
            vlrUni1 = vlrUni1 +vlrUni2;
            
            System.out.printf("VALOR A PAGAR: R$ %.2f\n", vlrUni1);
           
        
    }
    
}
