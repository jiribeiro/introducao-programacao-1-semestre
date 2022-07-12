import java.util.Scanner;

public class Uni6Exe09 {

    private Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);
        int numClientes = 30;
        double mediaFinal;
        int vetSexo[] = new int[numClientes];
        double vetNota[] = new double[numClientes];
        int vetIdade[] = new int[numClientes];

        vetorLer(teclado, numClientes, vetSexo, vetNota, vetIdade);
        mediaFinal = vetorNotaMedia(numClientes, vetNota);
        vetorNotaMediaHomens(numClientes, vetSexo, vetNota);
        vetorNotaMulherMaisJovem(numClientes, vetSexo, vetNota, vetIdade);
        vetorMulheresMaisde50(numClientes, vetSexo, vetNota, vetIdade, mediaFinal);

        teclado.close();
    }

    private void vetorLer(Scanner teclado, int numClientes, int vetSexo[], double vetNota[], int vetIdade[]) {
        for (int i = 0; i < numClientes; i++) {
            System.out.println("Qual seu sexo? (1 = feminino 2 = masculino) ");
            vetSexo[i] = teclado.nextInt();
            System.out.println("Qual sua idade? ");
            vetIdade[i] = teclado.nextInt();
            System.out.println("Qual sua nota para o cinema? ");
            vetNota[i] = teclado.nextDouble();
            if ((vetNota[i] < 0) || (vetNota[i] > 10)) {
                i--;
                System.out.println("Valor da nota incorreto!");
            }
        }
    }

    private double vetorNotaMedia(int numClientes, double vetNota[]) {
        System.out.println();
        System.out.println("Nota média recebida pelo cinema: ");
        double mediaSoma = 0;
        double mediaFinal = 0;
        for (int i = 0; i < numClientes; i++) {
            mediaSoma = mediaSoma + vetNota[i];
        }
        mediaFinal = mediaSoma / numClientes;
        System.out.println("A nota média recebida pelo cinema foi: " + mediaFinal);
        return mediaFinal;
    }

    private void vetorNotaMediaHomens(int numClientes, int vetSexo[], double vetNota[]) {
        System.out.println();
        System.out.println("Nota média atribuída pelos homens: ");
        double mediaSoma1 = 0;
        double mediaFinal1 = 0;
        int qtdHomens = 0;
        for (int i = 0; i < numClientes; i++) {
            if (vetSexo[i] == 2) {
                mediaSoma1 = mediaSoma1 + vetNota[i];
                qtdHomens++;
            }
        }
        mediaFinal1 = mediaSoma1 / qtdHomens;
        if (qtdHomens > 0) {
            System.out.println("A nota média atribuída pelos homens foi: " + mediaFinal1);
        } else {
            System.out.println("Nenhum dado do sexo masculino na pesquisa!");
        }
    }

    private void vetorNotaMulherMaisJovem(int numClientes, int vetSexo[], double vetNota[], int vetIdade[]) {
        System.out.println();
        System.out.println("Nota atribuída pela mulher mais jovem: ");
        int interIdade;
        int idadeMaisJovem = vetIdade[0];
        double notaMaisJovem = vetNota[0];
        int qtdMulheres = 0;
        for (int i = 0; i < numClientes; i++) {
            if (vetSexo[i] == 1) {
                interIdade = vetIdade[i];
                if (idadeMaisJovem > interIdade) {
                    idadeMaisJovem = interIdade;
                    notaMaisJovem = vetNota[i];
                }
                qtdMulheres++;
            }
        }
        if (qtdMulheres > 0) {
            System.out.println("A nota atribuída pela mulher mais jovem foi: " + notaMaisJovem);
        } else {
            System.out.println("Nenhum dado do sexo feminino na pesquisa!");
        }
    }

    private void vetorMulheresMaisde50(int numClientes, int vetSexo[], double vetNota[], int vetIdade[], double mediaFinal) {
        System.out.println();
        System.out.println("Quantidade de mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.");
        int qtdMulheres = 0;
        for (int i = 0; i < numClientes; i++) {
            if ((vetSexo[i] == 1) && (vetIdade[i] > 50) && (vetNota[i] > mediaFinal)) {
                qtdMulheres++;
            }
        }
        if (qtdMulheres > 0) {
            System.out.println(qtdMulheres + " mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.");
        }   else {
            System.out.println("Não havia mulheres com mais de 50 anos na pesquisa que deram nota superior a médoa recebida pelo cinema.");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
