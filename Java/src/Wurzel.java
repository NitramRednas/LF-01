import java.io.IOException;

public class Wurzel {

    public static void main(String[] args) throws IOException {

        System.out.println("Gebn sie die Anfangszahl an, es muss eine positive Ganzzahl sein");
        int anfangswert = IO.readInteger();

        System.out.println("geben sie die Endzahl ein. Sie muss Positiv un eine Ganzzahl sein");
        int entwert = IO.readInteger();

        for (int zaeler = anfangswert; zaeler <= entwert; zaeler += 1) {

            System.out.println("Ganzzahl=\t" + zaeler);
            double wurzel = Math.sqrt(zaeler);
            System.out.println("Wurzel=\t\t" + wurzel);
        }
    }
}


