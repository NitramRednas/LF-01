import java.io.IOException;

public class Maexchen {

    public static void main(String[] args) throws IOException {

        System.out.println("Die Erste Würfel zahl ist?");
        int w1 = IO.readInteger();
        System.out.println("Die Zweite Würfelnzahl ist?");
        int w2 = IO.readInteger();

        if (w1 + w2 == 3) {
            System.out.println("MÄXCHEN\t\t + 1000 Punkte");
        }
        if (w1 == w2) {
            int pasch = (w1 + w2) * 100;
            System.out.println("Ein Pasch\t\t" + pasch + "\tPunkte");
        }
        int punkte;
        if (w1 < w2) {
            punkte = w2 * 10 + w1;
            System.out.println("Es wurden\t\t" + punkte + "\tPunkte erreicht");
        }
        if (w2 < w1) {
            punkte = w1 * 10 + w2;
            System.out.println("Es wurden\t\t" + punkte + "\tPunkte erreicht");
        }

    }
}
