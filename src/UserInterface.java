public class UserInterface {
    private final Symbol symbol;
    private final HandleInput inputHandler;

    protected UserInterface() {
        this.symbol = new Symbol();
        this.inputHandler = new HandleInput();
    }

    protected void start() {
//                // retrieves input ONCE for processing
//        String inputString = inputHandler.getInputString();
//        // creates 2D array
//        char[][] board = inputHandler.multiArrayFromInput(inputString);

        // start with empty board:
        char[][] board = new char[3][3];
        printGrid(board);
        
        while (true) {
            String[] userInput = inputHandler.getInputString().split(" ");

            // if input is not numbers
            if (!isInteger(userInput)) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (isOneToThree(userInput)) {
                int one = Integer.parseInt(userInput[0]);
                int two = Integer.parseInt(userInput[1]);

                if (!cellIsOccupied(board, one, two)) {
                    board[one - 1][two - 1] = 'X';
                    printGrid(board);
                } else {
                    System.out.println("This cell is occupied! Choose another" +
                            " one!");
                }
            }  else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }

        // turns --> x first
        // take turns until a player wins
        // --> everytime grid prints, it checks if theres a winner
    }

    protected void printGrid(char[][] array) {


        System.out.println("---------");
        for (char[] r : array) {
            System.out.print("| ");
            for (char c : r) {
                if (c == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(c + " ");
                }

            }
            System.out.println("|");
        }
        System.out.println("---------");

        /* DO NOT DELETE -- ANALYZES WIN STATES*/
        System.out.println(symbol.analyzeGameState(array));
    }


    protected boolean isInteger(String[] str) {
        int counter = 0;
        for (String s : str) {
            if (!s.matches("\\d+")) {
                counter++;
            }
        }
        return counter == 0;
    }

    protected boolean isOneToThree(String[] str) {
//
//        String stringOne = str[0];
//        String stringTwo = str[1];
//
//        boolean matches = stringOne.matches("[1-3]");

        int counter = 0;
        for (String s : str) {
            if (!s.matches("[1-3]")) {
                counter++;
            }
        }
        return counter == 0;
    }

    protected  boolean cellIsOccupied(char[][] board, int i, int j) {
        return board[i-1][j-1] == 'X' || board[i-1][j-1] == 'O';
    }
}
