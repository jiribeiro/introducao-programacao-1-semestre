import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double comprimento;
        double altura;
        double valorAzulejo = 12.50;
        double areaParede;
        double valorMetro2;
        double valorFinal;

        System.out.println("Informe o comprimento da parede: ");
        comprimento = teclado.nextDouble();
        System.out.println("Informe a altura da parede: ");
        altura = teclado.nextDouble();

        areaParede = comprimento * altura;
        valorMetro2 = 9 * valorAzulejo;
        valorFinal = areaParede * valorMetro2;

        System.out.println("O gasto com a compra de azulejos é de R$ " + valorFinal);

        teclado.close();

    }

}
