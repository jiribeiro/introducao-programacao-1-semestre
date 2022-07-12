import java.util.Scanner;

public class Uni6Exe02 {
    private Uni6Exe02() {
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double[12];
        double soma = 0, mediaFinal;
        vetorLer(teclado, vetor);
        mediaFinal = vetorMedia(vetor, soma);
        vetorInformar(vetor, mediaFinal);
        teclado.close();
    }
    
    private void vetorLer(Scanner teclado, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("valor [" + i + "]: ");
            vetor[i] = teclado.nextDouble();
        }
    }
    
    private double vetorMedia(double vetor[], double soma) {
        double mediaFinal = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        mediaFinal = soma / vetor.length;
        return mediaFinal;
    }

    private void vetorInformar(double vetor[], double mediaFinal) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > mediaFinal) {
                System.out.println("vet [" + i + "]: " + vetor[i] + " é maior que o número da média dos números.");
            }
        }
    }

    public static void main(String[] args) {
    new Uni6Exe02();
    }

}
