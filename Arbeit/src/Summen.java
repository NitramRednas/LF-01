import java.io.IOException;

public class Summen {

    public static void main(String[] args) throws IOException {


        int[] array = IO.readItntegrerArray1D();

        int x = 0;
        int xx = 0;
        int y = 0;
        int yy = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                x++;
                xx += array[i];
            } else {
                y++;
                yy += array[i];
            }
        }

        System.out.println("gerade Zahlen");
        System.out.println("Anzahl = " + x);
        System.out.println("Summe = " + xx);

        System.out.println("Ungerade Zahlen");
        System.out.println("Anzahl = " + y);
        System.out.println("Summe = " + yy);


    }


}

