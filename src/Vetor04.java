//Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos
//elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.

import java.util.Scanner;
import java.util.Locale;

public class Vetor04{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        
        double[] vet = new double[N];

        double soma = 0;
        
        for(int i = 0; i < N; i++){
            vet[i] = sc.nextDouble();
            soma = soma + vet[i];
        }

        double media = soma / N;
    
        System.out.println(media);

        sc.close();
    }
}
