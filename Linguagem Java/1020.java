package pkg1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int idade = input.nextInt();
        int mes = 0, ano = 0;
        
        while(idade >= 365){
            ano++;
            idade-=365;
        }
        while(idade >= 30){
            mes++;
            idade-=30;
        }
        
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(idade+" dia(s)");
        
        
        
    }
    
}
