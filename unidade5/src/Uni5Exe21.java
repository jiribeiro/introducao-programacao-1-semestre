public class Uni5Exe21 {
    public static void main(String[] args){

        double chico = 1.5, ze = 1.1;
        int anos = 0;

        while (chico > ze) {
            chico = chico + 0.02;
            ze = ze + 0.03;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para que zé seja maior que chico.");
    }
    
}
