import java.io.IOException;

public class Matrixmultiplikation {

    public static void main(String[] args) throws IOException {

        //Dimensionen abfragen
        System.out.println("Wie viele Zeilen");
        int zeile = IO.readInteger();

        System.out.println("Wieviele Spalten?");
        int spalte = IO.readInteger();

        int wert[] = new int[spalte];
        int wert1 = 0;
        int y = 0;

        System.out.println("Matritze 1");
        int[][] matrix1 = IO.readIntArray2D(zeile,spalte);
        System.out.println("Matritze 2");
        int[][] matrix2 = IO.readIntArray2D(spalte, zeile);

        //Matrixen Multiplizieren

        int[][] endwert = new int[zeile][zeile];

        for (int i =0; i < zeile; i++){
            for (int j =0; j < zeile; j++){
                for (int k = 0; k < spalte; k++){
                    wert[k] = matrix1[i][k] * matrix2[k][j];
                    wert1 += wert[k];
                }
                endwert[i][y] = wert1;
                y++;
                wert1 = 0;
            }
            y = 0;
        }
        System.out.println("Multiplizierte Matrix");
        for (int i = 0; i < endwert.length; i++){
            for (int j= 0; j < endwert[i].length; j++){
                System.out.print(endwert[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
