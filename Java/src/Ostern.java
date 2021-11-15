import java.io.IOException;

public class Ostern {

    public static void main(String[] args) throws IOException {

        String antwort;

        do {
            
            int jahr;
            int a, b, c, d = 0, e = 0, m = 0, n = 0, datum;
            System.out.println("Für welches Jahr soll Ostern ermittelt werden?");
            jahr = IO.readInteger();

            a = jahr % 19;
            b = jahr % 4;
            c = jahr % 7;

            if (jahr >= 1583 && jahr < 1699) {
                m = 22;
                n = 2;
            } else if (jahr >= 1700 && jahr <= 1799) {
                m = 23;
                n = 3;
            } else if (jahr >= 1800 && jahr <= 1899) {
                m = 23;
                n = 4;
            } else if (jahr >= 1900 && jahr <= 2099) {
                m = 24;
                n = 5;
            } else if (jahr >= 2100 && jahr <= 2199) {
                m = 24;
                n = 6;
            } else if (jahr >= 2200 && jahr <= 2299) {
                m = 25;
                n = 0;
            }
            d = (19 * a + m) % 30;
            e = (2 * b + 4 * c + 6 * d + n) % 7;

            if ((22 + d + e) > 31) {
                datum = (22 + d + e - 31);


                if (datum == 26) {
                    datum = 19;
                } else if (datum == 25 && d == 28 && e == 6 && a > 10) {
                    datum = 18;
                }
                System.out.println("Ostern ist im Jahr\t" + jahr + "\tam\t" + datum + ".04!");
            } else {
                datum = 22 + d + e;
                System.out.println("Ostern is im Jahr\t" + jahr + "\tam\t" + datum + ".03!");
            }
            System.out.println("\nweiter Bearbeitung Ja(J) / Nein(N)");
            antwort = IO.readString();
        } while (antwort.equalsIgnoreCase("J"));
    }
}
