import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do pagamento: ");
        double valorPagamento = teclado.nextDouble();
        System.out.println("Informe o dia do pagamento: ");
        double diaPagamento = teclado.nextDouble();
        System.out.println("Informe a data de vencimento: ");
        double dataVencimento = teclado.nextDouble();

        if (diaPagamento <= dataVencimento) {
            double valorFinal = valorPagamento - (valorPagamento * 0.1);
            System.out.println("Pagamento em dia, o valor a ser pago é R$ " + valorFinal);
            
        }   else {
            if (diaPagamento <= dataVencimento + 5) {
                System.out.println("Pagamento em atraso, sem desconto, valor a ser pago é R$ " + valorPagamento);
                
            }   else {
                double valorFinal = valorPagamento + ((valorPagamento * 0.02) * (diaPagamento - dataVencimento));
                System.out.println("Pagamento em atraso, multa de 2% por dia de atraso, valor a ser pago é R$ " + valorFinal);

            }

        }

        teclado.close();

    }
    
}
