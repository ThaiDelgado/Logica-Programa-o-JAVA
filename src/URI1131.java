//A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

//- Quantos GRENAIS fizeram parte da estatística.
//- O número de vitórias do Inter.
//- O número de vitórias do Grêmio.
//- O número de Empates.
//- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

import java.util.Locale;
import java.util.Scanner;

public class URI1131 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empate = 0;
        
        int novoGrenal = 1;

        while(novoGrenal == 1){
            int golInter = sc.nextInt();
            int golGremio = sc.nextInt();

            if(golInter>golGremio){
                vitoriaInter = vitoriaInter + 1;
            }else if(golGremio>golInter){
                vitoriaGremio = vitoriaGremio + 1;
            }else{
                empate = empate + 1;
            }

            System.out.println("Novo Grenal (1-sim 2-não)");
            novoGrenal = sc.nextInt();
        }

        int total = vitoriaGremio + vitoriaInter + empate;

        System.out.println(total + " Grenais");
        System.out.println("Inter: " + vitoriaInter);
        System.out.println("Gremio: " + vitoriaGremio);
        System.out.println("Empates: " + empate);

        if(vitoriaGremio>vitoriaInter){
            System.out.println("Gremio venceu mais!");
        }else if(vitoriaInter>vitoriaGremio){
            System.out.println("Inter venceu mais!");
        }else{
            System.out.println("Não houve vencendor!");
        }

        sc.close();
    }
}


