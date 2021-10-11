import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Taschenrechner {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte geben sie die erste Zahl ein");
        double x = Double.parseDouble(br.readLine().trim().replace(',','.'));

        System.out.println("Bitte geben sie den Operator an ( + ; - ; / ; * )");
        String operator = br.readLine().trim();

        System.out.println("Bitte geben sie die zweite Zahl ein");
        double y = Double.parseDouble(br.readLine().trim().replace(',', '.'));


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
        //Manuelle Eingabenversion


        // double x = ;
        //double  y = ;

        //double Summe1 = x+y;

        //double Summe2 = x-y;

        //double Summe3 = x*y;

        //double Summe4 = x/y;

        //System.out.println("Zahl X =    \t " + x);
        //System.out.println("Zahl Y =    \t " +  y);


        //System.out.println("Summe =     \t " + Summe1);
        //System.out.println("Differenz = \t " + Summe2);
        //System.out.println("Produkt =   \t " + Summe3);
        // System.out.println("Quotient =  \t " + Summe4);