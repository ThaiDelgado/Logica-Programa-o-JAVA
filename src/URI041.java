import java.util.Locale;
import java.util.Scanner;

public class URI041{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if( x > 0 && y > 0){
            System.out.println("Q1");
        }else {
            if(x < 0 && y > 0){
                System.out.println("Q2");
            }else {
                if(x < 0 && y < 0){
                    System.out.println("Q3");
                }else{
                    if(x > 0 && y < 0){
                        System.out.println("Q4");
                    }else {
                        if(x == 0 && y == 0){
                            System.out.println("Origem");
                        }
                    }
                }
            }
        }




        sc.close();
    }


}
    
