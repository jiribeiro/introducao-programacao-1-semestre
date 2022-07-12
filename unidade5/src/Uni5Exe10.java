public class Uni5Exe10 {
    public static void main(String[] args){
        
        int d1 = 0, d2 = 0, soma = 0;

        for (int i = 1000; i < 10000; i++) {

            d1 = i / 100;
            d2 = i % (d1 * 100);
            soma = d1 + d2;

            if (Math.pow(soma, 2) == i) {
                System.out.println(i);
                
            }
            
        }
    
    }
    
}