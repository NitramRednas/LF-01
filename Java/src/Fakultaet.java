import java.io.IOException;

public class Fakultaet {

    public static void main(String[] args) throws IOException {

        System.out.println("Geben sie n ein");
        int fakultaet = IO.readInteger();
        int i,fact=1;
         for (i =1; i <= fakultaet;i++){
             fact= fact * i;
             System.out.println("Die Fakultät von\t" + i + "\tist\t=" + fact);
         }
    }
}
