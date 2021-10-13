import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErweiteterTaschenrechner {

    public static void main(String[] args) throws IOException {

        //Nutzereingaben
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String antwort;

        String operator = br.readLine().trim().replace('P', 'p').replace('W', 'w');

        do {

            schreibmenue();

            //Rechenoperatonen

            if (operator.equals("+")) {
                plus();

            } else if (operator.equals("-")) {
                minus();

            } else if (operator.equals("*")) {
                multiplikation();

            } else if (operator.equals("/")) {
                division();

            } else if (operator.equals("p")) {
                potenzen();

            } else if (operator.equals("w")) {
                wurzeln();
            }
            {
                wiederholen();
                antwort = br.readLine().trim().replace("j", "Ja").replace("J", "Ja");
            }
        } while (antwort.equalsIgnoreCase("Ja"));

    }

    //METHODEN


    private static void schreibmenue() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Folgende Rechneoperationen stehen zur Auswahl:");
        System.out.println("[+] für Addition");
        System.out.println("[-] für Suptraktion");
        System.out.println("[*] für Multiplikation");
        System.out.println("[/] für Division");
        System.out.println("[p] für Potenzieren");
        System.out.println("[w] für Wurzelziehen");

        String operator = br.readLine().trim().replace('P', 'p').replace('W', 'w');

        System.out.println("deine Auswahl:" + operator);
    }

    private static void plus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie den ersten Summanten an");
        String eingabe = br.readLine();
        double summantx = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Geben Sie den zweiten Summanten an");
        eingabe = br.readLine();
        double summanty = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Das Ergebniss lautet");
        System.out.println(summantx + summanty);
    }

    private static void minus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie den Minuent an");
        String eingabe = br.readLine();
        double minuent = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Geben Sie den Substant an");
        eingabe = br.readLine();
        double substant = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Das Ergebniss lautet");
        System.out.println(minuent - substant);
    }

    private static void multiplikation() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie Faktor X an");
        String eingabe = br.readLine();
        double faktorx = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Geben Sie Faktor Y an");
        eingabe = br.readLine();
        double faktory = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Das Ergebniss lautet");
        System.out.println(faktorx * faktory);
    }

    private static void division() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie den Divisor an");
        String eingabe = br.readLine();
        double divisor = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("geben Sie den Divident an");
        eingabe = br.readLine();
        double divident = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Das Ergebniss lautet");
        System.out.println(divisor / divident);
    }

    private static void potenzen() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie die Basis an");
        String eingabe = br.readLine();
        double basis = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Geben Sie den Exponenten an");
        eingabe = br.readLine();
        double exponont = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Das Ergebniss lautet");
        System.out.println(Math.pow(basis, exponont));
    }

    private static void wurzeln() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie den Radikant an");
        String eingabe = br.readLine();
        double radikant = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Das Ergebniss lautet");
        System.out.println(Math.sqrt(radikant));
    }

    private static void wiederholen() {
        System.out.println("Möchten Sie nochmal rechen?");
        System.out.println("Ja \t  Nein");

    }

}
