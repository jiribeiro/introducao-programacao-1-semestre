import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        int repeticoes = teclado.nextInt();
        double numeroReal = 0, numeroMaior = 0, numeroMenor = 0;

        if (repeticoes == 0 || repeticoes == 1) {
            System.out.println("A quantidade de números deve ser maior que 2!!!");

        } else {

            for (int i = 1; i <= repeticoes; i++) {
                System.out.println("Entre com os números: ");
                numeroReal = teclado.nextDouble();

                if (i == 1) {
                    numeroMaior = numeroReal;
                    numeroMenor = numeroReal;
                }
                if (numeroReal > numeroMaior) {
                    numeroMaior = numeroReal;
                }

                if (numeroReal < numeroMenor) {
                    numeroMenor = numeroReal;
                }

            }

            System.out.println("O número maior é: " + numeroMaior);
            System.out.println("O número menor é: " + numeroMenor);

        }

        teclado.close();

    }

}
