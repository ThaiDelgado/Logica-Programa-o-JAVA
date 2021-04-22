//Ler um numero indeterminado de dados, contendo cada um, a idade de uma pessoa. O ultimo dado, que não entrará no calculo, contem um valor de idade negativa. Calcular e imprimir a idade media deste grupo de pessoas. SE for entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
import java.util.Locale;
import java.util.Scanner;

public class ExRepet {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num = sc.nextInt();
        int soma = 0;
        int cont = 0;
        double media;

        while(num >= 0){
            soma = soma + num; //Irá acumular os valores entrados;
            cont = cont + 1; //Irá fazer a contagem de entradas;
            num = sc.nextInt();
        }
        if(cont>0){
            media = (double)soma / cont;
            System.out.printf("%.2f%n", media);
        }else {
            System.out.println("Impossivel calcular");
        }

        sc.close();
    
        
    }
}