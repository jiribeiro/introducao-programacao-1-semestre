import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = teclado.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
            
        }   else {
            if (imc >= 18.5 && imc < 25) {
                System.out.println("Saudável");
                
            }   else {
                if (imc >= 25 && imc < 30) {
                    System.out.println("Sobrepeso");
                    
                }   else {
                    if (imc >= 30 && imc < 35) {
                        System.out.println("Obesidade Grau 1");
                        
                    }   else {
                        if (imc >= 35 && imc < 40) {
                            System.out.println("Obesidade Grau 2 (severa)");
                            
                        }   else {
                            if (imc >= 40) {
                                System.out.println("Obesidade Grau 3 (mórbida)");
                                
                            }
                        }
                    }
                }
            }
        }

        teclado.close();

    }
    
}
