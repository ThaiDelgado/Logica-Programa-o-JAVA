// Fazer um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados. (codigo feito utilizando a estrutura de repetição 'for').


import java.util.Scanner;
public class URI1060{
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int positivo = 0;

        for (int i=0; i < 6; i++) {
        	double num = sc.nextDouble();
        	if (num > 0) positivo++;
        }
        System.out.println(positivo + " valores positivos");

        sc.close();
    }
	
}

    

