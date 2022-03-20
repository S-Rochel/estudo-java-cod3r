// Cap 11 - Testes 
package cap11Generico;

public class Cap111Teste {
    public static void main(String[] args) {

        // Teste SEM Usar o  uso do Generics
        Cap111GenericsExemploSem caixaA = new Cap111GenericsExemploSem();
        caixaA.setGuardar(2.3);
        Double coisaA = (Double) caixaA.getAbrir(); // necessário fazer um cast, pois o método retorna um tipo Object, é necessário saber o tipo que é o atributo.
        System.out.println(coisaA); // resp: 2.3

        Cap111GenericsExemploSem caixaB = new Cap111GenericsExemploSem();
        caixaB.setGuardar("Olá");
        String coisaB = (String) caixaB.getAbrir(); // necessário fazer um cast, pois o método retorna um tipo Object, é necessário saber o tipo que é o atributo.
        System.out.println(coisaB); // resp: 2.3


        // Teste COM o uso do Generics
        Cap112GenericsExemploCom <Double> caixaC = new Cap112GenericsExemploCom<>();
        caixaC.setGuardar(2.3333);
        Double coisaC = caixaC.getAbrir();
        System.out.println(coisaC); // resp: 2.3333

        Cap112GenericsExemploCom <String> caixaD = new Cap112GenericsExemploCom<>();
        caixaD.setGuardar("Testando");
        String coisaD = caixaD.getAbrir();
        System.out.println(coisaD); // resp: Testando


        // Teste com estância da classe "Cap114GenericsComHeranca", que obrigatoriamente terá que ser do tipo* "Number(Integer ou Double)", pois foi colocado está restrição no Generics desta classe.
        Cap114GenericsComHeranca<Double> caixaE = new Cap114GenericsComHeranca<>();
        caixaE.setGuardar(2.9);
        Double coisaE = caixaE.getAbrir();
        System.out.println(coisaE); // resp: 2.9
    }
}
