package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32) * 5/9 = ºC, transformar temperatura fahrenheit em celsius.
        // final = indica uma constante.
        // Variável do tipo constante colocar em caixa alta.
        final double AJUSTE = 32;
        final double FATOR = 5 / 9.0;
        double tempF = 86;
        double tempC = (tempF - AJUSTE) * FATOR;
        System.out.println(tempF + "° Fahrenheit é igual à " + tempC + "° Celsius");
        tempF = 150;
        tempC = (tempF - AJUSTE) * FATOR;
        System.out.println(tempF + "° Fahrenheit é igual à " + tempC + "° Celsius");
    }
    
}