import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double limiteDiario, pesoPeixe, pesoAcumulado;
        String continuar;

        System.out.println("Informe o limite diário (em quilogramas): ");
        limiteDiario = teclado.nextDouble();
        continuar = "s";
        pesoAcumulado = 0;

        while (continuar.equals("s")) {
            System.out.println("Informe o peso do peixe (em gramas): ");
            pesoPeixe = teclado.nextDouble();
            pesoPeixe = pesoPeixe / 1000;
            pesoAcumulado = pesoAcumulado + pesoPeixe;

            System.out.println("O peso total de pesca obtido até o momento é de " + pesoAcumulado + " quilos.");
            
            if (pesoAcumulado > limiteDiario) {
                System.out.println("O limite diário foi excedido!");
                continuar = "n";
            }   else if (pesoAcumulado <= limiteDiario) {
                System.out.println("Deseja informar o peso de mais um peixe: s (SIM)/ n (NÃO)?");
                continuar = teclado.next();
            }
            
        }

        teclado.close();

    }
    
}
