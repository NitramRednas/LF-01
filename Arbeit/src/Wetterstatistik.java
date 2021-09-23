public class Wetterstatistik {

    public static void main(String[] args)

    {
        //Definition

        double april;
        double mai;
        double juni;
        double mittelwert;

        //Wetterdaten

        april=13.4;
        mai=14.6;
        juni=8.3;

        //Rechnung

        mittelwert=(april+mai+juni)/3;

        //Output

        System.out.println("Wetterstatistik");
        System.out.println("April       \t" + april);
        System.out.println("Mai         \t"  + mai);
        System.out.println("Juni        \t"   + juni);
        System.out.println("Mittelwert  \t" + mittelwert);


    }

}
