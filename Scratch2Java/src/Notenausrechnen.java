import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenausrechnen

{
    public static void main(String[] args) throws IOException {

        //Nachricht an Nutzer
        System.out.println("Geben sie Ihre Prozentzahl ein");

        //Textabfrage an den Nutzer + erkennung/korrigierung der Eingabe
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        double Prozent = Double.parseDouble(eingabe.trim().replace(',', '.'));

        //Definition
        int Note;

        //Variablen
            if (Prozent >= 85) {
                Note = 1;
        }
        else

            if (Prozent >= 73) {
                Note = 2;
        }
        else

            if (Prozent >= 59) {
                Note = 3;
        }
        else



            if (Prozent >= 45) {
                Note = 4;
        }
        else



            if (Prozent >= 27) {
                Note = 5;
        }
        else

            Note=6;

        //Ausgabe der Konsole
        System.out.println("Ihre Noe ist eine \t" + Note  );

    }
}

//    >=85         =1
//    85 > - >=73  =2
//    73 > - >=59  =3
//    59 > - >=45  =4
//    45 > - >=27  =5
//    <27          =6