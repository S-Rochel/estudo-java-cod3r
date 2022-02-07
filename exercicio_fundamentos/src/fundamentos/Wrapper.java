package fundamentos;

public class Wrapper {
    
    public static void main(String[] args) {
        // Whapper é uma classe especial derivada dos tipos primitivos.
        // byte = primitivo, Byte = wrapper (aceita métodos)
        Byte b = 100;
        System.out.println(b.byteValue());

        // short = primitivo, Short = wrapper (aceita métodos)
        Short s = 1000;
        System.out.println(s.shortValue());
        
        // int = primitivo, Integer = wrapper (aceita métodos)
        Integer i = 10000;
        System.out.println(i.intValue());
        Integer inteiro = Integer.parseInt("1111"); // com esse método posso converter uma string para um inteiro.
        System.out.println(inteiro);

        // long = primitivo, Long = wrapper (aceita métodos)
        Long l = 100000L;
        System.out.println(l.longValue());

        // boolean = primitivo, Boolean = wrapper (aceita métodos)
        Boolean bo1 = true;
        System.out.println(bo1);
        Boolean bo2 = Boolean.parseBoolean("false");
        System.out.println(bo2);

        // char = primitivo, Character = wrapper (aceita métodos)
        Character c = '#';
        System.out.println(c.charValue());

        // float = primitivo, Float = wrapper (aceita métodos)
        Float f = 123.10F;
        System.out.println(f.floatValue());

        // double = primitivo, Double = wrapper (aceita métodos)
        Double d = 1234.5678;
        System.out.println(d.doubleValue());
    }
}
