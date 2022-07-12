import java.util.Scanner;

public class Uni6Exe07 {

    private Uni6Exe07() {
        Scanner teclado = new Scanner(System.in);
        int vetTamanho;

        do {
            System.out.println("Valor [1...20]: ");
            vetTamanho = teclado.nextInt();
        } while (vetTamanho < 1 || vetTamanho > 20);
        int vet[] = new int[vetTamanho];

        vetorLer(teclado, vet);
        vetorOrdenar(vet);
        vetorInformar(vet);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, int vet[]) {
        int vetPos = 0;
        int valor;
        boolean vetInseri;
        for (int i = 0; i < vet.length; i++) {
            vetInseri = true;
            System.out.println("Vet[" + i + "]: ");
            valor = teclado.nextInt();
            for (int j = 0; j < vetPos; j++) {
                if (valor == vet[j]) {
                    System.out.println("Existe valor no vetor");
                    vetInseri = false;
                    i--;
                    break;
                }
            }
            if (vetInseri) {
                vet[i] = valor;
                vetPos++;
            }
        }
    }

    private void vetorOrdenar(int vet[]) {
        int bolha;
        int i = 0;
        do {
            if (vet[i] > vet[i + 1]) {
                bolha = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = bolha;
                i = 0;
            }   else {
                i = i + 1;
            }
        } while (i < vet.length - 1);
    }

    private void vetorInformar(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Vet[" + i + "]: " + vet[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
}
