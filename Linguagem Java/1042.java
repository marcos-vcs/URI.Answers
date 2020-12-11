package pkg1042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int ordem[] = new int[3];
        
        if(a < b && a < c)
        {
            ordem[0] = a;
            
            if(b < c){
                ordem[1] = b; 
                ordem[2] = c;
            }else if(c < b){
                ordem[1] = c;
                ordem[2] = b;
            }
        }
        if(b < a && b < c)
        {
            ordem[0] = b;
            
            if(a < c){
                ordem[1] = a; 
                ordem[2] = c;
            }else if(c < a){
                ordem[1] = c;
                ordem[2] = a;
            }
        }
        if(c < a && c < b)
        {
            ordem[0] = c;
            
            if(a < b){
                ordem[1] = a; 
                ordem[2] = b;
            }else if(b < a){
                ordem[1] = b;
                ordem[2] = a;
            }
        }
        
        
        System.out.println(ordem[0]+"\n"+ordem[1]+"\n"+ordem[2]+"\n");
        System.out.println(a+"\n"+b+"\n"+c);
        
        
    
        }
    
  }
