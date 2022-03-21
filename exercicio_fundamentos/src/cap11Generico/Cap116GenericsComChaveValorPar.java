// Cap 11.6 - Criando uma Estrutura Chave/Valor com Generics.
package cap11Generico;

public class Cap116GenericsComChaveValorPar <C, V> {
    // Atributos:
    private C chave;
    private V valor;

    // Construtor:
    public Cap116GenericsComChaveValorPar(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    // Métodos Getters e Setters:
    public C getChave() {
        return chave;
    }    
    public void setChave(C chave) {
        this.chave = chave;
    }
    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }


    
    // Métodos para comparar igualdade entre chaves:
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chave == null) ? 0 : chave.hashCode());
        return result;
    }

    @Override
    // @SuppressWarnings("rawtypes") // para suplimir alertas gerados pelo eguals ou com o acrescimo de <?, ?>:
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cap116GenericsComChaveValorPar <?, ?> other = (Cap116GenericsComChaveValorPar <?, ?>) obj;
        if (chave == null) {
            if (other.chave != null)
                return false;
        } else if (!chave.equals(other.chave))
            return false;
        return true;
    }    
}
