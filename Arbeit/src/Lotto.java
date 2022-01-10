import java.io.IOException;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) throws IOException {


    int[] zahlen = new int[7];

    for (int i = 0; i < zahlen.length; i++){
        zahlen[i] = generiereZufallszahl(1,49);
    }

    for (int i = 0; i < zahlen.length; i++){
        System.out.print(zahlen[i] + "\t");
    }
        System.out.println();
        System.out.println("Zusatzzahl\t" + zahlen[zahlen.length - 1]);
    }


    /**
     * Genereiert eine Zufallszahl in einem bestimmten Bereich
     * @param von Untere Grenze des Zufallsbereichs
     * @param bis Obere Grenze des Zufallsbereichs
     * @return    Die generierte Zufallszahl
     */
    private static int generiereZufallszahl (int von, int bis) {
        Random random = new Random();
        return random.nextInt(bis + 1 - von) + von;
    }

}
