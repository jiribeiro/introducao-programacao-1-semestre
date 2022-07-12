public class Uni5Exe04 {
    public static void main(String[] args){

        double resultadoDivisao = 0;
        double resultadoFinal = 0;
        double denominador = 2;
        double apoio = 2;

        for (double numerador = 3; numerador <= 41; numerador += 2) {
            resultadoDivisao = numerador / denominador;
            apoio += 2;
            denominador = denominador + apoio;
            resultadoFinal = resultadoFinal + resultadoDivisao;
            
        }

        System.out.println(resultadoFinal);

    }
    
}
