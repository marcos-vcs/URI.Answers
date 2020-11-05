package pkg1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int min = 0, hora = 0;
        
        while(n >= 60){
            min++;
            n-=60;
        }
        while(min >= 60){
            hora++;
            min-=60;
        }
        
        System.out.println(hora+":"+min+":"+n);
         
        
    }
    
}
