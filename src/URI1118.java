//Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

//No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

import java.util.Locale;
import java.util.Scanner;

public class URI1118 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int novoCalculo = 1;

        while(novoCalculo == 1){
            double nota1 = sc.nextDouble();
            while(nota1<0.0 || nota1>10.0){
                System.out.println("Nota invalida");
                nota1 = sc.nextDouble();
            }
        
            double nota2 = sc.nextDouble();
            while(nota2<0.0 || nota2>10.0){
                System.out.println("Nota invalida");
                nota2 = sc.nextDouble();
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("Media = %.2f%n", media);

            System.out.println("Novo calculo (1-sim  2-não)");
            
            novoCalculo = sc.nextInt();
            while(novoCalculo != 1 && novoCalculo !=2){
                System.out.println("Novo calculo (1-sim  2-não)");
                novoCalculo = sc.nextInt();
            }
        }   
         
        sc.close();

    }
}

    

