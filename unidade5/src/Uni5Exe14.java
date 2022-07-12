import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos: ");
        int qtdProdutos = teclado.nextInt();
        String produto = "";
        double PC = 0, PV = 0, lucro = 0, totalCompra = 0, totalVenda = 0, totalLucro = 0;
        int lucro10 = 0, lucro1020 = 0, lucro20 = 0;

        for (int i = 1; i <= qtdProdutos; i++) {
            System.out.println("Informe o nome do produto: ");
            produto = "produto";
            System.out.println("Informe o preço de compra do produto: ");
            PC = teclado.nextDouble();
            System.out.println("Informe o preço de venda do produto: ");
            PV = teclado.nextDouble();

            lucro = ((PV / PC) -1) * 100;

            if (lucro < 10) {
                lucro10++;
            }   else if (lucro >= 10 && lucro <= 20) {
                lucro1020++;   
            }   else if (lucro > 20) {
                lucro20++;                
            }

            totalCompra = totalCompra + PC;
            totalVenda = totalVenda + PV;

        }

        totalLucro = totalVenda - totalCompra;

        System.out.println(lucro10 + " mercadorias tem lucro menor que 10%");
        System.out.println(lucro1020 + " mercadorias tem lucro entre 10% e 20%");
        System.out.println(lucro20 + " mercadorias tem lucro maior que 20%");
        System.out.println("O valor total de compra é R$ " + totalCompra);
        System.out.println("O valor total de venda é R$ " + totalVenda);
        System.out.println("O lucro total é R$ " + totalLucro);
        System.out.println(produto); // coloquei apenas pra variável nao ficar sem uso
        teclado.close();

    }
    
}
