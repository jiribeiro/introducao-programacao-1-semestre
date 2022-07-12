import java.util.Scanner;

public class Uni6Exe05 {

    private Uni6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String vetor1[] = new String[5];
        String vetor2[] = new String[5];
        vetorLer(teclado, vetor1, vetor2);
        vetorCalcular(vetor1, vetor2);
        teclado.close();
    }

    private void vetorLer(Scanner teclado, String vetor1[], String vetor2[]) {
        System.out.println("Responda as perguntas com 'SIM', 'NAO' ou 'IND'.");
        System.out.println("Rapaz responde: ");
        System.out.println("Gosta de música sertaneja? ");
        vetor1[0] = teclado.next();
        System.out.println("Gosta de futebol? ");
        vetor1[1] = teclado.next();
        System.out.println("Gosta de seriados? ");
        vetor1[2] = teclado.next();
        System.out.println("Gosta de redes sociais? ");
        vetor1[3] = teclado.next();
        System.out.println("Gosta de Oktoberfest? ");
        vetor1[4] = teclado.next();
        System.out.println("Moça responde: ");
        System.out.println("Gosta de música sertaneja? ");
        vetor2[0] = teclado.next();
        System.out.println("Gosta de futebol? ");
        vetor2[1] = teclado.next();
        System.out.println("Gosta de seriados? ");
        vetor2[2] = teclado.next();
        System.out.println("Gosta de redes sociais? ");
        vetor2[3] = teclado.next();
        System.out.println("Gosta de Oktoberfest? ");
        vetor2[4] = teclado.next();

        for (int i = 0; i < vetor1.length; i++) {
            if ((vetor1[i].equals("SIM")) || (vetor1[i].equals("NAO")) || (vetor1[i].equals("IND"))) {

            }   else {
                System.out.println("Alguma resposta está incorreta! Responda com 'SIM', 'NAO' ou 'IND'.");
                vetorLer(teclado, vetor1, vetor2);
            }
        }
        for (int i = 0; i < vetor2.length; i++) {
            if ((vetor2[i].equals("SIM")) || (vetor2[i].equals("NAO")) || (vetor2[i].equals("IND"))) {

            }   else {
                System.out.println("Alguma resposta está incorreta! Responda com 'SIM', 'NAO' ou 'IND'.");
                vetorLer(teclado, vetor1, vetor2);
            }
        }
    }

    private void vetorCalcular(String vetor1[], String vetor2[]) {
        int calculo = 0;
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i].equals(vetor2[i])) {
                calculo = calculo + 3;
            }   else if (((vetor1[i].equals("IND")) && (vetor2[i].equals("SIM") || vetor2[i].equals("NAO"))) || ((vetor2[i].equals("IND")) && (vetor1[i].equals("SIM") || vetor1[i].equals("NAO")))) {
                calculo = calculo + 1;
            }   else if ((vetor1[i].equals("SIM") && vetor2[i].equals("NAO")) || (vetor2[i].equals("SIM") && vetor1[i].equals("NAO"))) {
                calculo = calculo - 2;
            }
        }
        if (calculo == 15) {
            System.out.println("Casem!");
        }   else if (calculo >= 10 && calculo <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        }   else if (calculo >= 5 && calculo <= 9) {
            System.out.println("Talvez não dê certo :(");
        }   else if (calculo >= 0 && calculo <= 4) {
            System.out.println("Vale um encontro.");
        }   else if (calculo >= -9 && calculo <= -1) {
            System.out.println("Melhor não perder tempo.");
        }   else if (calculo == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }

}
