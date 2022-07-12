import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe quantos meses o funcionário esta na empresa: ");
        int qtMeses = teclado.nextInt();
        
        if ((qtMeses > 0) && (qtMeses <= 12)) {
            System.out.println("O reajuste do funcionário será de 5%");
            
        }   else {
            if ((qtMeses >= 13) && (qtMeses <= 48)) {
                System.out.println("O reajuste do funcionário será de 7%");
                
            }
        }

        teclado.close();

    }
    
}
