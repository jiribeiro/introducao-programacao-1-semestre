import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a renda anual: ");
        double rendaAnual = teclado.nextDouble();
        System.out.println("Informe o número de dependentes: ");
        double dependentes = teclado.nextDouble();

        if (dependentes > 0) {
            double descontoPorCento = dependentes * 0.02;
            double descontoTotal = rendaAnual * descontoPorCento;
            rendaAnual = rendaAnual - descontoTotal;
            
        }

        double rendaLiquidaMensal = rendaAnual / 12;

        if (rendaLiquidaMensal >= 2000) {
            if (rendaLiquidaMensal >= 2000 && rendaLiquidaMensal < 5000) {
                double imposto = rendaLiquidaMensal * 0.05;
                System.out.println("Imposto de renda a ser pago é R$ " + imposto);
                
            }   else {
                if (rendaLiquidaMensal >= 5000 && rendaLiquidaMensal < 10000) {
                    double imposto = rendaLiquidaMensal * 0.1;
                    System.out.println("Imposto de renda a ser pago é R$ " + imposto);

                }   else {
                    double imposto = rendaLiquidaMensal * 0.15;
                    System.out.println("Imposto de renda a ser pago é R$ " + imposto);

                }
            }
            
        }   else {
            System.out.println("Não paga imposto!");

        }

        teclado.close();

    }
    
}
