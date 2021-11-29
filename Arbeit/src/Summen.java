import java.io.IOException;

public class Summen {

    public static void main(String[] args) throws IOException {

        int anzahl;
        int summe;
        int[] array = IO.readItntegrerArray1D();

        //gerade Zahlen

        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
               for (int x = 0; x < array.length; x++){
                   summe = x+x;
                   anzahl = x++;
               }
            }
        }



    }
}
