import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double massaInicial, massaFinal;
        int tempoTotal = 0, tempoHora, tempoMinutos, tempoSegundos;
        System.out.println("Informe a massa inicial, em KG, do material radioativo: ");
        massaInicial = teclado.nextDouble();
        massaFinal = massaInicial;

        while (massaFinal >= 0.5) {
           massaFinal = massaFinal / 2;
           tempoTotal = tempoTotal + 50;
        }

        tempoHora = (tempoTotal / 3600);
        tempoMinutos = (tempoTotal % 3600) / 60;
        tempoSegundos = (tempoTotal % 3600) % 60;

        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massaFinal);
        System.out.println("Tempo necessário para que a massa se torne menor que 0,5 gramas:");
        System.out.println(tempoHora + " horas, " + tempoMinutos + " minutos e " + tempoSegundos + " segundos.");

        teclado.close();
        
    }
    
}
