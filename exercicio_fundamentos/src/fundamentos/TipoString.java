package fundamentos;

public class TipoString {
    
    public static void main(String[] args) {
        System.out.println("Olá mundo!".charAt(4)); // qual é a letra no index 4.

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Boa")); // testa se a string começa com o prefixo especificado, retorna true ou false.
        System.out.println(s.endsWith("Boa"));
        System.out.println(s.endsWith("Tarde"));
        System.out.println(s.endsWith("tarde"));

        System.out.println(s.length());

        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome1 = "Pedro";
        var nome2 = "Henrique";
        var idade = 33;
        var salario = 12345.678;

        String maisUmaFrase = "Nome: " + nome1 + " " + nome2 + "\nIdade:" + idade + "\nSalário: " + salario;
        System.out.println(maisUmaFrase + "\n");

        System.out.printf("Nome: %s %s \nIdade: %d \nSalário: %.2f.", nome1 , nome2, idade, salario);
    }
}
