import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1002 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double raio;
        double pi = 3.14159;
        double raio2;
        double area;

        raio = teclado.nextDouble();

        raio2 = raio * raio;
        area = pi * raio2;

        System.out.println("A=" + df_4.format(area));

        teclado.close();

    }
    
}
