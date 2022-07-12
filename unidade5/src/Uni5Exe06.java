import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double altura;
        double somaAltura = 0;
        double mediaAltura = 0;

        for (int i = 1; i <= 20 ; i++) {
            altura = teclado.nextDouble();
            somaAltura = somaAltura + altura;
            
        }

        mediaAltura = somaAltura / 20;

        System.out.println(mediaAltura);

        teclado.close();

    }
    
}
