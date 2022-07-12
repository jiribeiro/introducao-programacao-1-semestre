import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1012 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        double A;
        double B;
        double C;
        double areaTriangulo;
        double areaCirculo;
        double pi = 3.14159;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        areaTriangulo = A * C / 2;
        areaCirculo = C * C * pi;
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.println("TRIANGULO: " + df_3.format(areaTriangulo));
        System.out.println("CIRCULO: " + df_3.format(areaCirculo));
        System.out.println("TRAPEZIO: " + df_3.format(areaTrapezio));
        System.out.println("QUADRADO: " + df_3.format(areaQuadrado));
        System.out.println("RETANGULO: " + df_3.format(areaRetangulo));

        teclado.close();
    }
    
}
