//Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

import java.util.Scanner;
import java.util.Locale;

public class URI1132 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int X = sc.nextInt();
        int Y = sc.nextInt();
       
        int menor = X;
        int maior = Y;
        
        if(X > Y){
            menor = Y;
            maior = X;
        }

        int soma = 0;
        for(int i = menor; i <= maior; i++){
            if(i % 13 != 0){
                soma = soma + i;
            }
        }
        
        System.out.println(soma);

        sc.close();
    }
    
}
