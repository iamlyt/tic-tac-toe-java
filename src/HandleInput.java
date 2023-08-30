import java.util.Scanner;

public class HandleInput {

    private final Scanner scanner;

    public HandleInput() {
        scanner = new Scanner(System.in);
    }

    protected String getInputString() {
        return scanner.nextLine();
    }
}
