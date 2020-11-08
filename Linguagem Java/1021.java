package pkg1021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int notas[] = new int[12];
        float n = input.nextFloat();
            while(n <= 0 || n >= 1000000.00){
                n = input.nextFloat();
            }
            
        while(n >= 100){
            notas[0]++;
            n -= 100.0f;
        }while(n >= 50){
            notas[1]++;
            n -= 50.0f;
        }while(n >= 20){
            notas[2]++;
            n -= 20.0f;
        }while(n >= 10){
            notas[3]++;
            n -= 10.0f;
        }while(n >= 5){
            notas[4]++;
            n -= 5.0f;
        }while(n >= 2){
            notas[5]++;
            n -= 2.0f;
        }
        
        
        System.out.println("NOTAS:");
        System.out.println(notas[0]+" nota(s) de R$ 100.00");
        System.out.println(notas[1]+" nota(s) de R$ 50.00");
        System.out.println(notas[2]+" nota(s) de R$ 20.00");
        System.out.println(notas[3]+" nota(s) de R$ 10.00");
        System.out.println(notas[4]+" nota(s) de R$ 5.00");
        System.out.println(notas[5]+" nota(s) de R$ 2.00");
        
        while(n >= 1){
            notas[6]++;
            n--;
        }while(n >= 0.5f){
            notas[7]++;
            n -= 0.5f;
        }while(n >= 0.25f){
            notas[8]++;
            n -= 0.25f;
        }while(n >= 0.10f){
            notas[9]++;
            n -= 0.10f;
        }while(n >= 0.05f){
            notas[10]++;
            n -= 0.05f;
        }
        n *= 100;
            while(n > 0.1f){
                notas[11]++;
                n -= 1;
            }
        
        System.out.println("MOEDAS:");
        System.out.println(notas[6]+" moeda(s) de R$ 1.00");
        System.out.println(notas[7]+" moeda(s) de R$ 0.50"); 
        System.out.println(notas[8]+" moeda(s) de R$ 0.25");
        System.out.println(notas[9]+" moeda(s) de R$ 0.10");
        System.out.println(notas[10]+" moeda(s) de R$ 0.05");
        System.out.println(notas[11]+" moeda(s) de R$ 0.01");
    }
    
}
