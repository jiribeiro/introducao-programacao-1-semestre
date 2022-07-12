import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe dois números inteiros: ");

        System.out.println("Valor 1: ");
        int valor1 = teclado.nextInt();
        System.out.println("Valor 2 : ");
        int valor2 = teclado.nextInt();

        if ((valor1 > valor2) && (valor1 % valor2 == 0)) {
            System.out.println("São múltiplos");
            
        }   else {
            System.out.println("Não são múltiplos");

        }

        teclado.close();

    }
    
}
