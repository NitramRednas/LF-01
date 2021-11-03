import java.io.IOException;

public class Altersprüfung {

    public static void main(String[] args) throws IOException {

        System.out.println("Wie alt sind Sie?");

        int alter = IO.readInteger();

        if (alter <= 17)
        {
            System.out.println("Sie sind Minderjährig");
        }
        else
        {
            System.out.println("Sie sind Alt");
        }
    }
}
