import java.util.Scanner;

public class JonathanIlcheminRibeiro_2 {
    
    private JonathanIlcheminRibeiro_2() {
        Scanner teclado = new Scanner(System.in);

        int tamVetores;
        System.out.print("Tamanho do vetor: ");
        tamVetores = teclado.nextInt();
        int vetA[] = new int[tamVetores];
        int vetB[] = new int[tamVetores];
        int vetC[] = new int[tamVetores];

        vetorLer(teclado, tamVetores, vetA, vetB);
        vetorSomar(tamVetores, vetA, vetB, vetC);
        vetorOrdenar(vetC);
        vetorEscrever(vetC);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, int tamVetores, int vetA[], int vetB[]) {
        System.out.println("__ Lendo o VetA __");
        for (int i = 0; i < tamVetores; i++) {
            System.out.print("VetA[" + i + "]: ");
            vetA[i] = teclado.nextInt();
        }
        System.out.println("__ Lendo o VetB __");
        for (int i = 0; i < tamVetores; i++) {
            System.out.print("VetB[" + i + "]: ");
            vetB[i] = teclado.nextInt();
        }
    }

    private void vetorSomar(int tamVetores, int vetA[], int vetB[], int vetC[]) {
        for (int i = 0; i < tamVetores; i++) {
            vetC[i] = vetA[i] + vetB[tamVetores - 1 - i];
        }
    }

    private void vetorOrdenar(int vetC[]) {
        int bolha = 0;
        int i = 0;
        do {
            if (vetC[i] > vetC[i + 1]) {
                bolha = vetC[i];
                vetC[i] = vetC[i + 1];
                vetC[i + 1] = bolha;
                i = 0;
            }   else {
                i = i + 1;
            }
        } while (i < vetC.length - 1);
        System.out.println("_ valores ordenados.");
    }

    private void vetorEscrever(int vetC[]) {
        System.out.println("__ Resultado __");
        for (int i = 0; i < vetC.length; i++) {
            System.out.println("Vet[" + i + "]: " + vetC[i]);
        }
    }

    public static void main(String[] args) {
        new JonathanIlcheminRibeiro_2();
    }
}
