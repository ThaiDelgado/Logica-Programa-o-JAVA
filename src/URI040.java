import java.util.Scanner;
import java.util.Locale;

public class URI040 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();

        float media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / (2 + 3 + 4 + 1);

        if(media >= 7.0){
            System.out.printf("MEDIA = %.1f%nAluno aprovado.%n", media);
        } else{
            if(media <= 5.0){
                System.out.printf("MEDIA = %.1f%nAluno reprovado.%n", media);  
            } else{
                if(media >= 5.1 && media <= 6.9){
                    System.out.printf("MEDIA = %.1f%nAluno em exame.%n", media);  
                    System.out.printf("Insira a nota do exame: ");
                    float notaExame = sc.nextFloat();
                    float media2 = (media + notaExame) / 2;
                        if( media2 >= 5.0){
                            System.out.printf("MEDIA = %.1f%nAluno aprovado.%n", media2); 
                        } else {
                            System.out.println("Aluno reprovado.");
                        }
                    
                }
            }
        }



        sc.close();
    }
    
}
