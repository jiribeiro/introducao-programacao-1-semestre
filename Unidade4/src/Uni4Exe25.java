import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença de dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois numeros (o denominador não pode ser zero).");
        int opcaoEscolhida = teclado.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("Digite dois números: ");
                System.out.println("Valor 1: ");
                double valor1 = teclado.nextDouble();
                System.out.println("Valor 2: ");
                double valor2 = teclado.nextDouble();
                double resultado = valor1 + valor2;
                System.out.println("Resultado da soma de dois números: " + resultado);
                break;
            case 2:
                System.out.println("Digite dois números: ");
                System.out.println("Valor 1: ");
                double valor3 = teclado.nextDouble();
                System.out.println("Valor 2: ");
                double valor4 = teclado.nextDouble();
                double resultado2 = valor3 - valor4;
                System.out.println("Resultado da diferença de dois números: " + resultado2);
                break;
            case 3:
                System.out.println("Digite dois números: ");
                System.out.println("Valor 1: ");
                double valor5 = teclado.nextDouble();
                System.out.println("Valor 2: ");
                double valor6 = teclado.nextDouble();
                double resultado3 = valor5 * valor6;
                System.out.println("Resultado do produto de dois números: " + resultado3);
                break;
            case 4:
                System.out.println("Digite dois números: ");
                System.out.println("Valor 1: ");
                double valor7 = teclado.nextDouble();
                System.out.println("Valor 2: ");
                double valor8 = teclado.nextDouble();
                double resultado4 = valor7 / valor8;
                System.out.println("Resultado do produto de dois números: " + resultado4);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        teclado.close();

    }
    
}
