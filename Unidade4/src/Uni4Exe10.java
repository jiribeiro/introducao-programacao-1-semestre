import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade do Marquinhos: ");
        int idadeMarquinhos = teclado.nextInt();
        System.out.println("Informe a idade do Zezinho");
        int idadeZezinho = teclado.nextInt();
        System.out.println("Informe a idade da Luluzinha");
        int idadeLuluzinha = teclado.nextInt();

        if ((idadeMarquinhos < idadeZezinho) && (idadeMarquinhos < idadeLuluzinha)) {
            System.out.println("O caçula é o Marquinhos");
            
        }   else {
            if (idadeZezinho < idadeLuluzinha) {
                System.out.println("O caçula é o Zezinho");
                
            }   else {
                System.out.println("A caçula é a Luluzinha");
            }
        }

        teclado.close();

    }
    
}
