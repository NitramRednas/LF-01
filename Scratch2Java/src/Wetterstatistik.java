import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wetterstatistik {

    public static void main(String[] args) throws IOException {

        //Nutzereingabeabfrage

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Niederschlagswerte für April");
        String eingabe = br.readLine();
        double april = Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.println("Niederschlagswerte für Mai");
        eingabe = br.readLine();
        double mai= Double.parseDouble(eingabe.trim().replace(',','.'));

        System.out.println("Niederschlagswerte für Juni");
        eingabe = br.readLine();
        double juni= Double.parseDouble(eingabe.trim().replace(',','.'));


        //Definition

        double mittelwert;

        //Rechnung

        mittelwert=(april+mai+juni)/3;

        //Output

        System.out.println("Wetterstatistik");
        System.out.println("April       \t" + april);
        System.out.println("Mai         \t"  + mai);
        System.out.println("Juni        \t"   + juni);
        System.out.println("Mittelwert  \t" + mittelwert);
    }

}
