import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double anelChip = 4.00;
        double anelAlimento = 3.50;
        double gastoPorFrango;
        double qtdeFrangos;
        double custoTotal;

        gastoPorFrango = 2 * anelAlimento + anelChip;

        System.out.println("Informe a quantidade de frangos: ");
        qtdeFrangos = teclado.nextDouble();

        custoTotal = qtdeFrangos * gastoPorFrango;

        System.out.println("Se a granja tiver " + qtdeFrangos + " frangos, isso irá custar R$ " + custoTotal
                + " para marcar todos os frangos.");

        teclado.close();

    }

}
