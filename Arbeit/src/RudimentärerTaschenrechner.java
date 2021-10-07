import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner {

    public static void main(String[] args) throws IOException {

        double Ergebnis;

        System.out.println("Bitte geben sie die erste Zahl ein");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        double x = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Bitte geben sie die zweite Zahl ein");

        eingabe = br.readLine();
        double y = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Bitte geben sie den Operator an ( + ; - ; / ; * )");

        eingabe = br.readLine();
        int operator = (int) Double.parseDouble(eingabe.trim().replace(',', '.'));

        if (operator = +){
            Ergebnis = x + y ;
        } System.out.println("Das Ergebniss ist \t" + Ergebnis);

        if (operator = -){
        } x-y=Ergebnis;
        System.out.println("Das Ergebniss ist \t" + Ergebnis);

        if (operator = /){
            Ergebnis = x/y;
        }System.out.println("Das Ergebniss ist \t" + Ergebnis);

        if (operator = *){
            Ergebnis = x*y;
        }System.out.println("Das Ergebniss ist \t" + Ergebnis);




        //Manuelle Eingabenversion

        //System.out.println("Zahl X =    \t " + x);
        //System.out.println("Zahl Y =    \t " +  y);

        //double Summe1 = x+y;
        //System.out.println("Summe =     \t " + Summe1);
        //double Summe2 = x-y;
        //System.out.println("Differenz = \t " + Summe2);
        //double Summe3 = x*y;
        //System.out.println("Produkt =   \t " + Summe3);
        //double Summe4 = x/y;
        //System.out.println("Quotient =  \t " + Summe4);

    }
}
