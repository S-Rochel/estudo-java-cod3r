package classe;

public class ClasseDataTeste {
    public static void main(String[] args) {
        
        // Intânciar duas datas.
        ClasseData data1 = new ClasseData();
        data1.ano = 2017;
        data1.mes = 4;
        data1.dia = 25;

        ClasseData data2 = new ClasseData(31, 10, 2018);
        // data2.ano = 2018;
        // data2.mes = 10;
        // data2.dia = 31;

        ClasseData data3 = new ClasseData();

        System.out.println(data1.ano + " " + data1.dataFormatada());
        System.out.println();
        System.out.println(data2.ano + " " + data2.dataFormatada() + " ");
        System.out.println();
        System.out.println(data3.ano + " " + data3.dataFormatada() + " ");
    }    
}
