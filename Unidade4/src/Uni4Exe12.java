import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado 1: ");
        int lado1 = teclado.nextInt();
        System.out.println("Entre com o comprimento do lado 2: ");
        int lado2 = teclado.nextInt();
        System.out.println("Entre com o comprimento do lado 3: ");
        int lado3 = teclado.nextInt();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilatero");
                
            }   else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("É isósceles");
                    
                }   else {
                    System.out.println("É escaleno");

                }

            }
            
        }   else {
            System.out.println("Não formam um triângulo");

        }

        teclado.close();

    }
    
}
