import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int valorTroco;
        int nota100;
        int sobraNota100;
        int nota10;
        int nota1;
        int somaNotas;

        System.out.println("Informe o valor do troco: ");
        valorTroco = teclado.nextInt();

        nota100 = valorTroco / 100;
        sobraNota100 = valorTroco % 100;
        nota10 = sobraNota100 / 10;
        nota1 = sobraNota100 % 10;
        somaNotas = nota100 + nota10 + nota1;

        System.out.println("O número mínimo de notas que o caixa deve dar de troco é: " + somaNotas);
        System.out.println("Sendo elas," + nota100 + " nota(s) de 100, " + nota10 + " nota(s) de 10, " + nota1 + " nota(s) de 1.");

        teclado.close();

    }
    
}
