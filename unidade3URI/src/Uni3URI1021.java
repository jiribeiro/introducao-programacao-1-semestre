import java.util.Scanner;

public class Uni3URI1021 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double valorInformado;
        valorInformado = teclado.nextDouble();

        double notade100 = valorInformado / 100;
        int nota100 = (int) notade100;
        double notade50 = (valorInformado % 100) / 50;
        int nota50 = (int) notade50;
        double notade20 = ((valorInformado % 100) % 50) / 20;
        int nota20 = (int) notade20;
        double notade10 = (((valorInformado % 100) % 50) % 20) / 10;
        int nota10 = (int) notade10;
        double notade5 = ((((valorInformado % 100) % 50) % 20) % 10) / 5;
        int nota5 = (int) notade5;
        double notade2 = (((((valorInformado % 100) % 50) % 20) % 10) % 5) / 2;
        int nota2 = (int) notade2;
        double valorInformadox100 = ((((((valorInformado % 100) % 50) % 20) % 10) % 5) % 2) * 100;
        double moedade1r = valorInformadox100 / 100;
        int moeda1r = (int) moedade1r;
        double moedade50 = (valorInformadox100 % 100) / 50;
        int moeda50 = (int) moedade50;
        double moedade25 = ((valorInformadox100 % 100) % 50) / 25;
        int moeda25 = (int) moedade25;
        double moedade10 = (((valorInformadox100 % 100) % 50) % 25) / 10;
        int moeda10 = (int) moedade10;
        double moedade5 = ((((valorInformadox100 % 100) % 50) % 25 )% 10) / 5;
        int moeda5 = (int) moedade5;
        double moedade1c = (((((valorInformadox100 % 100) % 50) % 25) % 10) % 5) / 1;
        int moeda1c = (int) moedade1c;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1r + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1c + " moeda(s) de R$ 0.01");

        teclado.close();

    }
}
