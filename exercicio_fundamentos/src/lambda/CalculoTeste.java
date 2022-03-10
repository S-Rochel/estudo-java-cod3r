package lambda;

public class CalculoTeste {
    public static void main(String[] args) {
        
        Calculo calcular = new Somar();
        System.out.println("Soma: " + calcular.executar(2, 3));

        calcular = new Multiplicar();
        System.out.println("Multiplicação: " + calcular.executar(2, 3));
        
    }
}
