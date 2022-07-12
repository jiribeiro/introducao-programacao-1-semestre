import java.util.Scanner;

public class Uni4URI1042 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();

        if (A < B && A < C) {
            if (B < C) {
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                
            }   else if (C < B) {
                System.out.println(A);
                System.out.println(C);
                System.out.println(B);
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                
            }
            
        }

        if (B < A && B < C) {
                if (A < C) {
                System.out.println(B);
                System.out.println(A);
                System.out.println(C);
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                
            }   else if (C < A) {
                System.out.println(B);
                System.out.println(C);
                System.out.println(A);
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                
            }
            
        }

        if (C < A && C < B) {
            if (A < B) {
                System.out.println(C);
                System.out.println(A);
                System.out.println(B);
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                
            } else if (B < A) {
                System.out.println(C);
                System.out.println(B);
                System.out.println(A);
                System.out.println("");
                System.out.println(A);
                System.out.println(B);
                System.out.println(C);
                
            }
            
        }

        teclado.close();

    }
    
}
