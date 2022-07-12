import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes): ");
        System.out.println("Homem 1: ");
        int homem1 = teclado.nextInt();
        System.out.println("Homem 2: ");
        int homem2 = teclado.nextInt();
        System.out.println("Mulher 1: ");
        int mulher1 = teclado.nextInt();
        System.out.println("Mulher 2: ");
        int mulher2 = teclado.nextInt();

        if (homem1 > homem2) {
            if (mulher1 < mulher2) {
                int soma = homem1 + mulher1;
                System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
                
            }
            if (mulher2 < mulher1) {
                int soma = homem1 + mulher2;
                System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
                
            }
            
        }

        if (homem2 > homem1) {
            if (mulher1 < mulher2) {
                int soma = homem2 + mulher1;
                System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
                
            }
            if (mulher2 < mulher1) {
                int soma = homem2 + mulher2;
                System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
                
            }
        
        }
        
        if (homem1 < homem2) {
            if (mulher1 > mulher2) {
                int produto = homem1 * mulher1;
                System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produto);
                
            }
            if (mulher2 > mulher1) {
                int produto = homem1 * mulher2;
                System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produto);
                
            }

        }

         if (homem2 < homem1) {
            if (mulher1 > mulher2) {
                int produto = homem2 * mulher1;
                System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produto);
                
            }
            if (mulher2 > mulher1) {
                int produto = homem2 * mulher2;
                System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + produto);
                
            }

         }

        teclado.close();

        }

    }
