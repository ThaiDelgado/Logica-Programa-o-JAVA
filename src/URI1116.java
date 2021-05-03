//Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

import java.util.Scanner;
import java.util.Locale;

public class URI1116 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int dividendo = sc.nextInt();
            int divisor = sc.nextInt();

            float divisao = (float)dividendo / divisor;

            if(divisor!=0){
                System.out.printf("%.1f%n", divisao);
            }else {
                System.out.println("Divisão impossivel");
            }
        }

        sc.close();
    }
    
}
