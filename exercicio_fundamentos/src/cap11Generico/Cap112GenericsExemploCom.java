// Cap 11.2 - Exemplo Básico com Generics
package cap11Generico;

// Para criar um Generics coloco na frente do nome da classe aspas angulares com o nome para o Generics.
public class Cap112GenericsExemploCom<TIPO> {
    
    private TIPO coisa;

    public void setGuardar(TIPO coisa) {
        this.coisa = coisa;
    }
    public TIPO getAbrir() {
        return coisa;
    }
}
