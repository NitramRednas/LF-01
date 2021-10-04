import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksumgleichung {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a;
        double b;
        double c;
        double s;
        double A;


        System.out.println("Geben sei den Wert für a ein");
        String eingabe = br.readLine();
        a = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Geben sei den Wert für b ein");
        eingabe = br.readLine();
        b = Double.parseDouble(eingabe.trim().replace(',', '.'));

        System.out.println("Geben sei den Wert für c ein");
        eingabe = br.readLine();
        c = Double.parseDouble(eingabe.trim().replace(',', '.'));


        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            s = ((a + b + c) / 2);
            A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Der Umfang beträgt          \t" + s);
            System.out.println("Der Flächeninhalt beträgt   \t" + A);

        }

        else System.out.println("Das Dreieck ist nicht möglich");

    }
}
