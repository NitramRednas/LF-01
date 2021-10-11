import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErweiteterTaschenrechner {
    public static void main(String[] args) throws IOException {

        //Nutzereingaben
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Folgende Rechneoperationen stehen zur Auswahl:");
        System.out.println("[+] für Addition");
        System.out.println("[-] für Suptraktion");
        System.out.println("[*] für Multiplikation");
        System.out.println("[/] für Division");
        System.out.println("[p] für Potenzieren");
        System.out.println("[w] für Wurzelziehen");
        String operator = br.readLine().trim();

        System.out.println("deine Auswahl:" + operator);

        if (operator.equals("p"))

        double basis = Double.parseDouble(br.readLine().trim().replace(',', '.'));
        System.out.println("Bitte die Basis eingeben:"+ basis);

        double exponenten = Double.parseDouble(br.readLine().trim().replace(',', '.'));
        System.out.println("Bitte den Exponenten eingeben:" + exponenten);

        //Rechenoperatonen



        double ergebnis =0;
        if (operator.equals("+")){
            ergebnis = x + y;
            System.out.println("Das Ergebniss ist \t" + ergebnis);
        }
        if (operator.equals("-")){
            ergebnis =x-y;
            System.out.println("Das Ergebniss ist \t" + ergebnis);
        }
        if (operator.equals("/")){
            ergebnis = x/y;
            System.out.println("Das Ergebniss ist \t" + ergebnis);
        }
        if (operator.equals("*")){
            ergebnis = x*y;
            System.out.println("Das Ergebniss ist \t" + ergebnis);
        }




    }
}
