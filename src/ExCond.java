import java.util.Locale;
import java.util.Scanner;

public class ExCond {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = nota1 + nota2;

        if(media < 60){
            System.out.printf("NOTA FINAL = %.1f%n", media);
            System.out.println("REPROVADO");
        } else {
            System.out.printf("NOTA FINAL =  %.1f%n", media);
        }

        sc.close();
    }
    
}
