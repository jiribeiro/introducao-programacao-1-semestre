import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int centena;
        int sobraCentena;
        int dezena;
        int unidade;

        System.out.println("Escreva um número inteiro com até 3 digitos: ");
        numero = teclado.nextInt();

        centena = numero / 100;
        sobraCentena = numero % 100;
        dezena = sobraCentena / 10;
        unidade = sobraCentena % 10;
        
        System.out.println( centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s) ");
    
        teclado.close();

    }
}
