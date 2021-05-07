//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela:
//- todos os números pares
//- a quantidade de números pares

import java.util.Scanner;
import java.util.Locale;

public class Vetor02 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        int[] vet = new int[N];

        for(int i = 0; i < N; i++){
            vet[i] = sc.nextInt();
        }

        int pares = 0;
        for(int i = 0; i < N; i++){
            if(vet[i] % 2 == 0){
                pares++;
                System.out.println(vet[i]);
            }
        }
        System.out.println(pares);

        sc.close();
    }
}
