import java.util.Scanner;

public class URI046 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int hrInc = sc.nextInt();
        int hrFim = sc.nextInt();

        int duracao;
		if (hrInc < hrFim) {
			duracao = hrInc - hrFim;
		}
		else {
			duracao = 24 - hrInc + hrFim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		

        sc.close();
        }

    }
    

