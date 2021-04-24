import java.util.Scanner;
public class URI1071 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int min;
        int max;

        if(X<Y){
            min = X;
            max = Y;
        }else {
            min = Y;
            max = X;
        }

        int soma = 0;
        for(int i = min+1; i<max; i++){
            if(i%2!=0){
                soma = soma + i;
            }
        }
        System.out.println(soma);





        sc.close();

    }
}

