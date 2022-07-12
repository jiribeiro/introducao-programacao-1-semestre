import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1005 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double A;
        double B;
        double pesoA = 3.5;
        double pesoB = 7.5;
        double somaPesos;
        double notasXpesos;
        double media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        notasXpesos = A * pesoA + B * pesoB;
        somaPesos = pesoA + pesoB;
        media = notasXpesos / somaPesos;

        System.out.println("MEDIA = " + df_5.format(media));

        teclado.close();

    }
    
}
