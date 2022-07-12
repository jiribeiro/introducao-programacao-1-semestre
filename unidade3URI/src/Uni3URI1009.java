import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1009 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        String nome;
        double salarioFixo;
        double totalVendas;
        double comissao = 0.15;
        double vendasMaisComissao;
        double totalReceber;

        nome = teclado.next();
        salarioFixo = teclado.nextDouble();
        totalVendas = teclado.nextDouble();

        vendasMaisComissao = totalVendas * comissao;
        totalReceber = vendasMaisComissao + salarioFixo;

        System.out.println("TOTAL = R$ " + df_2.format(totalReceber));

        teclado.close();

    }
    
}
