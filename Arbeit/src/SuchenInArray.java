import java.io.IOException;

public class SuchenInArray {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie 5 Zahlen ein");
        double[] array = IO.readdoubleArray1D(5);

        System.out.println("Geben sie eine Suchzahl ein");
        double sucher = IO.readDouble();

        for (int i = 0; i < 5; i++) {

            if (array[i] == sucher) {
                System.out.println("Treffer");
            } else {
                System.out.println("Niete");
            }

        }

    }
}
