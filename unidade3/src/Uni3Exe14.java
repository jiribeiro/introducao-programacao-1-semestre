import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double distancia;
        double tempoGasto;
        double velMedia;
        double kmPorLitro = 12;
        double combustivelGasto;

        System.out.println("Informe a distancia percorrida em km's: ");
        distancia = teclado.nextDouble();
        System.out.println("Informe o tempo gasto em horas: ");
        tempoGasto = teclado.nextDouble();

        velMedia = distancia / tempoGasto;
        combustivelGasto = distancia / kmPorLitro;

        System.out.println("A velocidade média foi de " + velMedia + " km/h, e foi gasto " + combustivelGasto
                + " litros de gasolina.");

        teclado.close();

    }

}
