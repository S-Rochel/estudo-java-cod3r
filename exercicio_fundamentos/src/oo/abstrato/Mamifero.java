package oo.abstrato;

public abstract class Mamifero extends Animal{
    
    @Override
    public String mover() {        
        return "Usaando as patas";
    }

    public abstract String mamar();
}
