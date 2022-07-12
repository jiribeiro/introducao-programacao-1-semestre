import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double diametro;
        double altura;
        double pi = 3.14159265358979323846;
        double raio;
        double raio2;
        double volume;

        System.out.println("Informe o diâmetro da lata: ");
        diametro = teclado.nextDouble();

        System.out.println("Informe a altura da lata: ");
        altura = teclado.nextDouble();

        raio = diametro / 2;
        raio2 = raio * raio;
        volume = pi * raio2 * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

        teclado.close();

    }

}
