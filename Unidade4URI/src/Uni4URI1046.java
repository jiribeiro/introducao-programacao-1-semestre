import java.util.Scanner;

public class Uni4URI1046 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int horaInicio = teclado.nextInt();
        int horaFim = teclado.nextInt();

        if (horaInicio > horaFim) {
            horaFim = horaFim + 24;
            
        }

        int tempoFinal = horaFim - horaInicio;

        if (tempoFinal == 0) {
            tempoFinal = tempoFinal + 24;
            
        }

        System.out.println("O JOGO DUROU " + tempoFinal + " HORA(S)");

        teclado.close();

    }
    
}
