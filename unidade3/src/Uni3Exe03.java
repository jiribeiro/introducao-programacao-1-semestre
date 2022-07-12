import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double precoLitro;
        double valorPagamento;
        double litrosAbastecido;

        System.out.println("Informe o preço do litro da gasolina:");
        precoLitro = teclado.nextDouble();

        System.out.println("Informe o valor de pagamento:");
        valorPagamento = teclado.nextDouble();

        litrosAbastecido = valorPagamento / precoLitro;

        System.out.println("O motorista abasteceu " + litrosAbastecido + " litros de gasolina");

        teclado.close();

    };

}
