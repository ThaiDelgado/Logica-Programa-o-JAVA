//Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar
//um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
//programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
// lucro< 10%
// 10% ≤ lucro ≤ 20%
// lucro> 20%
// Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.

import java.util.Scanner; 
import java.util.Locale;

public class Vetor09{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        String[] nome = new String[N];
        double[] compra = new double[N];
        double[] venda = new double[N];

        for(int i = 0; i < N; i++){
            nome[i] = sc.next();
            compra[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();
        }

        int contAbaixo10 = 0;
        int contEntre10e20 = 0;
        int contAcima20 = 0;
        for(int i = 0; i < N; i++){
            double lucro = venda[i] - compra[i];
            if(lucro < compra[i] * 0.10){
                contAbaixo10++;
            }else if(lucro <= compra[i] * 0.20){
                contEntre10e20++;
            }else{
                contAcima20++;
            }
        }
        System.out.println("Lucro abaixo de 10%: " + contAbaixo10);
        System.out.println("Lucro entre 10% e 20%: " + contEntre10e20);
        System.out.println("Lucro acima de 20%: " + contAcima20);

        double somaCompra = 0;
        double somaVenda = 0;
        for(int i = 0; i < N; i++){
            somaCompra = somaCompra + compra[i];
            somaVenda = somaVenda + venda[i];
        }
        System.out.printf("Valor total da compra: %.2f%n", somaCompra);
        System.out.printf("Valor tota da venda: %.2f%n", somaVenda);

        double totalLucro = somaVenda - somaCompra;
        System.out.printf("Total do lucro: %.2f%n", totalLucro);

        sc.close();
    }
}
