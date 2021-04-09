import java.util.Scanner;
public class URI016 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidadeMed = sc.nextInt();

        double dist = velocidadeMed * tempo;

        double resultado = dist / 12;

        System.out.printf("%.3f", resultado);

        
        sc.close();
    }
}