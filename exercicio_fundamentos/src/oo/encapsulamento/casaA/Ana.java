package oo.encapsulamento.casaA;

public class Ana {
    
    @SuppressWarnings("unused") // somente para tirar as advertências de que hà atributos que não estão sendo usados.
    private String segredo = "..."; // private - visivel somente dentro da própria classe.
    String facoDentroDeCasa = "..."; // default - visivel somente dentro do pacote.
    protected String formaDeFalar = "..."; // protected - visivel dentro do pacote e transmitido por herança.
    public String todosSabem = "..."; // public - viisivel para todos.

}
