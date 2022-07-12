import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        
        int tamVet;
        do {
            System.out.println("Tamanho do vetor: ");
            tamVet = teclado.nextInt();
        } while ((tamVet < 1) || (tamVet > 50));
        double vet[] = new double[tamVet];


        

        teclado.close();
    }



    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
