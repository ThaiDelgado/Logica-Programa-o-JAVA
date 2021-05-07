// fazer um programa que leia um numero inteiro positivo N, depois ler N numeros quaisquer e armazena-los em um vetor. Imprimir os valores em suas devidas posições.

import java.util.Locale;
import java.util.Scanner;

public class ExVetor{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for(int i = 0; i < N; i++){
            vet[i] = sc.nextDouble();
        }

        for(int i = 0; i < N; i++){
            System.out.printf("%.2f%n", vet[i]);

        }
 
        sc.close();
    }
    
}
