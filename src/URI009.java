import java.util.Scanner;

public class URI009 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();

        double salFinal = (15 * vendas) / 100 + salario;

        System.out.printf("%s RECEBE O TOTAL DE R$%.2f", nome,salFinal);


        sc.close();
    }
}
