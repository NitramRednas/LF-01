import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    public static String readstring() throws IOException {

        /**
         * Liest einen Text aus der Konsole ein
         * @returns den eingegebenen Text
         * @throws IOException
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe;
        eingabe = br.readLine();
        return eingabe;

    }





}
