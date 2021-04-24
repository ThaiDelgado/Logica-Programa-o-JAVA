//Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

import java.util.Scanner;

public class URI1074 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x<0 && x%2!=0){
                System.out.println("NEGATIVE ODD");
            }else if(x<0 && x%2==0){
                System.out.println("NEGATIVE EVEN");
            }else if(x>0 && x%2!=0){
                System.out.println("POSITIVE ODD");
            }else if(x>0 && x%2==0){
                System.out.println("PSOITIVE EVEN");
            }else{
                System.out.println("NULL");
            }
        }
        
        sc.close(); 
    }    
}
