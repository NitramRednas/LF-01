import java.io.IOException;

public class Zellwachstum {

    public static void main(String[] args) throws IOException {
        String eingabe = IO.readString();
        do {

            System.out.println("Bitte die Tageslaufzeit bestimmen");
            int tag = IO.readInteger();
            System.out.println("Bestimmen sie die Zellmenge");
            double zellmenge = IO.readDouble();
            System.out.println("Geben sie den Wachstumsfaktor an");
            double faktor = IO.readDouble();

            System.out.println("Laufdauer\t\t\t" + tag + "\nStartzellmenge\t\t" + zellmenge + "\nWachstumsfaktor\t\t" + faktor + "\n");

            System.out.println("Tage\t\t\tZellmenge");
            for (int i = 0; i <= tag; i++) {
                System.out.println(i + "\t\t\t\t" + zellmenge);
                zellmenge = zellmenge * faktor;

            }
            System.out.println("Wollen sie noch einmal berechnen?Ja(J) oder Nein(N)");
            eingabe = IO.readString();
        } while (eingabe.equalsIgnoreCase("j"));
    }
}
