import java.io.IOException;

public class Wiederstand {

    public static void main(String[] args) throws IOException {

        System.out.println("Rechnen Sie mit einer Parallelschaltung(p) oder einer Reihnschaltung(R)?");
        String eingabe = IO.readString();

        if (eingabe.equalsIgnoreCase("p")) {
            System.out.println("Geben sie die Omen für R1 an");
            double r1 = IO.readDouble();

            System.out.println("Geben sie die Omen für R2 an");
            double r2 = IO.readDouble();

            double paralel = (r1 * r2) + (r1 + r2);

            System.out.println("Der Wiederstand beträgt\t" + paralel + "\tomen");

        }

        if (eingabe.equalsIgnoreCase("R")) {
            System.out.println("Geben sie die Omen für R1 an");
            double r1 = IO.readDouble();

            System.out.println("Geben sie die Omen für R2 an");
            double r2 = IO.readDouble();

            double reihe = r1 + r2;

            System.out.println("Der Wiederstand beträgt\t" + reihe + "\tomen");
        }
    }
}
