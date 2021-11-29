import java.io.IOException;

public class Verdoppeln {

    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben sie ein Array aus Kommazahlen ein");
        double[] array1 = IO.readdoubleArray1D();

        System.out.println("Ursprüngliches Array:\n");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Verdoppeltes Array:\n");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] * 2;
            System.out.println(array1[i]);
        }

    }

}
