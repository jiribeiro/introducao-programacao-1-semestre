import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um caractere: ");
        char caractere = teclado.next().charAt(0);
        caractere = Character.toUpperCase(caractere);

        if (caractere == 'M') {
            System.out.println("Masculino");

        }   else {
            
            if (caractere == 'F') {
                System.out.println("Feminino");

            }   else {
                
                if (caractere == 'I') {
                    System.out.println("Não Informado");
                    
                }   else {
                    System.out.println("Entada Incorreta");
                }        

            }

        }

        teclado.close();
    }
    
}
