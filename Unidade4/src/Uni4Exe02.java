import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int valor;

        valor = teclado.nextInt();

        if (valor % 2 == 0) {

            System.out.println("Número é par");
            
        }   else {

            System.out.println("Número é impar");

        }

        teclado.close();
    }
}
