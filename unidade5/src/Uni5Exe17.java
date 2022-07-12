import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numIns = 1, numInsMaisAlto = 0, numInsMaisBaixo = 0;
        double altura = 0, alturaMaisAlto = 0, alturaMaisBaixo = 999999, somaAltura = 0, incrementoAltura = 0, mediaAltura = 0;
        
        while (numIns != 0) {
            System.out.println("Informe o número de inscrição do atleta: ");
            numIns = teclado.nextInt();
            if (numIns != 0) {
                System.out.println("Informe a altura do atleta: ");
                altura = teclado.nextDouble();
                if (altura > alturaMaisAlto) {
                    alturaMaisAlto = altura;
                    numInsMaisAlto = numIns;
            }
                if (altura < alturaMaisBaixo && altura != 0) {
                 alturaMaisBaixo = altura;
                    numInsMaisBaixo = numIns;                
            }
                if (numIns != 0) {
                    somaAltura = somaAltura + altura;
                    incrementoAltura++;
                    mediaAltura = somaAltura / incrementoAltura;
            }
            }
            
        }

        System.out.println("Atleta mais alto, número de inscrição: " + numInsMaisAlto + ", e altura: " + alturaMaisAlto);
        System.out.println("Atleta mais baixo, número de inscrição: " + numInsMaisBaixo + ", e altura: " + alturaMaisBaixo);
        System.out.println("A média de altura do grupo de atletas é: " + mediaAltura);

        teclado.close();

    }
    
}
