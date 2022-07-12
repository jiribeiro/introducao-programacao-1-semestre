import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double hrsMes;
        double valorHr;
        double salarioTotal;
        double salarioExtra;

        System.out.println("Entre com as horas trabalhadas no mês: ");
        hrsMes = teclado.nextDouble();
        System.out.println("Entre com o valor pago por hora: ");
        valorHr = teclado.nextDouble();

        salarioTotal = hrsMes * valorHr;

        if (hrsMes > 160) {
            
            salarioExtra = (hrsMes - 160) * (valorHr / 2);
            salarioTotal = salarioTotal + salarioExtra;
            
        }

        System.out.println("O salário total é: " + salarioTotal);

        teclado.close();

    }
    
}
