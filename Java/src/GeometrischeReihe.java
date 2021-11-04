import java.io.IOException;

public class GeometrischeReihe {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie die Zahl n an");
        int n = IO.readInteger();

        for (int i=1; i <=n ; i++){
           double fact = 1/ Math.pow(2,i);
            System.out.println("Die Geometrische Reihe von\t" + i +"\tist\t=\t" + fact);
        }
    }
}
