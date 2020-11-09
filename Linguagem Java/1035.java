package pkg1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int somaCD = c+d;
        int somaAB = a+b;
        
        if(b > c && d > a && somaCD > somaAB && c >= 0 && d >= 0 && a%2 == 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        
        
        
    }
    
}
