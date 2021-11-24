import java.io.IOException;

public class Temperatur {

    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben sie die Temperatur an Tag 1 an");
        double tag1 = IO.readDouble();
        System.out.println("Bitte geben sie die Temperatur an Tag 2 an");
        double tag2 = IO.readDouble();
        System.out.println("Bitte geben sie die Temperatur an Tag 3 an");
        double tag3 = IO.readDouble();
        System.out.println("Bitte geben sie die Temperatur an Tag 4 an");
        double tag4 = IO.readDouble();
        System.out.println("Bitte geben sie die Temperatur an Tag 5 an");
        double tag5 = IO.readDouble();
        System.out.println("Bitte geben sie die Temperatur an Tag 6 an");
        double tag6 = IO.readDouble();
        System.out.println("Bitte geben sie die Temperatur an Tag 7 an");
        double tag7 = IO.readDouble();

        double mittelwert = (tag1 + tag2 + tag3 + tag4 + tag5 + tag6 + tag7) / 7;
        System.out.println("Der Mittelwert beträgt\t" + Math.round(mittelwert * 100.0) / 100.0);

        double x;

        if (tag1 < tag2) {
            x = tag2;
        } else {
            x = tag1;
        }
        if (tag3 > x) {
            x = tag3;
        }
        if (tag4 > x) {
            x = tag4;
        }
        if (tag5 > x) {
            x = tag5;
        }
        if (tag6 > x) {
            x = tag6;
        }
        if (tag7 > x) {
            x = tag7;
        }
        System.out.println("Der Maximalwert beträgt\t" + Math.round(x * 100.0) / 100.0);

        double y;

        if (tag1 > tag2) {
            y = tag2;
        } else {
            y = tag1;
        }
        if (tag3 < y) {
            y = tag3;
        }
        if (tag4 < y) {
            y = tag4;
        }
        if (tag5 < y) {
            y = tag5;
        }
        if (tag6 < y) {
            y = tag6;
        }
        if (tag7 < y) {
            y = tag7;
        }
        System.out.println("Der Minimalwert beträgt\t" + Math.round(y * 100.0) / 100.0);

        double spannweite;

        if (x < y) {
            spannweite = y - x;
        } else {
            spannweite = x - y;
        }
        System.out.println("Die Spannweite beträgt\t" + Math.round(spannweite * 100.0) / 100.0);

        //Maximale Differenz
        double d1, d2, d3, d4, d5, d6, d7;
        double max;

        d1 = tag1 - tag2;
        if (d1 < 0) {
            d1 = d1 * (-d1);
        }
        d5 = tag2 - tag3;
        if (d5 < 0) {
            d5 = d5 * (-d5);
        }
        d2 = tag3 - tag4;
        if (d2 < 0) {
            d2 = d2 * (-d2);
        }
        d6 = tag4 - tag5;
        if (d6 < 0) {
            d6 = d6 * (-d6);
        }
        d3 = tag5 - tag6;
        if (d3 < 0) {
            d3 = d3 * (-d3);
        }
        d4 = tag6 - tag7;
        if (d4 < 0) {
            d4 = d4 * (-d4);
        }


        max = Math.max(d1, d2);

        if (Math.max(d3, d4) > max) {
            max = Math.max(d3, d4);
        }
        if (Math.max(d5, d6) > max) {
            max = Math.max(d5, d6);
        }
        if (max < 0) {
            max = max * (-max);
        }
        System.out.println("Die Maximale Differenz beträgt\t" + max);
    }

}
