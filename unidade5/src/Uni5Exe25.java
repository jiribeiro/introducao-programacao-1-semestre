import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String ponto;
        int pontoD, pontoE, continuar;

        continuar = 1;
        pontoD = 0;
        pontoE = 0;

        while (continuar == 1) {
            System.out.println("Informe de quem foi o ponto, D (lado direito) E (lado esquerdo): ");
            ponto = teclado.next();

            if (ponto.equals("D")) {
                pontoD++;
            }   else if (ponto.equals("E")) {
                pontoE++;
            }
            System.out.println("O jogador do lado direito tem " + pontoD + " ponto(s), e o do lado esquerdo tem " + pontoE + " ponto(s).");
            
            if ((pontoD == 21 || pontoE == 21) && (pontoD > pontoE + 1 || pontoE > pontoD + 1)) {
                if (pontoD > pontoE) {
                    System.out.println("O vencedor é o jogador do lado direito!");
                    continuar = 0;
                }   else {
                    System.out.println("O vencedor é o jogador do lado esquerdo!");
                    continuar = 0;
                }
            }
            if ((pontoD > pontoE + 1 || pontoE > pontoD + 1) && (pontoD >= 20 && pontoE >= 20)) {
                if (pontoD > pontoE) {
                    System.out.println("O vencedor é o jogador do lado direito!");
                    continuar = 0;
                }   else {
                    System.out.println("O vencedor é o jogador do lado esquerdo!");
                    continuar = 0;
                }
            }
        }

        teclado.close();

    }
    
}
