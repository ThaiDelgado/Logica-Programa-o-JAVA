import java.util.Locale;
import java.util.Scanner;

public class URI051{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salario = sc.nextDouble();

        double desconto;
        if(salario>0 && salario<=2000.00){
            desconto = 0.0;
        } else{
            if(salario<=3000.00){
                desconto = (salario - 2000.00) * 0.08;
            }else{
                if(salario<=4500.00){
                    desconto = (salario - 3000.00) * 0.18 + 1000 * 0.08;
                }else {
                    desconto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
                }
            }
        }    
        
        if (desconto == 0){
            System.out.println("Insento");
        } else{
            System.out.printf("R$ %.2f%n", desconto);
        }
        
    
            sc.close();
    }
 }
    

    

