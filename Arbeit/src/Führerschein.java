import java.io.IOException;

public class Führerschein {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind sie?");
        int alter = IO.readInteger();

        if (alter <= 14)
        {
            System.out.println("Du darfst Bobby Car oder Fahrrad fahren");
        }
        else
        if (alter <= 16 )
        {
            System.out.println("Du darfst schon 50er fahren");
        }
        else
        if (alter < 18)
        {
            System.out.println("Due darfst schon 125er fahren, aber noch kein Auto");
        }
        else
        {
            System.out.println("Du darfst Auto fahren");
        }
    }
}
