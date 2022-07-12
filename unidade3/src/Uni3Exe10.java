import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cateto1;
        double cateto2;
        double cateto1Quadrado;
        double cateto2Quadrado;
        double resultadoCatetos2;
        double valorHipotenusa;

        System.out.println("Informe o valor do cateto 1: ");
        cateto1 = teclado.nextDouble();
        System.out.println("Informe o valor do cateto 2");
        cateto2 = teclado.nextDouble();

        cateto1Quadrado = cateto1 * cateto1;
        cateto2Quadrado = cateto2 * cateto2;
        resultadoCatetos2 = cateto1Quadrado + cateto2Quadrado;
        valorHipotenusa = Math.sqrt(resultadoCatetos2);

        System.out.println("O comprimento da hipotenusa é: " + valorHipotenusa);

        teclado.close();

    }

}
