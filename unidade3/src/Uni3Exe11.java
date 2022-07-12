import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double tempCelsius;
        double div9por5;
        double multDivC;
        double tempFahrenheit;

        System.out.println("Informe a temperatura em Celsius: ");
        tempCelsius = teclado.nextDouble();

        div9por5 = 9.0 / 5.0;
        multDivC = div9por5 * tempCelsius;
        tempFahrenheit = multDivC + 32;

        System.out.println("A temperatura em fahrenheit é: " + tempFahrenheit);

        teclado.close();

    }

}
