import java.util.Scanner;

public class Uni3URI1016 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int distancia;
        int resultado;

        distancia = teclado.nextInt();
        resultado = distancia * 2;

        System.out.println(resultado + " minutos");

        teclado.close();
    }
    
}
