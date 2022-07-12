import java.util.Scanner;
import java.text.DecimalFormat;

public class Questão2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Escolha a opção de pagamento: ");
        System.out.println("1 - Débito");
        System.out.println("2 - PIX");
        System.out.println("3 - Crediário");
        int formaPagamento = teclado.nextInt();
        System.out.println("Informe o valor da compra: ");
        double valorCompra = teclado.nextDouble();

        switch (formaPagamento) {
            case 1:
                valorCompra = valorCompra + (valorCompra * 0.03);
                System.out.println("O valor a ser pago pelo cliente é R$ " + df_2.format(valorCompra));
                break;
            case 2:
                valorCompra = valorCompra - (valorCompra * 0.05);
                System.out.println("O valor a ser pago pelo cliente é R$ " + df_2.format(valorCompra));
                break;
            case 3:
                System.out.println("Em quantas vezes o cliente deseja pagar?");
                double qtdParcelas = teclado.nextDouble();
                System.out.println("Informe a data de vencimento: ");
                double dataVencimento = teclado.nextDouble();
                System.out.println("Informe o dia que foi paga a fatura: ");
                double dataPagamento = teclado.nextDouble();
                double valorParcela = valorCompra / qtdParcelas;
                if (dataPagamento <= dataVencimento) {
                    valorParcela = valorParcela - (valorParcela * 0.15);
                    System.out.println("O valor a ser pago pelo cliente é R$ " + df_2.format(valorParcela));
                }   else if (dataPagamento <= dataVencimento + 10) {
                    System.out.println("O valor a ser pago pelo cliente é R$ " + df_2.format(valorParcela));
                }   else {
                    valorParcela = valorParcela + ((valorParcela * 0.02) * (dataPagamento - dataVencimento));
                    System.out.println("O valor a ser pago pelo cliente é R$ " + df_2.format(valorParcela));
                }
                break;
            default:
                System.out.println("Opção Inexistente!");
                break;
        }

        teclado.close();

    }
    
}
