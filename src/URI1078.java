//Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N.      

import java.util.Scanner;
public class URI1078 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i<=10; i++){
            int produto = i * N;
            System.out.println(i + "x" + N + "=" + produto);
        }    


        sc.close();
    }
}
