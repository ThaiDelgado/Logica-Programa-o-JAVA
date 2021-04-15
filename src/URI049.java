import java.util.Locale;
import java.util.Scanner;

public class URI049 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String palavra1 = sc.next(); //recebe apenas uma palavra
        String palavra2 = sc.next();
        String palavra3 = sc.next();
        
        if(palavra1.equals("vertebrado")){
            if(palavra2.equals("ave")){
                if(palavra3.equals("carnivoro")){
                    System.out.println("águia");
                }else {
                    System.out.println("pomba");
                }
            }else {
                if(palavra3.equals("onivoro")){
                System.out.println("homem");
                }else{
                System.out.println("vaca");
                }
            }
        }else{
            if(palavra1.equals("invertebrado")){
                if(palavra2.equals("inseto")){
                    if(palavra3.equals("hematofago")){
                        System.out.println("pulga");
                    }else{
                        System.out.println("lagarta");
                    }
                }else{
                    if(palavra2.equals("anelideo")){
                        if(palavra3.equals("hematofago")){
                            System.out.println("Sanguessuga");
                        }else{
                            System.out.println("minhoca");
                        }
                    }
                }

            
            }
        }

        sc.close();
    }
}