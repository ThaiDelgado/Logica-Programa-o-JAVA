import java.util.Locale;
import java.util.Scanner;


public class URI04{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        
        if(A<B && B<C){
            System.out.println(A + "-" + B + "-" + C);  
        }else{
            if(A>B && B<C){
                System.out.println(B + "-" + A + "-" + C); 
            }else{ 
                if(A<B && B>C){
                    System.out.println(C + "-" + A + "-" + B); 
                }else{
                    if(A>B && B>C){
                        System.out.println(C + "-" + B + "-" + A); 
                    }
                }
            }
            }

            System.out.println(A + "-" + B + "-" + C); 

        

        sc.close();
        
    
    
    }
}



