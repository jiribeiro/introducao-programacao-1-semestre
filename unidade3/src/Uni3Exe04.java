import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double pesoNota1 = 5;
        double pesoNota2 = 3;
        double pesoNota3 = 2;
        double notasxPeso;
        double somaPesos;
        double mediaPonderada;

        System.out.println("Informe a nota 1:");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2:");
        nota2 = teclado.nextDouble();
        System.out.println("Informe a nota 3:");
        nota3 = teclado.nextDouble();

        notasxPeso = nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3;
        somaPesos = pesoNota1 + pesoNota2 + pesoNota3;
        mediaPonderada = notasxPeso / somaPesos;

        System.out.println("A média ponderada do aluno é: " + mediaPonderada);

        teclado.close();

    }

}