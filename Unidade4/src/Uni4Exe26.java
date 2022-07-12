import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        System.out.println("Opção: ");
        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                System.out.println("Base: ");
                double baseTriangulo = teclado.nextDouble();
                System.out.println("Altura:");
                double alturaTriangulo = teclado.nextDouble();
                System.out.println("Área do triângulo = " + baseTriangulo * alturaTriangulo / 2);
                break;
            case 'Q':
                System.out.println("Digite o lado: ");
                double ladoQuadrado = teclado.nextDouble();
                System.out.println("Área do quadrado = " + ladoQuadrado * ladoQuadrado);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retângulo: ");
                System.out.println("Base: ");
                double baseRetangulo = teclado.nextDouble();
                System.out.println("Altura: ");
                double alturaRetangulo = teclado.nextDouble();
                System.out.println("Área do retângulo = " + baseRetangulo * alturaRetangulo);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                double raio = teclado.nextDouble();
                System.out.println("Área do círculo = " + Math.PI * Math.pow(raio, 2));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
        teclado.close();

    }
    
}
