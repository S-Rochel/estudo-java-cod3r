package lambda;

public class CalculoTeste2 {

    public static void main(String[] args) {
        
        Calculo calcular = (a, b) -> {return a + b; }; // Função Lambda
        System.out.println("Soma: " + calcular.executar(2, 3));

        calcular = (a, b) -> a * b; // Função Lambda reduzida
        System.out.println("Multiplicar: " + calcular.executar(2, 3));
    }
}
