import java.util.Scanner;

public class URI014{
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);

        int distTotal = sc.nextInt();
        float combTotal = sc.nextFloat();

        float media = distTotal/combTotal;

        System.out.printf("%.3f Km/l%n", media);


        sc.close();
    }

}