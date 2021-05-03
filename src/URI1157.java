//Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class URI1157 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }

       




        sc.close();
    }
    
}
