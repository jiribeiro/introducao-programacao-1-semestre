import java.util.Scanner;

public class Uni3URI1018 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int X;
        int nota100;
        int nota50;
        int nota20;
        int nota10;
        int nota5;
        int nota2;
        int nota1;
        
        X = teclado.nextInt();
        nota100 = X / 100;
        nota50 = (X % 100) / 50;
        nota20 = ((X % 100) % 50) / 20;
        nota10 = (((X % 100) % 50) % 20) / 10;
        nota5 = ((((X % 100) % 50) % 20) % 10) / 5;
        nota2 = (((((X % 100) % 50) % 20) % 10) % 5) / 2;
        nota1 = ((((((X % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.println(X);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        teclado.close();

    }
    
}
