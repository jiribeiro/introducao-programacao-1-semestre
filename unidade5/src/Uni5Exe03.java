public class Uni5Exe03 {
    public static void main(String[] args){
        double numerador = 1;
        double resultadoDivisao = 0;
        double resultadoFinal = 0;

        for (double denominador = 1; denominador <= 100; denominador++) {
            resultadoDivisao = numerador / denominador;
            resultadoFinal = resultadoFinal + resultadoDivisao;
            
        }

        System.out.println(resultadoFinal);
    }
    
}
