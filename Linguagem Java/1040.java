package pkg1040;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");

        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        float n4 = input.nextFloat();
        float media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
        
            System.out.println("Media: " + df.format(media));
        
        if(media >= 7)
        {
            System.out.println("Aluno aprovado.");
        } 
        
        if(media < 5)
        {
            System.out.println("Aluno reprovado.");
        }
        
        if(media >= 5 && media <= 6.9)
        {
            System.out.println("Aluno em exame.");
            float notaExame = input.nextFloat();
            
            System.out.println("Nota do exame: " + df.format(notaExame));
            
            media = (media+notaExame)/2;
            
                if(media >= 5)
                {
                    System.out.println("Aluno aprovado.");
                }
                if(media <= 4.9)
                {
                    System.out.println("Aluno reprovado.");
                }
            
            System.out.println("Media final: " + df.format(media));
                
            
        }
        
        
    }
    
}
