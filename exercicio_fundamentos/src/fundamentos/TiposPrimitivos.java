package fundamentos;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 12; // valores máximos -128 +127
        short numeroDeVoos = 32767; // valores máximos -32768 +32767
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; // posso trocar a separação de ponto para anderline, e no caso do long devemos colocar a letra L para indicar que esse valor será um literal, já que por padrão o Java reconhece como literal inteiro o tipo int

        // Tipos numéricos reais
        float salario = 11_445.44F; // como por padrão o literal de ponto flutuante em Java é double e não float, temos que colocar F para indicar que esse literal será do tipo float
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // tipo caractere
        char status = 'A'; // A = Ativo
        char status2 = '\u0010'; // também pode ser usado o código unicode


        // Para utilizar todas as variáveis

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status: " + status);
        System.out.println("Unicode: " + status2);

    }
}
