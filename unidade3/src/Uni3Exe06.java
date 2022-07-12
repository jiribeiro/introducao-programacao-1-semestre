import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorQuilo = 25;
        double pesoPrato = 0.750;
        double pratoMontado;
        double valorPagar;
        double pesoFinal;

        System.out.println("Peso do prato montado pelo cliente: ");
        pratoMontado = teclado.nextDouble();

        pesoFinal = pratoMontado - pesoPrato;
        valorPagar = pesoFinal * valorQuilo;

        System.out.println("O valor a ser pago é de R$ " + valorPagar);

        teclado.close();

    }

}
