package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    
    public static void main(String[] args) {
        
        BinaryOperator<Double> calcular = (a, b) -> { return a + b; };
        System.out.println("Somar: " + calcular.apply(2.0, 3.0));

        calcular = (a, b) -> a * b;
        System.out.println("Multiplicar: " + calcular.apply(2.0, 3.0));
    }
}
