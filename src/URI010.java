import java.util.Scanner;

public class URI010 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int quantidade1 = sc.nextInt();
        float valorUnt1 = sc.nextFloat();

        int codPeca2 = sc.nextInt();
        int quantidade2 = sc.nextInt();
        float valorUnt2 = sc.nextFloat();

        float valorTotal = quantidade1 * valorUnt1 + quantidade2 * valorUnt2;

        System.out.printf("CODIGOS DAS PEÇAS %f %f%n VALOR A PAGAR = R$%.2f",valorTotal, codPeca1, codPeca2);
      // preciso arrumar. codigo com erro











        sc.close();
    }
    
}
