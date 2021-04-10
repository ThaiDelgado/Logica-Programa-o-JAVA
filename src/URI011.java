import java.util.Scanner;
public class URI011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double pi = 3.14159;

        double area = 4.0 / 3.0 * pi * Math.pow(R,3.0);

        System.out.printf("VOLUME = %.3f", area);

        sc.close();
    
    
    }
    
}
