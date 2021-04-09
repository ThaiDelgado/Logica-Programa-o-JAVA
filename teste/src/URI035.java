import java.util.Scanner;

public class URI035 { 
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int soma1 = A + B;
        int soma2 = C + D;
        int resto = A%2;


        if(B>C && D>A && soma2>soma1 && C>0 && D>0 && resto==0){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores não aceitos");
        }

        sc.close();
    }
    
}
