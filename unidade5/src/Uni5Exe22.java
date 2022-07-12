public class Uni5Exe22 {
    public static void main(String[] args){

        double salario, aumento, novoSalario;
        int ano, anoAtual;

        salario = 2000;
        aumento = 1.5 / 100;
        novoSalario = salario + (aumento * salario);
        anoAtual = 2022;
        ano = 1997;

        while (ano <= anoAtual) {
            aumento = aumento * 2;
            novoSalario = novoSalario + (aumento * novoSalario);
            ano++;            
        }
        System.out.println("O salário atual do funcionário é R$ " + novoSalario);
    }
    
}
