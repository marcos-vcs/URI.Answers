package pkg1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        int a = input.nextInt();
        int b = input.nextInt();

        if(a == b){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(a > b){
            total = (24 - a) + b;
            System.out.println("O JOGO DUROU "+ total +" HORA(S)");
        }else if(a < b){
            total = a - b;
            total = Math.abs(total);
            System.out.println("O JOGO DUROU "+ total +" HORA(S)");
        }

        



    }
    
}
