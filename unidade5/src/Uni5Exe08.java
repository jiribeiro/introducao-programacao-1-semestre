import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        double repeticoes = teclado.nextInt(), numInteiro = 0, mediaNumPos = 0, somaNumPos = 0, qtdNumPos = 0, menorValNeg = 0;

        for (int i = 1; i <= repeticoes; i++) {
            System.out.println("Entre com os Números: ");
            numInteiro = teclado.nextInt();

            if (numInteiro >= 0) {
                somaNumPos = somaNumPos + numInteiro;
                qtdNumPos++;
                mediaNumPos = somaNumPos / qtdNumPos;
            }
            if (numInteiro < menorValNeg) {
                menorValNeg = numInteiro;
            }

        }

        System.out.println("Média dos números positivos: " + mediaNumPos);
        System.out.println("Menor número negativo: " + menorValNeg);

        teclado.close();

    }
    
}
