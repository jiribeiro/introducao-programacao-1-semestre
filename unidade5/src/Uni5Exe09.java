import java.util.Scanner;

public class Uni5Exe09 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String alunoNome;
    int alunoIdade;
    String alunoIdade18 = "Aluno c/ 18 anos: \n";
    int alunoQtdMaior20 = 0;

    System.out.print("Informe qtd. alunos: ");
    int alunoQtd = teclado.nextInt();
    for (int alunoAtual = 1; alunoAtual <= alunoQtd; alunoAtual++) {
      System.out.print("Informe o nome: ");
      alunoNome = teclado.next();
      System.out.print("Informe a idade: ");
      alunoIdade = teclado.nextInt();
      if (alunoIdade == 18) {
        alunoIdade18 = alunoIdade18 + alunoNome + "\n";
      }
      if (alunoIdade > 20) {
        alunoQtdMaior20++;
      }
    }
    System.out.println(alunoIdade18);
    System.out.println("Qtd. alunos maior que 20 anos: " + alunoQtdMaior20);

    teclado.close();
  }

}