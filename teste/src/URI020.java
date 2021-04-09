import java.util.Scanner;

public class URI020 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int idadeDias = sc.nextInt();
        int anos, meses, dias, resto, restoMeses;

        anos = idadeDias / 365;
        resto = idadeDias % 365;

        meses = resto / 30;
        restoMeses = resto % 30;

        dias = restoMeses;

        System.out.println(anos + " ano(s).");
        System.out.println(meses + " meses.");
        System.out.println(dias + " dias.");
        
        sc.close();


    }
}   
        
        


