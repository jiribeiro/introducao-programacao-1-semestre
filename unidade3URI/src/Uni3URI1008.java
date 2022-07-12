import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1008 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int numeroFunc;
        double hrsTrab;
        double valorHora;
        double salario;

        numeroFunc = teclado.nextInt();
        hrsTrab = teclado.nextInt();
        valorHora = teclado.nextDouble();

        salario = hrsTrab * valorHora;

        System.out.println("NUMBER = " + numeroFunc);
        System.out.println("SALARY = U$ " + df_2.format(salario));

        teclado.close();

    }
    
}
