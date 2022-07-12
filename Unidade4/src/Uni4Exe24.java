import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros diferentes: ");
        System.out.println("Valor 1: ");
        int valor1 = teclado.nextInt();
        System.out.println("Valor 2: ");
        int valor2 = teclado.nextInt();
        System.out.println("Valor 3: ");
        int valor3 = teclado.nextInt();
        System.out.println("Informe o número da opção desejada:");
        System.out.println("Opção 1: os 3 valores em ordem crescente");
        System.out.println("Opção 2: os 3 valores em ordem descrescente");
        System.out.println("Opção 3: os 3 valores de forma que o maior valor fique no meio");
        int valor = teclado.nextInt();
        
        switch (valor) {
            case 1:
                if (valor1 < valor2 && valor1 < valor3) {
                    if (valor2 < valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                        
                    }   else {
                        if (valor3 < valor2) {
                            System.out.println(valor1 + " " + valor3 + " " + valor2);
                            
                        }
                    }
                    
                }   else {
                    if (valor2 < valor1 && valor2 < valor3) {
                        if (valor1 < valor3) {
                            System.out.println(valor2 + " " + valor1 + " " + valor3);
                            
                        }   else {
                            if (valor3 < valor1) {
                                System.out.println(valor2 + " " + valor3 + " " + valor1);
                                
                            }
                        }
                        
                    }   else {
                        if (valor3 < valor1 && valor3 < valor2) {
                            if (valor1 < valor2) {
                                System.out.println(valor3 + " " + valor1 + " " + valor2);
                                
                            }   else {
                                if (valor2 < valor1) {
                                    System.out.println(valor3 + " " + valor2 + " " + valor1);
                                    
                                }
                            }
                            
                        }

                    }
                }
                break;
            case 2:
                if (valor1 > valor2 && valor1 > valor3) {
                    if (valor2 > valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                        
                    }   else {
                        if (valor3 > valor2) {
                            System.out.println(valor1 + " " + valor3 + " " + valor2);
                            
                        }
                    }
                    
                }   else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        if (valor1 > valor3) {
                            System.out.println(valor2 + " " + valor1 + " " + valor3);
                            
                        }   else {
                            if (valor3 > valor1) {
                                System.out.println(valor2 + " " + valor3 + " " + valor1);
                                
                            }
                        }
                        
                    }   else {
                        if (valor3 > valor1 && valor3 > valor2) {
                            if (valor1 > valor2) {
                                System.out.println(valor3 + " " + valor1 + " " + valor2);
                                
                            }   else {
                                if (valor2 > valor1) {
                                    System.out.println(valor3 + " " + valor2 + " " + valor1);
                                    
                                }
                            }
                            
                        }

                    }
                }
                break;
            case 3:
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor2 + " " + valor1 + " " + valor3);
                    
                }   else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor1 + " " + valor2 + " " + valor3);
                        
                    }   else {
                        if (valor3 > valor1 && valor3 > valor2) {
                            System.out.println(valor1 + " " + valor3 + " " + valor2);
                            
                        }
                    }
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        teclado.close();

    }
    
}
