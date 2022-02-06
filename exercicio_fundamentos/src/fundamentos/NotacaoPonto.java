package fundamentos;

public class NotacaoPonto {
    
    public static void main(String[] args) {
        
        // Com o operador ponto temos acesso aos atributos e comportamentos das coisas.
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String x = "San".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
            .replace("X", x)
            .toUpperCase()
            .concat("!!!"); // Enquanto estiver retornando uma String posso ir chamando um método.
        System.out.println(y);

        // Obs: Tipos primitivos não tem o operador ponto "."
    }
}
