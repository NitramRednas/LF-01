import java.io.IOException;

public class PQ_Formel_XXL {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie a an");
        double a = IO.readDouble();

        System.out.println("geben sie b an");
        double b = IO.readDouble();

        System.out.println("geben sie c an");
        double c = IO.readDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            System.out.println("Die Berechnung ist nicht Möglich");
        } else if (d == 0) {

            double x2 = (b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            System.out.println("Die Nullstelle lautet =\t" + x2);
        } else if (d > 0) {

            double x1 = (b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double x2 = (b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("Das Ergebniss für X1 lautet =\t" + x1 + "\nDas Ergebniss für X2 lautet =\t" + x2);

        }


    }
}
