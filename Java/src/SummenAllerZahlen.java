import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummenAllerZahlen

        {
            public static void main(String[] args) throws IOException {

                //Nutzerabfrage
                System.out.println("Geben sie die Zahl n ein");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String eingabe = br.readLine();
                int n = (int) Double.parseDouble(eingabe.trim());

                //for Schleife

                int SummeFor =0;

                for (int i=1; i<=n; i++)
                    SummeFor = SummeFor +i;{
                    System.out.println("For Schleife ergibt \t" + SummeFor);
                }

                //While Schleife

                int m = (int) Double.parseDouble(eingabe.trim());
                int o=1;
                int SummeWhile = 0;

                while (o<=m){

                    SummeWhile = SummeWhile +o;
                    o =o+1;
                }

                System.out.println("While Schleife ergibt \t" + SummeWhile);

                //Do Schleife

                int b = (int) Double.parseDouble(eingabe.trim());
                int Summedo =0;
                int u =1;

                do {

                    Summedo = Summedo +u;
                    u = u+1;

                }while (u<=b);

                System.out.println("Do Schleife ergibt \t" + Summedo);


                System.out.println( "Zeit Kekse zu Essen");

            }

}

                //Zeit für mehr Kekse