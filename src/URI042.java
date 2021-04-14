import java.util.Locale;
import java.util.Scanner;

public class URI042{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double A,B,C;

        if(n1>n2 && n1>n3){
            A = n1;
            if(n2>n3){
                B = n2;
                C = n3;
            } else {
                B = n3;
                C = n2;
            }
        }else if(n2>n1 && n2>n3){
            A = n2;
            if(n1>n3){
                B = n1;
                C = n3;
            }else{
                B = n3;
                C = n1;
            }
        }else{
            A = n3;
            if(n2>n1){
                B = n2;
                C = n3;
            }else{
                B = n3;
                C = n2;
            }
        }
        if(A>=B+C){
            System.out.println("Não forma triangulo");
        }else if(A*A==B+C){
            System.out.println("Triangulo Retangulo");
        }else if (A*A>B*B + C*C){
            System.out.println("Triangulo obtusangulo");
        }else{
            System.out.println("Triangulo acutangulo");
        }
        if(A==B && B==C){
            System.out.println("Equilatero");
        }else if(A==B || B==C || A==C){
            System.out.println("Isosceles");
        }
    

        sc.close();
    }


}