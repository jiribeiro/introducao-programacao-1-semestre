import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a hora e minuto de chegada: ");
        System.out.println("Hora: ");
        int horaChegada = teclado.nextInt();
        System.out.println("Minutos: ");
        int minutoChegada = teclado.nextInt();
        System.out.println("Informe a hora e minuto de partida: ");
        System.out.println("Hora: ");
        int horaPartida = teclado.nextInt();
        System.out.println("Minutos: ");
        int minutoPartida = teclado.nextInt();


        if (horaChegada > horaPartida) {
            horaPartida = horaPartida + 24;

        }
        if (minutoChegada > minutoPartida) {
            minutoPartida = minutoPartida + 60;
            horaPartida = horaPartida + 1;
            
        }

        int horaFinal = horaPartida - horaChegada;
        int minutoFinal = minutoPartida - minutoChegada;

        if (minutoFinal >= 30 && minutoFinal < 60) {
            horaFinal = horaFinal + 1;
            
        }

        if (horaFinal < 24) {

            double precoCobrado = 0;
            System.out.println(horaFinal);
            switch (horaFinal) {
                case 0: // 5,00
                case 1: // 5,00
                    precoCobrado = 5;
                    break;
                case 2: // 5,00+5,00 = 10,00
                    precoCobrado = 10;
                    break;
                case 3: // 5,00+5,00+7,50 = 17,5
                    precoCobrado = 17.5;
                    break;
                case 4: // 5,00+5,00+7,50+7,50 = 25,00
                    precoCobrado = 25;                
                    break;
                default: // 25,00 + (10 * (5 - 4))
                    precoCobrado = 25 + (10 * (horaFinal - 4));
                    break;
                }

            System.out.println("Preço cobrado: " + precoCobrado);

            }   else {
                System.out.println("Hora/Minuto ERRADO");

            }

        
            
        teclado.close();

    }
    
}
