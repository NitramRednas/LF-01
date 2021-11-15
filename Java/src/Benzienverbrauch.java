import java.io.IOException;

public class Benzienverbrauch {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie ihren Benzienverbrauch in Litern an");
        double liter = IO.readDouble();

        System.out.println("Geben sie die gefahrene Distanz in Kilometern an");
        double km = IO.readDouble();


        if (liter == 0) {
            System.out.println("Bitte geben sie den Verbrauch nochmal an");
        } else if (liter < 0) {
            System.out.println("Eine Negativer Verbrauch ist nicht möglich, geben sie den Verbrauch erneut an");
        }

        if (km == 0) {
            System.out.println("Bitte geben sie die Distanz nochmal an. Eine Rechnung mit 0 ist nicht möglich");
        } else if (km < 0) {
            System.out.println("Eine Negative Distanz führt zu einer Fehlerhaften rechnung. Geben sie die Distanz Positiv an");
        }
        double durchscnitt = 100 * (liter / km);
        System.out.println("Der Durchscnitsverbrauch beträgt\t" + durchscnitt + "\tLiter auf 100 Km");

    }
}

