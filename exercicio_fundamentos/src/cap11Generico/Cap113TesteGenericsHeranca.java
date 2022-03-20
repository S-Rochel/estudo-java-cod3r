// Teste do uso de Generics com Herança
package cap11Generico;

public class Cap113TesteGenericsHeranca {
    public static void main(String[] args) {
        
        // O tipo do dado já foi especificado na classe "Cap113GenericsComHeranca" via Herança, e não preciso especificar aqui na hora de estânciar o objeto.
        Cap113GenericsComHeranca caixaA = new Cap113GenericsComHeranca();
        caixaA.setGuardar(10);
        Integer coisaA = caixaA.getAbrir();
        System.out.println(coisaA); // resp 10

    }
}
