//Fazer um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

import java.util.Locale;
import java.util.Scanner;

public class URI1065 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int pares = 0;

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            if(num%2==0)pares++;
        }
        System.out.println(pares + " valores pares.");

        sc.close();
    }
}



