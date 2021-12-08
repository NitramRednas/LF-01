import java.io.IOException;

public class Tonsignal {

    public static void main(String[] args) throws IOException {


        System.out.println("Geben sie die Menge der Tonsignale an");
        int[] signal = IO.readItntegrerArray1D();
        int[] glatt = new int[signal.length];

        glatt[0] = (signal[0] + signal[1]) / 2;
        glatt[signal.length - 1] = (signal[signal.length - 2] + signal[signal.length - 1]) / 2;

        for (int i = 1; i < glatt.length - 1; i++) {
            glatt[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
        }
        System.out.println("");

        for (int i = 0; i < glatt.length; i++) {
            System.out.print("\t" + signal[i]);
        }
        System.out.println();
        for (int i = 0; i < glatt.length; i++) {
            System.out.print("\t" + glatt[i]);
        }
    }
}
