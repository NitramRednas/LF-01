import java.io.IOException;

public class KreiszahlPi {

    public static void main(String[] args) throws IOException {

        System.out.println("Defenieren sie n");
        double n = IO.readDouble();
        double ergebnis = 0;

        for (int i = 0; i <= n; i++) {
            ergebnis += (Math.pow(-1, i) / (2 * i + 1));
        }
        ergebnis *= 4;
        double div = Math.PI - ergebnis;
        System.out.println(ergebnis);
        System.out.println(div);
    }
}
