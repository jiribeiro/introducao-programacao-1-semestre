import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int diarias;
        double custo;
        String nomeHospede;
        int contasEncerradas = 0;

        do {
            System.out.println("Informe a opção desejada: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do hóspede: ");
                    nomeHospede = teclado.next();
                    System.out.println("Informe o número de diárias");
                    diarias = teclado.nextInt();
                    if (diarias < 15) {
                        custo = 7.50 * (diarias) + 50;
                        System.out.println("O valor total a ser pago por: " + nomeHospede + " é de R$ " + custo);
                        contasEncerradas++;
                        break;
                    }
                    if (diarias == 15) {
                        custo = 6.50 * (diarias) + 50;
                        System.out.println("O valor total a ser pago por: " + nomeHospede + " é de R$ " + custo);
                        contasEncerradas++;
                        break;
                    }
                    if (diarias > 15) {
                        custo = 5.00 * (diarias) + 50;
                        System.out.println("O valor total a ser pago por: " + nomeHospede + " é de R$ " + custo);
                        contasEncerradas++;

                    }
                    break;
                case 2:
                    System.out.println("O número de hóspedes que deixaram o hotel foi: " + contasEncerradas);
                    break;
            }
        } while (opcao != 3);

        teclado.close();
    }
}