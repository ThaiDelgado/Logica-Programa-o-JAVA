//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
//cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.

import java.util.Scanner;
import java.util.Locale;

public class Vetor03{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        int[] vetA = new int[N];
        int[] vetB = new int[N];

        for(int i = 0; i < N; i++){
            vetA[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            vetB[i] = sc.nextInt();
        }

        int[] vetC = new int[N];
        for(int i = 0; i < N; i++){
            vetC[i] = vetA[i] + vetB[i];
        }

        for(int i = 0; i < N; i++){
            System.out.println(vetC[i]);
        }

        sc.close();
    }
    
}
