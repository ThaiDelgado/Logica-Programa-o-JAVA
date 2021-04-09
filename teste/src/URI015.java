import java.util.Scanner;

public class URI015 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x-x1, 2.0) + Math.pow(y - y1, 2.0));

        System.out.printf("%.4f", distancia);


        sc.close();
    }
        
    
}
