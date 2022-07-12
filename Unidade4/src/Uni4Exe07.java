import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com peso da carte: ");
        double peso;
        peso = teclado.nextDouble();
        double valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45;
            
        }   else {
            double pesoExcedido = peso - 50;
            double qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;

        }

        System.out.println("Custo do selo: " + valorPagar);

        teclado.close();
    }
    
}
