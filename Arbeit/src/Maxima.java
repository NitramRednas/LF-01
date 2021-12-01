import java.io.IOException;

public class Maxima {


    //Braucht noch Feintuning

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie ein Array aus Kommazahlen ein");
        double[] array = IO.readdoubleArray1D();

        double x = 0;
        double x1 = 0;

        for (int i = 0; i < array.length; i++) {
            x = Math.max(array[i], x1);
            x1 = Math.max(array[i], x);

        }
        if (x1 < x) {
            System.out.println("Größte Zahl:\t" + x + "\nZweitgrößte Zahl:\t" + x1);
        } else {
            System.out.println("Größte Zahl:\t" + x1 + "\nZweitgrößte Zahl:\t" + x);
        }

    }
}
