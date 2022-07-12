import java.util.Scanner;

public class Uni3URI1019 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int segundosEntrada;
        int horas;
        int minutos;
        int segundos;

        segundosEntrada = teclado.nextInt();
        horas = segundosEntrada / 3600;
        minutos = (segundosEntrada % 3600) / 60;
        segundos = (segundosEntrada % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
    
}
