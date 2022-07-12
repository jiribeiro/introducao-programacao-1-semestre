import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

       String sexo;
       double altura = 1, somaMas = 0, somaFem = 0, somaGrupo = 0, qtdFem = 0, qtdGrupo = 0, mediaFem = 0, mediaGrupo = 0;

        while (altura != 0) {
            System.out.println("Informe o sexo da pessoa: ");
            sexo = teclado.next();
            System.out.println("Informe a altura da pessoa: ");
            altura = teclado.nextDouble();

            if (sexo.equals("m") || sexo.equals("M")) {
                somaMas = somaMas + altura;
            }   else if (sexo.equals("f") || sexo.equals("F")) {
                somaFem = somaFem + altura;
                qtdFem++;
            }
            qtdGrupo++;

            somaGrupo = somaMas + somaFem;
            mediaFem = somaFem / qtdFem;
            mediaGrupo = somaGrupo / qtdGrupo;

            System.out.println("A média de altura das mulheres é: " + mediaFem);
            System.out.println("A média de altura do grupo é: " + mediaGrupo);
                
        }
        
        teclado.close();

    }
    
}
