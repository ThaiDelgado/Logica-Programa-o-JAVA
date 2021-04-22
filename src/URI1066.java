//Ler 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

import java.util.Locale;
import java.util.Scanner;

public class URI1066 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;

        for(int i=0; i<5; i++){
            double num = sc.nextDouble();
            if(num>0)positivos++;
            if(num<0)negativos++;
            if(num%2==0)pares++;
            if(num%2!=0)impares++;
        }
        System.out.println(positivos + " numeros positivos.");
        System.out.println(negativos + " numeros negativos.");
        System.out.println(pares + " numeros pares.");
        System.out.println(impares + " numeros impares.");

        sc.close();
    }
}
