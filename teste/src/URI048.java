import java.util.Locale;
import java.util.Scanner;

public class URI048 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salario = sc.nextDouble();

        double percentual;
        if(salario <= 400){
            percentual = 15.0;
        } else {
            if(salario>=400.01 && salario<=800.00){
                percentual = 12.0;} 
            else{
                if(salario>=800.01 && salario<=1200.00){
                    percentual = 10.0;}
                    else{
                        if(salario>=1200.01 && salario<=2000.00){
                            percentual = 7.0;
                        } else {
                            percentual = 4.0;
                        }
                    }
                }
            }
            double reajuste = salario * percentual / 100;
            double novoSalario = salario +  reajuste;

            System.out.printf("Novo Salario = %.2f%n", novoSalario);
            System.out.printf("reajuste = %.2f%n", reajuste);
            System.out.printf("porcentagem = %.0f %%%n", percentual);
        sc.close();
    }
}



        