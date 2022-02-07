package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    
    public static void main(String[] args) {
        
        // Conversão de forma implícita, não precisa deixar claro.
        double a = 1; // 1 é inteiro e cabe em  double.
        System.out.println(a);

        // Conversão de forma explícita, precisa deixar claro.
        // float b = 1.0 -> assim dá erro, pois números com ponto flutuante são por padrão do tipo double.
        // float b = 1.0F -> dessa maneira indíco de forma explícita com a letra F que este valor será do tipo float.
        float b = (float) 1.00000000000089; // este tipo de conversãp explícita  é chamada de "CAST", isto indica ao Java que estamos ciente de que haverá perda de informação.


        // O java não analisa o valor mas o tipo, quando quisermos converter um valor de tipo maior para um valor de tipo menor precisamos declarar de forma explícita que queremos essa conversão, ex:
        int c = 4;
        byte d = (byte) c;

    }
}
