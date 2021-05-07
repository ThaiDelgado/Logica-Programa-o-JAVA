//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome da pessoa mais velha.

import java.util.Scanner; 
import java.util.Locale;

public class Vetor06{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        String[] nomes = new String[N];
        int[] idade = new int[N];

        for(int i = 0; i < N; i++){
            nomes[i] = sc.next(); 
        }

        for(int i = 0; i < N; i++){
            idade[i] = sc.nextInt();
        }

        int posicaoMaior = 0;
        int idadeMaior = idade[0];
        for(int i = 0; i < N; i++){
            if(idadeMaior < idade[i]){
                idadeMaior = idade[i];
                posicaoMaior = i;
            }
        }
        
        System.out.println(nomes[posicaoMaior]);

        sc.close();
    }
}
