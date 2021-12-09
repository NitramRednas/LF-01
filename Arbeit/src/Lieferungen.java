import java.io.IOException;

public class Lieferungen {

    public static void main(String[] args) throws IOException {

        System.out.println("Bestimmen sie die Werte für die erste Matrix");
        int[][] matrix1 = IO.readIntArray2D(3, 4);

        System.out.println("Bestimmen sie die Werte für die zweite Matrix");
        int[][] matrix2 = IO.readIntArray2D(3, 4);

        for (int i = 0; i < matrix1.length; i++){
            System.out.println("");
            for (int j = 0; j < matrix2.length; j++){
                int summe = matrix1[i][j] + matrix2[i][j];
                System.out.print(summe + "\t");
            }
        }

    }
}
