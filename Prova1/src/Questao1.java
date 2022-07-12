import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String nivel = "alto";
        String altura = "certa";

        if ((nivel == "") && (altura == "")) {
            System.out.println("Nível e altura");
            
        }   else {
            System.out.println("Teste altura");
            if (altura == "") {
                System.out.println("Altura Vazio");
                System.out.println("Nível Vazio");
                
            }   else {
                System.out.println("Altura Cadastrada");
            }
        }

        System.out.println("Outro Nível");

        teclado.close();

    }
    
}
