import java.util.Scanner;

public class Uni6Exe03 {
    private Uni6Exe03(){
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double[12];
        vetorLer(teclado, vetor);
        vetorAjustes(vetor);
        vetorEscrever(vetor);
        teclado.close();
    }
        
    private void vetorLer(Scanner teclado, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("valor [" + i + "]: ");
            vetor[i] = teclado.nextDouble();
        }
    }

    private void vetorAjustes(double vetor[]) {
       for (int i = 0; i < vetor.length; i++) {
           if (vetor[i] % 2 == 0) {
               vetor[i] = (vetor[i] * 0.02) + vetor[i];
           }    else {
                vetor[i] = (vetor[i] * 0.05) + vetor[i];
           }
        }
    }

    private void vetorEscrever(double vetor[]){
        for (int i = 0 ; i < vetor.length; i++) {
            System.out.println("vet[" + i + "]: " + vetor[i]);
        }
    }

    public static void main(String[] args){
        new Uni6Exe03();
    }
    
}
