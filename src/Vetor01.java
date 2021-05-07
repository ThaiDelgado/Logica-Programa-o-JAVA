//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior númerodo vetor (supor não haver empates). Mostrar também a posição do maior elemento.

import java.util.Scanner;
import java.util.Locale;

public class Vetor01 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        double[] vet = new double[N];

        for(int i = 0; i < N; i++){
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int posicaoMaior = 0;

        for(int i = 0; i < N; i++){
            if(maior < vet[i]){
                maior = vet[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
		System.out.println(posicaoMaior);

        sc.close();
    }
    
}
