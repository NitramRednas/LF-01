import java.io.IOException;

public class TestUmgebung {

    public static void main(String[] args) throws IOException {


        System.out.println("Geben sie irgenwas ein");

        String eingabe = IO.readstring();

        System.out.println("Tada" + eingabe);

    }
}
