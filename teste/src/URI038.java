import java.util.Locale;
import java.util.Scanner;

public class URI038 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod = sc.nextInt();
        int quant = sc.nextInt();
        double total;

        switch(cod){
            case 1:
                total =(double) quant*4.0;
                System.out.printf("TOTAL = %.2f%n", total);
                break;
            case 2:
                total = (double)quant*4.5;
                System.out.printf("TOTAL = %.2f%n", total);
                break;
            case 3:
                total = quant*5.0;
                System.out.printf("TOTAL = %.2f%n", total);
                break;
            case 4:
                total = quant*2.0;
                System.out.printf("TOTAL = %.2f%n", total);
                break;
            case 5:
                total = quant*1.5;
                System.out.printf("TOTAL = %.2f%n", total);
                break;
        }

        sc.close();
    }
}
