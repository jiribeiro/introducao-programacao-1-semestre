import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número do curso de graduação: 1 - Ciência da Computação, 2 - Licenciatura da Computação, 3 - Sistemas de Informação: ");
        int curso = teclado.nextInt();

        switch (curso) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Valor inválido");
                break;

        }

        teclado.close();

    }
    
}
