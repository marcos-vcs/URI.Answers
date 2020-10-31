package pkg1013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int maiorAB = ((a+b+Math.abs(a-b)))/2;
        
            if(c > maiorAB){
                System.out.println(c+" eh o maior");
            }else{
                System.out.println(maiorAB+" eh o maior");
            }
            
            
       
    }
    
}
