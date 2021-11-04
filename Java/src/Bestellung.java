import java.io.IOException;

public class Bestellung {

    public static void main(String[] args) throws IOException {

        double preis;


            System.out.println("Es muss die gleiche Anzahl von Schrauben und Muttern gekauft werden\n" + "Wie viele Schrauben wollen sie kaufen?");
            int schrauben = IO.readInteger();

            System.out.println("Wieviele Muttern wollen sie kaufen?");
            int muttern = IO.readInteger();

            System.out.println("Wieviele Unterlegscheiben wollen sie kaufen?");
            int unterlegscheiben = IO.readInteger();

            if (schrauben == muttern) {

               preis = (schrauben * 0.05) + (muttern * 0.03) + (unterlegscheiben * 0.01);
                System.out.println("Ihre Bestellung kostet\t" + preis + "€");
            }
            else
            {
                System.out.println("Dieser Kauf ist nicht möglich. Versuchen Sie es nochmal");
            }

    }
}