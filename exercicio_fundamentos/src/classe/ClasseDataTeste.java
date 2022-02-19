package classe;

public class ClasseDataTeste {
    public static void main(String[] args) {
        
        // Intânciar duas datas.
        ClasseData data1 = new ClasseData();
        data1.ano = 2017;
        data1.mes = 4;
        data1.dia = 25;

        ClasseData data2 = new ClasseData();
        data2.ano = 2018;
        data2.mes = 10;
        data2.dia = 31;

        System.out.printf("A primeira data é: %d/%d/%d", data1.dia, data1.mes, data1.ano);
        System.out.println();
        System.out.printf("A segunda data é: %d/%d/%d", data2.dia, data2.mes, data2.ano);
    }
}
