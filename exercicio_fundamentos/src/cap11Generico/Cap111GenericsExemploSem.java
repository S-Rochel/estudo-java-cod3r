// Cap 11.1 - Exemplo Básico SEM Generics
package cap11Generico;

public class Cap111GenericsExemploSem {
    
    private Object coisa; // Object e o tipo mais genêrico suportado no Java.

    public void setGuardar(Object coisa) {
        this.coisa = coisa;
    }
    public Object getAbrir() {
        return coisa;
    }
}
