import java.util.Scanner;

public class URI012 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        pi = 3.14159;

        double triangulo = A * C / 2.0;
        double circulo = pi * Math.pow(C,2);
        double trapezio = (A + B) / 2.0 * C;
        double quadrado = Math.pow(B,2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO = %.3f%nCIRCULO = %.3f%nTRAPEZIO = %.3f%nQUADRADO = %.3f%nRETANGULO = %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);


        sc.close();
    }
    
}
