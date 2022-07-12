import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1010 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int codigoPeca1;
        double numeroPecas1;
        double valorUnitario1;
        int codigoPeca2;
        double numeroPecas2;
        double valorUnitario2;
        double totalPeca1;
        double totalPeca2;
        double valorPagar;

        codigoPeca1 = teclado.nextInt();
        numeroPecas1 = teclado.nextDouble();
        valorUnitario1 = teclado.nextDouble();
        codigoPeca2 = teclado.nextInt();
        numeroPecas2 = teclado.nextDouble();
        valorUnitario2 = teclado.nextDouble();
        
        totalPeca1 = numeroPecas1 * valorUnitario1;
        totalPeca2 = numeroPecas2 * valorUnitario2;
        valorPagar = totalPeca1 + totalPeca2;

        System.out.println("VALOR A PAGAR: R$ " + df_2.format(valorPagar));

        teclado.close();

    }

}
