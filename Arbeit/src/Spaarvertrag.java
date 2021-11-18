import java.io.IOException;

public class Spaarvertrag {
    public static void main(String[] args) throws IOException {

        String eingabe;

        do {


            System.out.println("Bitte Kapital angeben");
            double kapitalismus = IO.readDouble();
            System.out.println("Geben sie den Zinssatz an");
            double zensen = IO.readDouble();
            System.out.println("Bitte die laufzeit in Jahren angeben");
            int jahre = IO.readInteger();

            double geld;

            System.out.println("Jahr\t\t" + "Anfangskapital\t\t" + "Zinsbetrag\t\t" + "Jahresendbetrag");

            for (int i = 1; i <= jahre; i++) {

                geld = kapitalismus * (zensen / 100);
                System.out.println(Math.round(i) + "\t\t\t" + Math.round(kapitalismus * 100.0) / 100.0 + "\t\t\t\t" + Math.round(geld * 100.0) / 100.0 + "\t\t\t\t" + Math.round(kapitalismus * 100.0 + geld * 100.0) / 100.0);
                kapitalismus = geld + kapitalismus;

            }
            System.out.println("Wollen sie noch einmal berechnen?Ja(J) oder Nein(N)");
            eingabe = IO.readString();
        } while (eingabe.equalsIgnoreCase("j"));
    }
}
