import java.io.IOException;

public class Quadratsummen {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie die Zahl ein bis zu der Quadriert werden soll");
        int basis = IO.readInteger();
        double fact = 2;
        double summe = 0;

        for (int i = 2; i <= basis; i++) {

            fact = fact * fact;
            System.out.println("Das Ergebniss von Zahl\t" + i + "\tist\t=\t" + fact);
        }
        System.out.println("\nDie Endsumme beträgt\t=\t" + fact);
    }
}
