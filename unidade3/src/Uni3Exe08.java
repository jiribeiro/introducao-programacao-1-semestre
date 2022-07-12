import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double dolares;
        double precoDolar = 5.02;
        double valorDevolver;

        System.out.println("Quantos dólares a pessoa tem para trocar? ");
        dolares = teclado.nextDouble();

        valorDevolver = dolares * precoDolar;

        System.out.println("O valor que o cliente receberá é R$ " + valorDevolver);

        teclado.close();

    }

}
