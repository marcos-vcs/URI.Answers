package pkg1008.uri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nFuncionario = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        float valorHora = input.nextFloat();
        
        valorHora = valorHora * horasTrabalhadas;

            System.out.println("NUMBER = "+nFuncionario);
            System.out.printf("SALARY = U$ %.2f\n",valorHora);

        
        
        
    }
    
}
