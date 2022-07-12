import java.util.Scanner;

public class Uni6Exe08 {

    private Uni6Exe08() {
        Scanner teclado = new Scanner(System.in);

        int tamVet;
        do {
            System.out.println("Tamanho do vetor: ");
            tamVet = teclado.nextInt();
        } while ((tamVet < 1) || (tamVet > 20));
        double vet[] = new double[tamVet];
        
        vetLer(teclado, vet);
        vetEscrever(vet);
        vetorAchar(vet);

        teclado.close();
    }

    private void vetLer(Scanner teclado, double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet[" + i + "]: ");
            vet[i] = teclado.nextDouble();
        }
    }

    private void vetEscrever(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    private void vetorAchar(double vet[]) {
        boolean achou[] = new boolean[vet.length];
        for (int i = 0; i < achou.length; i++) {
            achou[i] = false;
        }
        System.out.println("VALOR | FREQUÊNCIA");
        int contador;
        for (int i = 0; i < vet.length; i++) {
            contador = 0;
            for (int j = 0; j < vet.length; j++) {
                if (!achou[j]) {
                    if (vet[i] == vet[j]) {
                        achou[j] = true;
                        contador++;
                    }
                }
            }
            if (contador > 0) {
                System.out.println(vet[i] + " | " + contador);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08();
    }

}