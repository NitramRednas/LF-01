import java.io.IOException;

public class BMI {

    public static void main(String[] args) throws IOException {

        System.out.println("Bitte geben sie ihr Geschlecht an\n" + "(M)ännlich oder (W)eiblich");
        String geschlecht = IO.readString();

        if (geschlecht.equalsIgnoreCase("M")) {

            System.out.println("Bitte geben sie ihr Gewicht in Kg an");
            double gewicht = IO.readDouble();

            System.out.println("Bitte geben sie ihre Größe in cm an");
            double cm = IO.readDouble();
            double bmicm = cm / 100;
            double bmi = gewicht / Math.pow(bmicm, 2.0);

            if (bmi <= 20) {
                System.out.println("Sie sind Untergewichtig" + bmi);
            } else if (20 < bmi && bmi < 25) {
                System.out.println("Sie sind Normalgewichtig" + bmi);
            } else if (25 < bmi && bmi < 30) {
                System.out.println("Sie sind Übergewichtig" + bmi);
            } else if (30 < bmi && bmi < 40) {
                System.out.println("Sie haben Adipositas" + bmi);
            } else if (bmi > 40) {
                System.out.println("Sie haben starke Adipositas" + bmi);
            }


        } else if (geschlecht.equalsIgnoreCase("W"))

        System.out.println("Bitte geben sie ihr Gewicht in Kg an");
        double gewicht = IO.readDouble();

        System.out.println("Bitte geben sie ihre Größe in cm an");
        double cm = IO.readDouble();
        double bmicm = Math.pow(cm * 100, 2.0);
        double bmi = gewicht / bmicm;

        if (bmi <= 19) {
            System.out.println("Sie sind Untergewichtig" + bmi);
        } else if (19 < bmi && bmi < 24) {
            System.out.println("Sie sind Normalgewichtig" + bmi);
        } else if (24 < bmi && bmi < 30) {
            System.out.println("Sie sind Übergewichtig" + bmi);
        } else if (30 < bmi && bmi < 40) {
            System.out.println("Sie haben Adipositas" + bmi);
        } else if (bmi > 40) {
            System.out.println("Sie haben starke Adipositas" + bmi);
        }
    }

}
