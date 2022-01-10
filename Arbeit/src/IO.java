import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class IO {

    /**
     * Liest einen Text ein
     *
     * @throws IOException
     * @returns den eingegebenen Text
     */

    public static String readString() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe;
        eingabe = br.readLine();
        return eingabe;
    }

    /**
     * Leist eine Eingabe ein
     *
     * @throws IOException
     * @returns eine Int Variable
     */

    public static Integer readInteger() throws IOException {

        while (true) {

            try {
                String eingabe = IO.readString();
                int zahl = Integer.parseInt(eingabe.trim().replace(',', '.'));
                return zahl;
            } catch (NumberFormatException e) {
                System.out.println("Es ist ein Fehler aufgetreten. Bitte Ganzzahl eingeben");
            }
        }
    }

    /**
     * Liest eine eingabe ein
     *
     * @throws IOException
     * @returns eine double Variable
     */

    public static Double readDouble() throws IOException {

        while (true) {

            try {
                String eingabe = IO.readString();
                double zahl = Double.parseDouble(eingabe.trim().replace(',', '.'));
                return zahl;
            } catch (NumberFormatException e) {
                System.out.println("Es ist ein Fehler aufgetreten. Bitte Kommazahl eingeben");
            }
        }
    }

    /**
     * Liest eine Eingabe ein
     *
     * @return Wahr oder Falsch
     * @throws IOException
     */
    public static boolean readBoolean() throws IOException {

        while (true) {
            String eingabe = IO.readString();
            if (eingabe != null) {
                if ((eingabe.equalsIgnoreCase("Ja"))
                        || (eingabe.equalsIgnoreCase("j"))
                        || (eingabe.equalsIgnoreCase("y"))
                        || (eingabe.equalsIgnoreCase("yes"))) {
                    return true;
                }
            } else if ((eingabe.equalsIgnoreCase("No"))
                    || (eingabe.equalsIgnoreCase("N"))
                    || (eingabe.equalsIgnoreCase("Nein"))) {
                return false;
            }

        }
    }


    //Eindemensionale Array´s
    //Integrer

    /**
     * Ließt ein eindiemensionales Array von Ganzzahlen ein.
     *
     * @return Ein eindimensionales Array
     * @throws IOException
     */
    public static int[] readItntegrerArray1D() throws IOException {

        System.out.print("Wie viele Werte");
        int zeilen = readInteger();
        int[] array = readItntegrerArray1D(zeilen);

        return array;
    }

    /**
     * Ließt ein eindiemensionales Array von Ganzzahlen ein.
     *
     * @param anzahlwerte Die Anzahl der Array Elemente
     * @return Ein eindimensionales Array
     * @throws IOException
     */
    public static int[] readItntegrerArray1D(int anzahlwerte) throws IOException {

        int[] array = new int[anzahlwerte];
        array = readItntegrerArray1D(array);
        return array;

    }

    public static int[] readItntegrerArray1D(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Wert eingeben für [" + (i + 1) + "]: ");
            array[i] = readInteger();
        }
        return array;
    }

    //double

    /**
     * Ließt ein eindiemensionales Array von Kommazahlen ein.
     *
     * @return Ein eindimensionales Array
     * @throws IOException
     */
    public static double[] readdoubleArray1D() throws IOException {

        System.out.print("Wie viele Werte");
        int zeilen = readInteger();
        double[] array = readdoubleArray1D(zeilen);

        return array;
    }

    /**
     * Ließt ein eindiemensionales Array von Kommazahlen ein.
     *
     * @param anzahlwerte Die Anzahl der Array Elemente
     * @return Ein eindimensionales Array
     * @throws IOException
     */
    public static double[] readdoubleArray1D(int anzahlwerte) throws IOException {

        double[] array = new double[anzahlwerte];
        array = readdoubleArray1D(array);
        return array;

    }

    public static double[] readdoubleArray1D(double[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Wert eingeben für [" + (i + 1) + "]: ");
            array[i] = readDouble();
        }
        return array;
    }


    //String

    /**
     * Ließt ein eindiemensionales Array von Texten ein.
     *
     * @return String Array
     * @throws IOException
     */
    public static String[] readSringArray1D() throws IOException {

        System.out.print("Wie groß soll das Array sein?");
        int a = readInteger();
        String[] array = readSringArray1D(a);

        return array;
    }

    public static String[] readSringArray1D(int anzahlwerte) throws IOException {
        String[] array = new String[anzahlwerte];
        array = readSringArray1D(array);
        return array;

    }

    public static String[] readSringArray1D(String[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {
            System.out.print("Wert eingeben für [" + (i + 1) + "]: ");
            array[i] = IO.readString();

        }
        return array;


    }


    //Zweidemensionale Array´s

    public static int[][] readIntArray2D() throws IOException {

        System.out.println("Wie viele Zeilen");

        int zeilen = readInteger();

        System.out.println("Wie viele Spalten");

        int spalten = readInteger();

        int[][] array = readIntArray2D(zeilen, spalten);

        return array;


    }

    public static int[][] readIntArray2D(int anzahlZeilen, int anzahlSpalten) throws IOException {

        int[][] array = new int[anzahlZeilen][anzahlSpalten];

        array = readIntArray2D(array);

        return array;


    }


    public static int[][] readIntArray2D(int[][] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print("Gib den wert ein der an stelle [" + i + "] [" + j + "] stehen soll:");

                array[i][j] = IO.readInteger();

            }

        }

        return array;


    }


    public static double[][] readDoubleArray2D() throws IOException {

        System.out.println("Wie viele Zeilen");

        int zeilen = readInteger();

        System.out.println("Wie viele Spalten");

        int spalten = readInteger();

        double[][] array = readDoubleArray2D(zeilen, spalten);

        return array;

    }


    public static double[][] readDoubleArray2D(int anzahlZeilen, int anzahlSpalten) throws IOException {

        double[][] array = new double[anzahlZeilen][anzahlSpalten];

        array = readDoubleArray2D(array);

        return array;

    }


    public static double[][] readDoubleArray2D(double[][] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print("Gib den wert ein der an stelle [" + i + "] [" + j + "] stehen soll:");

                array[i][j] = IO.readDouble();

            }

        }

        return array;


    }

    public static String[][] readStringArray2D() throws IOException {

        System.out.println("Wie viele Zeilen");

        int zeilen = readInteger();

        System.out.println("Wie viele Spalten");

        int spalten = readInteger();

        String[][] array = readStringArray2D(zeilen, spalten);

        return array;

    }


    public static String[][] readStringArray2D(int anzahlZeilen, int anzahlSpalten) throws IOException {

        String[][] array = new String[anzahlZeilen][anzahlSpalten];

        array = readStringArray2D(array);

        return array;

    }


    public static String[][] readStringArray2D(String[][] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print("Gib den wert ein der an stelle [" + i + "] [" + j + "] stehen soll:");

                array[i][j] = IO.readString();

            }

        }

        return array;

    }

    //Zufallszahl

    /**
     * Genereiert eine Zufallszahl in einem bestimmten Bereich
     * @param von Untere Grenze des Zufallsbereichs
     * @param bis Obere Grenze des Zufallsbereichs
     * @return    Die generierte Zufallszahl
     */
    public static int generiereZufallszahl (int von, int bis){
      Random random = new Random();
      return random.nextInt(bis + 1 - von) + von;
    }



}




