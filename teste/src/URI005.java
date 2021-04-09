import java.util.Scanner;

public class URI005 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double notaA, notaB, mediaPonderada;
        notaA = sc.nextDouble();
        notaB = sc.nextDouble();
        
        mediaPonderada =  (notaA * 3.5 + notaB * 7.5) / 11;

        System.out.printf("MEDIA = %.5f", mediaPonderada);
        
    sc.close();
    }
}
