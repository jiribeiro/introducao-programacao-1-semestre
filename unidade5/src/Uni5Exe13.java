import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas paradas o motorista fez? ");
        double paradas = teclado.nextInt(), kmPorParada = 0, litrosPorParada = 0, kmPorLitro = 0, somaLitros = 0, somaKms = 0, mediaFinal = 0; 

        for (int i = 1; i <= paradas; i++) {
            System.out.println("Informe quantos litros o motorista abasteceu em cada parada: ");
            litrosPorParada = teclado.nextDouble();
            System.out.println("Informe quantos kms o motorista andou em cada parada: ");
            kmPorParada = teclado.nextDouble();
            kmPorLitro = kmPorParada / litrosPorParada;
            System.out.println("O carro andou " + kmPorLitro + " quilometros por litro nessa parada.");

            somaLitros = somaLitros + litrosPorParada;
            somaKms = somaKms + kmPorParada;
            mediaFinal = somaKms / somaLitros;
            
        }

        System.out.println("A quilometragem média obtida por litro de combustível em toda a viagem foi: " + mediaFinal + " kms.");

        teclado.close();

    }
    
}
