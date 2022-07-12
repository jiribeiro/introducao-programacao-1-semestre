/*

Entrada
ler(largura)
ler(comprimento)

Processo


Saída
largura x comprimento

*/

import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double largura;
        double comprimento;

        System.out.println("Entre com a largura:");
        largura = teclado.nextDouble();
        System.out.println("Entre com o comprimento:");
        comprimento = teclado.nextDouble();

        double area = largura * comprimento;

        System.out.println("A área do terreno é: " + area);

        teclado.close();

    }
}
