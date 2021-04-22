//Ler um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

import java.util.Locale;
import java.util.Scanner;

public class URI1070 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

    
        int num = sc.nextInt();


        for(int i=1; i<12; i=i+2){
                System.out.println(num+i);
        }
        
        
        
        sc.close();
    }
    
}

