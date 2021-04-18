// Fazer um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados. (codigo feito utilizando ArrayList').

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class URI060 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int positivo = 0;

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float num4 = sc.nextFloat();
        float num5 = sc.nextFloat();
        float num6 = sc.nextFloat();

        List<Float> numeros = new ArrayList<>();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.add(num4);
        numeros.add(num5);
        numeros.add(num6);

        for(int i = 0; i < 6; i++){
            if(numeros.get(i) > 0) {
                positivo++;
            }
        }

        System.out.println("\n\n" + positivo + " Valores positivos");
        
        sc.close();
    }
    
}

