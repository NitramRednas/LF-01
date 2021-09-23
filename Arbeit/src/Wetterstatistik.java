import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wetterstatistik {

    public static void main(String[] args) throws IOException {

        //Nutzereingabeabfrage

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
                double april = Double.parseDouble(text.trim().replace(',','.'));



        //Definition



        double mittelwert;

        //Wetterdaten

        april=13.4;


        //Rechnung

        mittelwert=(april+)/3;

        //Output

        System.out.println("Wetterstatistik");
        System.out.println("April       \t" + april);
        System.out.println("Mai         \t"  + mai);
        System.out.println("Juni        \t"   + juni);
        System.out.println("Mittelwert  \t" + mittelwert);
    }

}
