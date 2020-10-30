package pkg1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nome = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();
        
        totalVendas = ((totalVendas/100)*15)+salarioFixo;
        
        System.out.printf("TOTAL = R$ %.2f\n",totalVendas);
        
        
        
    }
    
}
