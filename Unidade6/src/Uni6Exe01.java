import java.util.Scanner;

public class Uni6Exe01 {

    private Uni6Exe01() {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
        vetorLer(teclado,vet);
        vetorEscrever(vet);
        teclado.close();
    }

    private void vetorLer(Scanner teclado, int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("valor [" + i + "]: ");
            vet[i] = teclado.nextInt();
        }
    }

    private void vetorEscrever(int vet[]) {
        for (int i = vet.length-1; i >= 0; i--) {
            System.out.println("vet[" + i + "]: " + vet[i]);
        }
    }

    public static void main(String[] args){
        new Uni6Exe01();
    }
    
}
