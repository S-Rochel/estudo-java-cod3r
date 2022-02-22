package classe;

public class AreaCircunferencia {
    
    // Atributos. "final" para constantes.
    double raio;
    static final double pi = 3.14;

    // Construtor.
    AreaCircunferencia(double raioInicial) {
        this.raio = raioInicial;
    }

    // Método.
    double area() {
        return pi * raio * raio;
    }
}
