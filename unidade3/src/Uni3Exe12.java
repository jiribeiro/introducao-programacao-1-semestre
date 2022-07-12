import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double hrsTrabalhadas;
        double numeroDep;
        double valorHora = 10.00;
        double valorDep = 60.00;
        double descINSS = 0.085;
        double descIR = 0.05;
        double totalHrsRecebidas;
        double totalDep;
        double salarioBruto;
        double totalDescINSS;
        double totalDescIR;
        double salarioLiquido;

        System.out.println("Informe o nome do funcionário: ");
        nome = teclado.next();
        System.out.println("Informe as horas trabalhadas:");
        hrsTrabalhadas = teclado.nextDouble();
        System.out.println("Informe o número de dependentes:");
        numeroDep = teclado.nextDouble();

        totalHrsRecebidas = hrsTrabalhadas * valorHora;
        totalDep = numeroDep * valorDep;
        salarioBruto = totalHrsRecebidas + totalDep;
        totalDescINSS = salarioBruto * descINSS;
        totalDescIR = salarioBruto * descIR;
        salarioLiquido = salarioBruto - totalDescINSS - totalDescIR;

        System.out.println("Nome do funcionário: " + nome + ", salário bruto: R$ " + salarioBruto
                + ", salário líquido: R$ " + salarioLiquido);

        teclado.close();

    }

}
