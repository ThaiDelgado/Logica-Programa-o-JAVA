//Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

import java.util.Locale;
import java.util.Scanner;

public class URI1064 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int positivos = 0;
        int somaMedia = 0;
        double media;
    


        for(int i=0; i<6; i++){ 
            double num = sc.nextDouble();
            if(num>0)positivos++;
            if(num>0){
            somaMedia += num;
            }
        }
        
        media = somaMedia / positivos;
        
        System.out.println( positivos + " valores positivos.");
        System.out.println( media + " é a média entre eles.");

        sc.close();
    }
    
}
