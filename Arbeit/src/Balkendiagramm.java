import java.io.IOException;

public class Balkendiagramm {

    public static void main(String[] args) throws IOException {


        System.out.println("Wie viele Kanditaten sind im Rennen?");
        int anzahl = IO.readInteger();

        System.out.println("Erfassen sie jetzt die Prozentuale Verteilung des Votings");
        double[] a = IO.readdoubleArray1D(anzahl);


        System.out.println("Ergebnis");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Kanditat  " + (i + 1) + "\t");
            for (int n = 0; n < a[i]; n++) {
                System.out.print("*");
            }
            System.out.println("\t" + a[i] + "%");
            System.out.println();
        }

    }
}
