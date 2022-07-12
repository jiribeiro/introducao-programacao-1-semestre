import java.util.Scanner;

public class Uni3URI1004 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int valor1;
        int valor2;
        int PROD;

        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);

        teclado.close();

    }
}
