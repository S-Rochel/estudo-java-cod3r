package estruturaDeControle;

public class Switch {
    
    public static void main(String[] args) {
        
        // Uso do Switch sem usar o "break" e usando como exemplo as faixas em caratê.

        String faixa = "marrom";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sadan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei nada...");
        }


        // Uso do Switch com "break".
        String conceito = "";
        int nota = 6;
        switch (nota) {
            case 10: case 9:
            conceito = "A";
            break;
            case 8:
            conceito = "B";
            break;
            case 7:
            conceito = "B";
            break;
            case 6:
            case 5:
            conceito = "C";
            break;
            case 4:
            conceito = "D";
            break;
            case 3:
            conceito = "D";
            break;
            case 2:
            conceito = "E";
            break;
            case 1:
            conceito = "E";
            break;
            default:
            conceito = "invalido";
        }
        System.out.println("O conceito é: " + conceito);

    }
}
