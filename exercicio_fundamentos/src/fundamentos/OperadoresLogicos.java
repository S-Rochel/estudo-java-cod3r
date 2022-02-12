package fundamentos;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        System.out.println("AND - Rsesultado: " + (condicao1 && condicao2));
        System.out.println("OR - Rsesultado: " + (condicao1 || condicao2));
        System.out.println("XOR - Rsesultado: " + (condicao1 ^ condicao2));
        System.out.println("NOT - Rsesultado: " + (!condicao1));
        System.out.println("NOT - Rsesultado: " + (!condicao2));

        System.out.println("Tabela verdade AND (E): ");
        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("false && false: " + (false && false));

        System.out.println("Tabela verdade OR (OU): ");
        System.out.println("true || true: " + (true || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));

        System.out.println("Tabela verdade XOR (OU EXCLUSIVO): ");
        System.out.println("true ^ true: " + (true ^ true));
        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("false ^ false: " + (false ^ false));

        System.out.println("Tabela verdade NOT (NEGAÇÂO): ");
        System.out.println("!true: " + (!true));
        System.out.println("!false: " + (!false));
        

    }
}
