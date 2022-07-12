import java.util.Scanner;

public class Uni6Exe04 {

    private Uni6Exe04() {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];
        vetorLer(teclado, vetor1, vetor2);
        vetorSoma(vetor1, vetor2, vetor3);
        vetorEscrever(vetor1, vetor2, vetor3);
        teclado.close();
    }

    private void vetorLer(Scanner teclado, int vetor1[], int vetor2[]) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Valor vetor 1 [" + i + "]: ");
            vetor1[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Valor vetor 2 [" + i + "]: ");
            vetor2[i] = teclado.nextInt();
        }
    }

    private void vetorSoma(int vetor1[], int vetor2[], int vetor3[]) {
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    private void vetorEscrever(int vetor1[], int vetor2[], int vetor3[]) {
        for (int i = 0 ; i < vetor1.length; i++) {
            System.out.println("Vetor 1 [" + i + "]: " + vetor1[i]);
        }
        for (int i = 0 ; i < vetor2.length; i++) {
            System.out.println("Vetor 2 [" + i + "]: " + vetor2[i]);
        }
        for (int i = 0 ; i < vetor3.length; i++) {
            System.out.println("Vetor 3 [" + i + "]: " + vetor3[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
    
}
