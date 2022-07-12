import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double valorCompra = 1, valorDesconto = 0, totalCompra = 0, totalRecebido = 0;

        while (valorCompra != 0) {
            System.out.println("Informe o valor da compra: ");
            valorCompra = teclado.nextDouble();
            if (valorCompra > 500) {
                valorDesconto = (valorCompra * 20) / 100;
                totalCompra = valorCompra - valorDesconto;
                System.out.println("O valor total da compra a pagar é R$ " + totalCompra);
            }   else if (valorCompra <= 500 && valorCompra != 0) {
                valorDesconto = (valorCompra * 15) / 100;
                totalCompra = valorCompra - valorDesconto;
                System.out.println("O valor total da compra a pagar é R$ " + totalCompra);
            }
            
            totalRecebido = totalRecebido + totalCompra;

        }

        System.out.println("Ao final do dia, a loja recebeu um total de: R$ " + totalRecebido);

        teclado.close();

    }
    
}
