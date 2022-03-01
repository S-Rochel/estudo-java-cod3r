package oo.polimorfismo;

public class Pessoa {
    
    // Atributos
    private double peso;

    // Construtor    
    public Pessoa(double peso) {
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

    /* Métodos comer, polimorfismo stático
    public void comer(Arroz arroz) {
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao) {
        this.peso += feijao.getPeso();
    }
    public void comer(Sorvete sorvete) {
        this.peso += sorvete.getPeso();
    }
    */

    // Métodos comer, polimorfismo dinâmico (para usar o polimorfismo dinâmico somente através de herança).
    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }
}
