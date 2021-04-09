import java.util.Scanner;

public class URI018 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int n100, n50, n20, n10, n5, n1;
        int r100, r50, r20, r10, r5;

        n100 = valor / 100; // n100 vai receber o valor da divisão
        r100 = valor % 100; // r100 vai receber o resto da divisão 

        n50 = r100 / 50;
        r50 = r100 % 50;

        n20 = r50 / 20;
        r20 = r50 % 20;

        n10 = r20 / 10;
        r10 = r20 % 10;

        n5 = r10 / 5;
        r5 = r10 % 5;

        n1 = r5 / 1; 
    

        System.out.println(valor);
        System.out.println("Cedulas de 100 = " + n100);
        System.out.println("Cedulas de 50 = " + n50);
        System.out.println("Cedulas de 20 = " + n20);
        System.out.println("Cedulas de 10 = " + n10);
        System.out.println("Cedulas de 5 = " + n5);
        System.out.println("Cedulas de 1 = " + n1);


        sc.close();
    }

    
}
