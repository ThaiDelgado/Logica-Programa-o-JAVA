//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

import java.util.Scanner;
import java.util.Locale;

public class URI1153 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
        
        int fatorial = 1;
        for(int i = 1; i <= N; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
