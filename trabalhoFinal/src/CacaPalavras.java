import java.util.Scanner;

public class CacaPalavras {
    private CacaPalavras() {
        Scanner teclado = new Scanner(System.in);
        int tamMatPalavrasL = 5, tamMatPalavrasC = 2, tamMatMapaL = 10, tamMatMapaC = 5;
        String palavras[][] = new String[tamMatPalavrasL][tamMatPalavrasC];
        char mapa[][] = new char[tamMatMapaL][tamMatMapaC];
        int opcao = 0;

        palavraEntrada(palavras);
        mapaEntrada(mapa);
        mapaPesquisa(palavras, mapa, tamMatMapaC, tamMatMapaL);

        do {
            System.out.println("_____Menu: Caça Palavras _____");
            System.out.println("1. listar palavras");
            System.out.println("2. listar mapa");
            System.out.println("3. listar respostas");
            System.out.println("4. sair");
            System.out.println(" __ opção:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    palavrasImprimir(palavras);
                    break;
                case 2:
                    mapaImprimir(mapa, tamMatMapaC, tamMatMapaL);
                    break;
                case 3:
                    palavrasRespostas(palavras);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção ERRADA!...");
                    break;
            }

        } while (opcao != 4);

        teclado.close();
    }

    private void palavraEntrada(String palavras[][]) {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";
    }

    private void mapaEntrada(char mapa[][]) {
        mapa[ 0][ 0]='D';  mapa[ 0][ 1]='C';  mapa[ 0][ 2]='Q';  mapa[ 0][ 3]='W';  mapa[ 0][ 4]='E';
        mapa[ 1][ 0]='I';  mapa[ 1][ 1]='X';  mapa[ 1][ 2]='F';  mapa[ 1][ 3]='O';  mapa[ 1][ 4]='R';
        mapa[ 2][ 0]='F';  mapa[ 2][ 1]='F';  mapa[ 2][ 2]='R';  mapa[ 2][ 3]='G';  mapa[ 2][ 4]='F';
        mapa[ 3][ 0]='E';  mapa[ 3][ 1]='L';  mapa[ 3][ 2]='I';  mapa[ 3][ 3]='H';  mapa[ 3][ 4]='W';
        mapa[ 4][ 0]='L';  mapa[ 4][ 1]='S';  mapa[ 4][ 2]='F';  mapa[ 4][ 3]='O';  mapa[ 4][ 4]='U';
        mapa[ 5][ 0]='S';  mapa[ 5][ 1]='D';  mapa[ 5][ 2]='G';  mapa[ 5][ 3]='T';  mapa[ 5][ 4]='S';
        mapa[ 6][ 0]='E';  mapa[ 6][ 1]='J';  mapa[ 6][ 2]='H';  mapa[ 6][ 3]='E';  mapa[ 6][ 4]='T';
        mapa[ 7][ 0]='I';  mapa[ 7][ 1]='I';  mapa[ 7][ 2]='I';  mapa[ 7][ 3]='J';  mapa[ 7][ 4]='M';
        mapa[ 8][ 0]='X';  mapa[ 8][ 1]='C';  mapa[ 8][ 2]='K';  mapa[ 8][ 3]='B';  mapa[ 8][ 4]='G';
        mapa[ 9][ 0]='V';  mapa[ 9][ 1]='E';  mapa[ 9][ 2]='T';  mapa[ 9][ 3]='O';  mapa[ 9][ 4]='R';
    }

    private void mapaPesquisa(String palavras[][], char mapa[][], int tamMatMapaC, int tamMatMapaL) {
        int qtdCaracter = 0;
        for (int k = 0; k < palavras.length; k++) {
            // esquerda - direita
            for (int i = 0; i < tamMatMapaL; i++) {
                for (int j = 0; j < tamMatMapaC; j++) {
                    if (mapa[i][j] == palavras[k][0].charAt(qtdCaracter)) {
                        qtdCaracter++;
                        if (qtdCaracter == palavras[k][0].length()) {
                            palavras[k][1] = "[" + i + "," + (j - palavras[k][0].length() + 1) + "]";
                            qtdCaracter = 0;
                        }
                    }   else {
                        qtdCaracter = 0;
                    }
                }
            }

            // direita - esquerda
            for (int i = 0; i < tamMatMapaL; i++) {
                for (int j = tamMatMapaC - 1; j >= 0; j--) {
                    if (mapa[i][j] == palavras[k][0].charAt(qtdCaracter)) {
                        qtdCaracter++;
                        if (qtdCaracter == palavras[k][0].length()) {
                            palavras[k][1] = "[" + i + "," + (j + palavras[k][0].length() - 1) + "]";
                            qtdCaracter = 0;
                        }
                    }   else {
                        qtdCaracter = 0;
                    }
                }
            }

            //baixo - cima
            for (int j = 0; j < tamMatMapaC; j++) {
                for (int i = tamMatMapaL - 1; i >= 0; i--) {
                    if (mapa[i][j] == palavras[k][0].charAt(qtdCaracter)) {
                        qtdCaracter++;
                        if (qtdCaracter == palavras[k][0].length()) {
                            palavras[k][1] = "[" + (i + palavras[k][0].length() - 1) + "," + j + "]";
                            qtdCaracter = 0;
                        }
                    }   else {
                        qtdCaracter = 0;
                    }
                }
            }

            //cima - baixo
            for (int j = 0; j < tamMatMapaC; j++) {
                for (int i = 0; i < tamMatMapaL; i++) {
                    if (mapa[i][j] == palavras[k][0].charAt(qtdCaracter)) {
                        qtdCaracter++;
                        if (qtdCaracter == palavras[k][0].length()) {
                            palavras[k][1] = "[" + (i - palavras[k][0].length() + 1) + "," + j + "]";
                            qtdCaracter = 0;
                        }
                    }   else {
                        qtdCaracter = 0;
                    }
                }
            }
        }
    }

    private void palavrasImprimir(String palavras[][]) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i][0]);
        }
    }

    private void palavrasRespostas(String palavras[][]) {
        for (int i = 0; i < palavras.length; i++) {
            String achou = palavras[i][1];
            if (achou == null) {
                System.out.println("Palavra NÃO encontrada " + palavras[i][0]);
            } else {
                System.out.println(palavras[i][1] + " - " + palavras[i][0]);
            }
        }
    }

    private void mapaImprimir(char mapa[][], int tamMatMapaC, int tamMatMapaL) {
        for (int i = 0; i < tamMatMapaL; i++) {
            System.out.println();
            System.out.println("---------------------");
            for (int j = 0; j < tamMatMapaC; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(mapa[i][j] + " | ");
            }
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        new CacaPalavras();
    }
}
