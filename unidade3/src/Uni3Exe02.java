import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double desconto = 0.12;
        double valorSapato;
        double valorDesconto;
        double valorComDesconto;

        System.out.println("Digite o valor do sapato: ");
        valorSapato = teclado.nextDouble();

        valorDesconto = valorSapato * desconto;
        valorComDesconto = valorSapato - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorComDesconto);

        teclado.close();

    }

}
