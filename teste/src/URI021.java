import java.util.Scanner;

public class URI021 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int n100, n50, n20, n10, n5, n2;
        int r100, r50, r20, r10, r5, r2;
        int m1, mCinq, mVint, mDez, mCinco, mUm;
        int rm1, rmCinq, rmVint, rmDez, rmCinco;

        n100 = (int)valor / 100;
        r100 = (int)valor % 100;

        n50 = r100 / 50;
        r50 = r100 % 50;

        n20 = r50 / 20;
        r20 = r50 % 20;

        n10 = r20 / 10;
        r10 = r20 % 10;

        n5 = r10 / 5;
        r5 = r10 % 5;

        n2 = r5 / 2;
        r2 = r5 % 2;

        m1 = r2 / 100;
        rm1 = r2 % 100;

        mCinq = rm1 / 50;
        rmCinq = rm1 % 50;

        mVint = rmCinq / 20;
        rmVint = rmCinq % 20;

        mDez = rmVint / 10;
        rmDez = rmVint % 10;

        mCinco = rmDez / 5;
        rmCinco = rmDez % 5;

        mUm = rmCinco / 1;

        System.out.println("NOTAS DE 100 =  " + n100);  
        System.out.println("NOTAS DE 50 =  " + n50);
        System.out.println("NOTAS DE 20 =  " + n20);
        System.out.println("NOTAS DE 10 =  " + n10); 
        System.out.println("NOTAS DE 5 =  " + n5);
        System.out.println("NOTAS DE 2 =  " + n2);
        System.out.println();
        System.out.println("MOEDAS DE 1 =  " + m1);
        System.out.println("MOEDAS DE 0.50 =  " + mCinq);
        System.out.println("MOEDAS DE 0.20 =  " + mVint);
        System.out.println("MOEDAS DE 0.10 =  " + mDez);
        System.out.println("MOEDAS DE 0.05 =  " + mCinco);
        System.out.println("MOEDAS DE 0.01 =  " + mUm);



        sc.close();
    }    
}
