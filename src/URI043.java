import java.util.Locale;
import java.util.Scanner;

public class URI043 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangulo;
        double altTrapezio;
        double trapezio;

        if (A + B > C && A + C > B){
            if (B + C > A) {
                triangulo = A + B + C;
                System.out.printf("Area = %.1f%n", triangulo);
            } else {
                altTrapezio = (A + B) / 2;
                trapezio = (A + B * altTrapezio) / 2;
                System.out.printf("Perimetro = %.1f%n", trapezio);
            }

            sc.close();
        }
    }
}