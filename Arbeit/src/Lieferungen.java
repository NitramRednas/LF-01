import java.io.IOException;
import java.sql.SQLOutput;

public class Lieferungen {

    public static void main(String[] args) throws IOException {

        //Dimensionen abfragen
        System.out.println("Wie viele Artikel haben Sie?");
        int artikel = IO.readInteger();

        System.out.println("Wieviele Kunden haben Sie?");
        int kunden = IO.readInteger();

        //Matrixen Eingeben
        System.out.println("Geben sie die Matrix für Januar ein");
        int[][] januar = new int[artikel][kunden];
        for (int i = 0; i < januar.length; i++) {
            for (int j = 0; j < januar[i].length; j++) {
                System.out.print("Artikel\t" + (i + 1) + "\tfür Kunde\t" + (j + 1) + ":");
                januar[i][j] = IO.readInteger();
            }
        }
        System.out.println("Geben sie die Matrix für Februar ein");
        int[][] februar = new int[januar.length][januar[0].length];
        for (int i = 0; i < artikel; i++) {
            for (int j = 0; j < kunden; j++) {
                System.out.print("Ware\t" + (i + 1) + "\tfür Kunde\t" + (j + 1) + ":");
                februar[i][j] = IO.readInteger();
            }
        }
        //Matrixen addiren
        int[][] summe = new int[januar.length][januar[0].length];
        for (int i = 0; i < summe.length; i++) {
            for (int j = 0; j < summe[i].length; j++) {
                summe[i][j] = januar[i][j] + februar[i][j];
            }
        }
        //Summe ausgeben
        System.out.println("Die Summenmatrix:");
        for (int i = 0; i < summe.length; i++) {
            for (int j = 0; j < summe[i].length; j++) {
                System.out.print(summe[i][j] + "\t");
            }
        }
        System.out.println();

        //Zeilensummen berechnen
        int[] zeilensumme = new int[summe.length];
        for (int i = 0; i < summe.length; i++){
            for (int j =0; j < summe[i].length; j++){
                zeilensumme[i] = zeilensumme[i] + summe[i][j];
            }
        }
        System.out.println("Zeilensummen");
        for (int i = 0; i < zeilensumme.length; i++){
            System.out.print(zeilensumme[i] + "\t");
        }
        System.out.println();


        //Spaltensummen berechnen
        int[] spaltensumme = new int[summe[0].length];
        for (int i = 0; i < summe[0].length; i++){
            for (int j = 0; j < summe.length; j++){
                spaltensumme[i] = spaltensumme[i] + summe[i][j];
            }
        }
        System.out.println("Spaltensummen");
        for (int i = 0; i < spaltensumme.length; i++){
            System.out.print(spaltensumme[i] + "\t" );
        }
        System.out.println();

    }
}