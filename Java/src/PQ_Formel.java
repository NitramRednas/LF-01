import java.io.IOException;

public class PQ_Formel {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie p an");
        double p = IO.readDouble();

        System.out.println("geben sie q an");
        double q = IO.readDouble();

        double x1 = -p/2+Math.sqrt(Math.pow(p/2, 2)-q);

        double x2 = -p/2-Math.sqrt(Math.pow(p/2, 2)-q);

        System.out.println("Das Ergebniss für X1 lautet =\t"+x1+"\nDas Ergebniss für X2 lautet =\t"+x2);

    }
}
