import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double comissao, precoProduto, qtdVendido, totaldoProduto, salarioFinal, totalComComissao, totalVendido;
        String nomeVendedor, produto, continuar;
        int qtdProdutos;

        comissao = 0.3;
        salarioFinal = 0;
        totalVendido = 0;
        continuar = "s";

        while (continuar.equals("s")) {
            System.out.println("Informe o nome do vendedor: ");
            nomeVendedor = teclado.next();
            System.out.println("Informe a quantidade de produtos vendidos pelo vendedor: ");
            qtdProdutos = teclado.nextInt();
            for (int i = 1; i <= qtdProdutos; i++) {
                System.out.println("Informe o produto vendido: ");
                produto = teclado.next();
                System.out.println("Informe a quantidade vendida desse produto: ");
                qtdVendido = teclado.nextDouble();
                System.out.println("Informe o valor unitário desse produto: ");
                precoProduto = teclado.nextDouble();

                totaldoProduto = qtdVendido * precoProduto;
                totalComComissao = totaldoProduto * comissao;
                salarioFinal = salarioFinal + totalComComissao;
                totalVendido = totalVendido + totaldoProduto;

                
            }
            System.out.println("Nome do vendedor: " + nomeVendedor);
            System.out.println("Total de vendas (em R$): " + totalVendido);
            System.out.println("O salário do vendedor é R$ " + salarioFinal);
            System.out.println("O vendedor vendeu " + qtdProdutos + " tipo de produtos diferentes.");
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM)/ n (NÃO)?");
            continuar = teclado.next();
        }

        teclado.close();

    }
    
}
