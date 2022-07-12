import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lata350;
        double garrafa600;
        double garrafa2l;
        double litros350;
        double litros600;
        double litros2l;
        double totalLitros;

        System.out.println("Quantas latas de 350 ml foram vendidas? ");
        lata350 = teclado.nextDouble();

        System.out.println("Quantas garrafas de 600 ml foram vendidas? ");
        garrafa600 = teclado.nextDouble();

        System.out.println("Quantas garrafas de 2 litros foram vendidas? ");
        garrafa2l = teclado.nextDouble();

        litros350 = 0.350 * lata350;
        litros600 = 0.600 * garrafa600;
        litros2l = 2 * garrafa2l;

        totalLitros = litros350 + litros600 + litros2l;

        System.out.println("O comerciante comprou " + totalLitros + " de refrigerante.");

        teclado.close();

    }

}
