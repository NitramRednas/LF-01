import java.io.IOException;

public class Matrixmultiplikation {

    public static void main(String[] args) throws IOException {

        //Dimensionen abfragen
        System.out.println("Wie viele Zeilen");
        int zeile = IO.readInteger();

        System.out.println("Wieviele Spalten?");
        int spalte = IO.readInteger();

        //Matrixen Eingeben
        System.out.println("Geben sie die erste Matrix ein");
        int[][] matrix1 = new int[zeile][spalte];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Werte Matrix 1\t" + (i + 1) + (j + 1));
                matrix1[i][j] = IO.readInteger();
            }
        }
        System.out.println("Geben sie die zweite Matrix ein");
        int[][] matrix2 = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < zeile; i++) {
            for (int j = 0; j < spalte; j++) {
                System.out.print("Werte Matrix 2\t" + (i + 1) + (j + 1));
                matrix2[i][j] = IO.readInteger();
            }
        }

        //Matrixen Multiplizieren



    }
}
