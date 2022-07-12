import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = teclado.nextDouble();
        double media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 9) {
            System.out.println("A média de aproveitamento foi: " + media + ", o conceito foi A, e o aluno está aprovado");
            
        }   else {
            if (media >= 7.5 && media < 9) {
                System.out.println("A média de aproveitamento foi: " + media + ", o conceito foi B, e o aluno está aprovado");
                
            }   else {
                if (media >= 6 && media < 7.5) {
                    System.out.println("A média de aproveitamento foi: " + media + ", o conceito foi C, e o aluno está aprovado");
                    
                }   else {
                    if (media >= 4 && media < 6) {
                        System.out.println("A média de aproveitamento foi: " + media + ", o conceito foi D, e o aluno está reprovado");
                        
                    }   else {
                        if (media < 4) {
                            System.out.println("A média de aproveitamento foi: " + media + ", o conceito foi E, e o aluno está reprovado");
                            
                        }
                    }
                }
            }
        }
        
        teclado.close();

    }
    
}
