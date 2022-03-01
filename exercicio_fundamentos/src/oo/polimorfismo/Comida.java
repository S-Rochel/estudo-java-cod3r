package oo.polimorfismo;

public class Comida {

    // Atributos
    private double peso;

    // Construtor    
    public Comida(double peso) {
        setPeso(peso);
    }

     // Métodos getters e setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
        this.peso = peso;
        }
    } 
}
