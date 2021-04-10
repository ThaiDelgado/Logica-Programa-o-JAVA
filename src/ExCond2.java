import java.util.Locale;
import java.util.Scanner;

public class ExCond2{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("MENOR = " + num1);
        } else{
            if(num2 < num1 && num2 < num3){
                System.out.println("MENOR = " + num2);
            }
            else {
                System.out.println("MENOR = " + num3);
            }
        }
    
    
        sc.close();
    }
}