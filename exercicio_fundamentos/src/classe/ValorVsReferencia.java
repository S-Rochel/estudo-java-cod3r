package classe;

public class ValorVsReferencia {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)
        a++;
        b--;
        System.out.println("a: "+ a);
        System.out.println("b" + b);

        ClasseData d1 = new ClasseData(1, 6, 2022);
        ClasseData d2 = d1; // atribuição por refêrencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
    }
}
