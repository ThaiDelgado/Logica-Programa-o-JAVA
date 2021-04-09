import java.util.Scanner;

public class URI008 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int numFunc = sc.nextInt();
        float hrsTrabalhadas = sc.nextFloat();
        float valorHora = sc.nextFloat();
        
        float salario = valorHora * hrsTrabalhadas;

        System.out.printf("NUMERO = %d%nSALÁRIO = %.2f", numFunc, salario);

        sc.close();
    }

    
}
