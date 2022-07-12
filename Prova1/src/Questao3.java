import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha um tipo de cor: ");
        System.out.println("V");
        System.out.println("A");
        System.out.println("B");
        char opcaoTipo = teclado.next().charAt(0);
        opcaoTipo = Character.toUpperCase(opcaoTipo);
        
        if (opcaoTipo == 'V') {
            System.out.println("Verde");
            
        }   else if (opcaoTipo == 'A') {
            System.out.println("Azul");
            
        }   else if (opcaoTipo == 'B') {
            System.out.println("Branco");
            
        }   else {
            System.out.println("Tipo incorreto");
        }
            
        teclado.close();

    }
    
}
