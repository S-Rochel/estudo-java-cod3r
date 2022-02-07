package fundamentos;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        // Operadores Aritméticos para o tipo double:
        double a = 10.5;
        double b = 5.5;
        System.out.printf("Soma: %f\n", (a + b));
        System.out.printf("Subtração: %f\n", (a - b));
        System.out.printf("Multiplicação: %f\n", (a * b));
        System.out.printf("Divisão: %f\n", (a / b));

        // Operadores Aritméticos para o tipo int:
        int c = 8;
        int d = 3;
        System.out.printf("Soma: %d\n", (c + d));
        System.out.printf("Subtração: %d\n", (c - d));
        System.out.printf("Multiplicação: %d\n", (c * d));
        System.out.printf("Divisão: %d\n", (c / d)); // Divisão de inteiro por inteiro retorna inteiro.
        System.out.printf("Divisão: %f\n", (c / (double) d)); // Usando um CAST ele retornará o número real.

        // Operadores Aritméticos para módulo, ou resto da divisão:
        System.out.printf("O resto da divisão será: %d\n", (8 % 3));


        // Precedência, ordem: () -> * / -> + -
        System.out.println((2 + 2) / 4);
    }
}
