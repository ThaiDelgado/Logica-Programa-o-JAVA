//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

import java.util.Scanner;
import java.util.Locale;

public class URI1079 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("Media = %.1f%n", media);
            
            
        }
       
        sc.close();
    }
    
}
