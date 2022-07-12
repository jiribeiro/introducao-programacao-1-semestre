import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva uma letra: ");
        char letra = teclado.next().charAt(0);

        if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
            System.out.println("É vogal");

        }   else {
            System.out.println("NÃO é vogal");

        }

        teclado.close();
        
    }
    
}
