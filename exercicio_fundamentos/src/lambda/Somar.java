package lambda;

public class Somar implements Calculo {
    @Override
    public double executar(double a, double b) {
        double x = a + b;
        return x;
    }
}
