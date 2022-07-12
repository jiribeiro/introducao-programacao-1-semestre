import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento do irmão 1: ");
        int irmao1 = teclado.nextInt();
        System.out.println("Informe o ano de nascimento do irmão 2: ");
        int irmao2 = teclado.nextInt();
        System.out.println("Informe o ano de nascimento do irmão 3: ");
        int irmao3 = teclado.nextInt();

        if ((irmao1 == irmao2) && (irmao1 == irmao3) && (irmao2 == irmao3)) {
            System.out.println("Os irmãos são TRIGÊMEOS");
            
        }   else {
            if ((irmao1 == irmao2) || (irmao1 == irmao3) || (irmao2 == irmao3)) {
                System.out.println("Os irmãos são GÊMEOS");
                
            }   else {
                System.out.println("Os irmãos são APENAS IRMÃOS");
            }

        }

        teclado.close();

    }
    
}
