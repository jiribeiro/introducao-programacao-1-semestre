import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double canal = 1, canal4 = 0, canal5 = 0, canal9 = 0, canal12 = 0, qtdPessoasAssistindo, totalPessoas = 0, pCento4 = 0, pCento5 = 0, pCento9 = 0, pCento12 = 0;

        while (canal != 0) {
            System.out.println("Informe o número do canal: ");
            canal = teclado.nextInt();
            if (canal != 0) {
                if (canal != 4 && canal != 5 && canal != 9 && canal != 12) {
                    System.out.println("Canal inexistente!!!");
                }   else{
                    System.out.println("Informe o número de pessoas que estão assistindo: ");
                    qtdPessoasAssistindo = teclado.nextInt();
                    if (canal == 4) {
                        canal4 = canal4 + qtdPessoasAssistindo;
                    }   else if (canal == 5) {
                        canal5 = canal5 + qtdPessoasAssistindo;
                    }   else if (canal == 9) {
                        canal9 = canal9 + qtdPessoasAssistindo;
                    }   else if (canal == 12) {
                        canal12 = canal12 + qtdPessoasAssistindo;
                    }
                    totalPessoas = totalPessoas + qtdPessoasAssistindo;
                    pCento4 = (canal4 / totalPessoas) * 100;
                    pCento5 = (canal5 / totalPessoas) * 100;
                    pCento9 = (canal9 / totalPessoas) * 100;
                    pCento12 = (canal12 / totalPessoas) * 100;
                }                
            }            
        }

        System.out.println("O canal 4 teve " + pCento4 + " % da audiência na pesquisa, com " + (int)canal4 + " pessoas assistindo.");
        System.out.println("O canal 5 teve " + pCento5 + " % da audiência na pesquisa, com " + (int)canal5 + " pessoas assistindo.");
        System.out.println("O canal 9 teve " + pCento9 + " % da audiência na pesquisa, com " + (int)canal9 + " pessoas assistindo.");
        System.out.println("O canal 12 teve " + pCento12 + " % da audiência na pesquisa, com " + (int)canal12 + " pessoas assistindo.");

        teclado.close();

    }
    
}
