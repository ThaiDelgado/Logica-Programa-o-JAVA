import java.util.Scanner;
public class URI006 {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        float A, B, C, medPonderada;

         A = sc.nextFloat();
         B = sc.nextFloat();
         C = sc.nextFloat();

         medPonderada = (A * 2 + B * 3 + C * 5) / 10;

         System.out.printf("MEDIA = %.1f %n", medPonderada);

        sc.close();
    }
}
