import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1015 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double x1;
        double y1;
        double x2;
        double y2;
        double subtracaoX;
        double subtracaoY;
        double xQuadrado;
        double yQuadrado;
        double soma;
        double raiz;

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        subtracaoX = x2 - x1;
        subtracaoY = y2 - y1;
        xQuadrado = Math.pow(subtracaoX, 2);
        yQuadrado = Math.pow(subtracaoY, 2);
        soma = xQuadrado + yQuadrado;
        raiz = Math.sqrt(soma);

        System.out.println(df_4.format(raiz));

        teclado.close();
    }
    
}
