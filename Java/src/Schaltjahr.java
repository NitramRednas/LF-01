import java.io.IOException;

public class Schaltjahr {

    public static void main(String[] args) throws IOException {

        String antwort;

        do {

            System.out.println("Geben Sie das Jahr ein womit gestartet werdne soll");
            int ajahr = IO.readInteger();

            System.out.println("Bis zu welchem Jahr soll gerechnet werden?");
            int ejahr = IO.readInteger();

            for (int i = ajahr; i <= ejahr; i++) {
                if (i % 4 == 0) {
                    System.out.println(i);
                } else if (i % 400 == 0) {
                    System.out.println(i);
                }
            }

            System.out.println("Möchten sie die Rechnung wiederholen?\n" + "Ja(J) oder Nein(N)");
            antwort = IO.readString();

        } while (antwort.equalsIgnoreCase("J"));
    }

}
