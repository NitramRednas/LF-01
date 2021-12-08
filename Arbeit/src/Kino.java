import java.io.IOException;

public class Kino {

    String O;
    String X;

    private static String[][] erzeugeSaal() throws IOException {

        System.out.println("Wie viele Sitze pro Reihe");

        int zeilen = IO.readInteger();

        System.out.println("Wie viele Sitzreihen");

        int spalten = IO.readInteger();

        String[][] saal = IO.readStringArray2D(zeilen, spalten);

        return saal;
    }

    private static void anzeigensaal(String[][] saal) {

        System.out.println("Die Sitze sind wiefolgt Belegt:");
        for (int i = 0; i < saal.length; i++){
            System.out.print("\t" + saal[i]);
            for (int j = 0; j < saal.length; j ++){
                System.out.print("\t" + saal[j]);
                System.out.println();
            }
        }

    }

    private static void reservierenPlatz(String[][] saal) {

        System.out.println("welchen Platz möchtest du vergeben?");
        

    }


}
