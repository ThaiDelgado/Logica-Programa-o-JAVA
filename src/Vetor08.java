//Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
// a maior e a menor altura do grupo
// a média de altura das mulheres
// o número de homens

import java.util.Scanner; 
import java.util.Locale;

public class Vetor08{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        double[] altura = new double[N];
        char[] sexo = new char[N];

        for(int i = 0; i < N; i++){
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double maiorAltura = altura[0];
        for(int i = 0; i < N; i++){
            if(maiorAltura < altura[i]){
                maiorAltura = altura[i];
            } 
        }
        System.out.printf("Maior altura: %.2f%n", maiorAltura);

        double menorAltura = altura[0];
        for(int i = 0; i < N; i++){
            if(menorAltura > altura[i]){
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura: %.2f%n", menorAltura);

        double somaMulheres = 0.0;
        double contMulheres = 0.0;
        for(int i = 0; i < N; i++){
            if(sexo[i] == 'F'){
                somaMulheres = somaMulheres + altura[i];
                contMulheres++;
            }
        }

        double mediaAlturaMulheres = somaMulheres / contMulheres;
        System.out.printf("Media da altura das mulheres: %.2f%n", mediaAlturaMulheres);

        double contHomens = 0;
        for(int i = 0; i < N; i++){
            if(sexo[i] == 'M'){
                contHomens++;
            }
        }
        System.out.println("Quantidade de homens: " + contHomens);
        
        sc.close();
    }
}
