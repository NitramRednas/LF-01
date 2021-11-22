import java.io.IOException;

public class PQ_Formel_XL {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie p an");
        double p = IO.readDouble();

        System.out.println("geben sie q an");
        double q = IO.readDouble();

        double d = Math.pow(p / 2, 2) - q;


        if (d < 0) {
            System.out.println("Die Berechnung ist nicht Möglich");
        } else if (d == 0) {
            System.out.println("Die Nullstelle =\t" + -p / 2);
        } else if (d > 0) {
            double x1, x2;
            x1 = -p / 2 + Math.sqrt(d);
            x2 = -p / 2 - Math.sqrt(d);
            System.out.println("X1 =\t" + x1 + "X2 =\t" + x2);
        }

    }
}


