import java.io.IOException;

public class TestIO {

    public static void main(String[] args) throws IOException {

        //Test String
        System.out.println("Geben sie irgenwas ein");
        String eingabe = IO.readString();
        System.out.println("Tada\t" + eingabe);


        //Test Int
        System.out.println("Geben sie eine Int Variable ein");
        int integereingabe = IO.readInteger();
        System.out.println("Tada\t" + integereingabe);


        //Test Double
        System.out.println("Geben sie eine double Variable ein");
        double doubleeingabe = IO.readDouble();
        System.out.println("Tada\t" +  doubleeingabe);

        //Test Boolean
        System.out.println("Sind sie ein Mensch?");
        boolean booleaneingabe = IO.readBoolean();
        System.out.println("Tada\t" + booleaneingabe);

    }
}
