package lambda;

@FunctionalInterface // Diz que a interface acita apenas um método isso é necessário para que possamos aplicar uma função Lambda nesta interface.
public interface Calculo {    
    public abstract double executar(double a, double b);    
}
