//Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.
import java.util.Locale;
import java.util.Scanner;

public class URI1154 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while(idade>0){
            soma+=idade;
            cont+=1;
            idade = sc.nextInt();
        }
        if(cont>0){  
            double media = (double)soma / cont;
            System.out.printf(("%.2f%n"), media);
        }

        sc.close();
    }
    
}
