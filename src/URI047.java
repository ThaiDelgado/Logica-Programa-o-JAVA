import java.util.Locale;
import java.util.Scanner;

public class URI047 {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
//escolha usar o menor valor de tempo para se fazer o calculo, no caso, minutos.
    int horaInicial = sc.nextInt();
    int minInicial = sc.nextInt();
    int horaFinal = sc.nextInt();
    int minFinal = sc.nextInt();
// multiplicar a Hora inicial e final por 60, transforma o valor hora em valor minutos (ex: 2h * 60 = 120'). Para voltar reverter para hora, basta dicidir o valor por 60.
    int instanteInicial = horaInicial * 60 + minInicial; 
    int instanteFinal = horaFinal * 60 + minFinal;

    int duracao;
    if(instanteFinal>instanteInicial){
        duracao = instanteFinal- instanteInicial;
    }else{
        duracao = (24 * 60 - horaInicial) + horaFinal;
    }

    int duracaoHoras = duracao / 60;
    int duracaoMinutos = duracao % 60;

    System.out.println("O JOGO DUROU" + duracaoHoras + "HORAS E" + duracaoMinutos + "MINUTOS");




    sc.close();
    }
}
