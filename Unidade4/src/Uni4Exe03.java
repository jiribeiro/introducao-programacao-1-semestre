import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Insira dois números inteiros e diferentes: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println("O número de maior valor é " + n1);
            
        }   else {
            System.out.println("O número de maior valor é " + n2);
            
        }

        teclado.close();
    }
    
}
