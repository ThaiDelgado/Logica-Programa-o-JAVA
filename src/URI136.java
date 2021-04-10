import java.util.Locale;
import java.util.Scanner;

public class URI136 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double delta = Math.pow(b,2) - 4.0 * a * c;

        double x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (- b - Math.sqrt(delta)) / (2.0 * a);

        if(delta < 0){
            System.out.println("Impossivel calcular.");
        } else {
            System.out.printf("x1 = %.5f%nx2= %.5f%n", x1, x2);
        }

    
    
        sc.close();
    }
    
}
