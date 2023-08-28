public class UserInterface {
    private final Symbol symbol;
    private final HandleInput inputHandler;

    protected UserInterface() {
        this.symbol = new Symbol();
        this.inputHandler = new HandleInput();
    }

    protected void start() {
        // retrieves input ONCE for processing
        String inputString = inputHandler.getInputString();
        // creates 2D array
        char[][] board = inputHandler.multiArrayFromInput(inputString);
        printGrid(board);
    }

    protected void printGrid(char[][] array) {

        System.out.println("---------");
        for (char[] r : array) {
            System.out.print("| ");
            for (char c : r) {
                System.out.print(c + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");


        System.out.println(symbol.analyzeGameState(array));
    }

}
