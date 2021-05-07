//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos.

import java.util.Scanner; 
import java.util.Locale;

public class Vetor05{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        int[] vet = new int[N];

        int contPares = 0;
        int somaPares = 0;
        for(int i = 0; i < N; i++){
            vet[i] = sc.nextInt();

            if(vet[i] % 2 == 0){
                contPares++;
                somaPares = somaPares + vet[i];
            }
        }

        if(contPares == 0){
            System.out.println("Não temos numeros pares.");
        }else {
            double media = somaPares / contPares;
            System.out.println(media);
        }

        sc.close();
    }
}
