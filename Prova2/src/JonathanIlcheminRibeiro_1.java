import java.util.Scanner;

public class JonathanIlcheminRibeiro_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;
        String nome;
        int diarias;
        double custo;
        int contasEncerradas = 0;

        do {
            System.out.println("_________ Controle de Hóspedes _________");
            System.out.println("1. encerrar a conta de Hóspede");
            System.out.println("2. verificar número de contas encerradas");
            System.out.println("3. sair");
            System.out.print("__ 0pcao: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("_ Hóspede _");
                    System.out.print("nome: ");
                    nome = teclado.next();
                    System.out.print("diárias: ");
                    diarias = teclado.nextInt();
                    System.out.println("----------");
                    if (diarias < 7) {
                        custo = (10 * diarias) + 7.30;
                        System.out.println("nome: " + nome);
                        System.out.println("total: " + custo);
                        contasEncerradas++;
                    }
                    if (diarias == 7) {
                        custo = (10 * diarias) + 6.30;
                        System.out.println("nome: " + nome);
                        System.out.println("total: " + custo);
                        contasEncerradas++;
                    }
                    if (diarias > 7) {
                        custo = (10 * diarias) + 5.30;
                        System.out.println("nome: " + nome);
                        System.out.println("total: " + custo);
                        contasEncerradas++;
                    }
                    break;
                case 2:
                    System.out.println("_ Número de contas encerradas: " + contasEncerradas);
                case 3:
                    break;
                default:
                    System.out.println("opção errada!");
                    break;
            }
        } while (opcao != 3);

        teclado.close();
    }
}
