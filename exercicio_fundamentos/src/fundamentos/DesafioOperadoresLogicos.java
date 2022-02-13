package fundamentos;

public class DesafioOperadoresLogicos {
    
    public static void main(String[] args) {
        // Se der certo trabalho na terça-feira: V ou F
        // Se der certo trabalho na quinta-feira: V ou F
        // Se os dois trabalhos derem certos: Ir ao Shopping comprar TV de 50 polegadas.
        // Se uma dos dois trabalhos derem certos: Ir ao Shopping comprar TV de 32 polegadas.
        // Se ir ao Shopping e comprar TV de 50 polegadas ou TV de 32 polegadas irão tomar sorvete.
        // Se nenhum trabalho der certo: Ficar em casa.

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        boolean TV50 = trabalhoTerca && trabalhoQuinta;
        boolean TV32 = (trabalhoTerca || trabalhoQuinta) && !TV50;

        boolean tomarSorvete = TV32 || TV50;

        boolean ficarEmCasa = tomarSorvete == false;

        System.out.println("Trabalho na terça deu certo? " + trabalhoTerca);
        System.out.println("Trabalho na quinta deu certo? " + trabalhoQuinta);
        System.out.println("Iremos ao Shopping comprar uma tv e tomar sorvete? " + !ficarEmCasa);
        System.out.println("Compraremos a TV de 32\" polegadas? " + TV32);
        System.out.println("Compraremos a TV de 50\" polegadas? " + TV50);
        
    
    }
}
