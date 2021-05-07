//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.

import java.util.Scanner; 
import java.util.Locale;

public class Vetor07{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        String[] alunos = new String[N];
        double[] notaPrimeiroS  = new double[N];
        double[] notaSegundoS = new double[N];
        double[] mediaAlunos = new double[N];

        
        for(int i = 0; i < N; i++){
            alunos[i] = sc.next();
            notaPrimeiroS[i] = sc.nextDouble();
            notaSegundoS[i] = sc.nextDouble();
        }

        double media;
        for(int i = 0; i < N; i++){
            media = (notaPrimeiroS[i] + notaSegundoS[i]) / 2.0;
            mediaAlunos[i] = media;
            if(mediaAlunos[i] >= 6.0){
                System.out.println(alunos[i]);
            }

        }

            sc.close();
    }
}