public class UserInterface {
    private final Symbol symbol;
    private final HandleInput inputHandler;
    private boolean turn;

    protected UserInterface() {
        this.symbol = new Symbol();
        this.inputHandler = new HandleInput();
        this.turn = true;
    }

    protected void start() {

        // 1. start with empty board:
        char[][] board = new char[3][3];
        printGrid(board);

        while (true) {
            // ask user input
            String[] userInput = inputHandler.getInputString().split(" ");

            // if input is not numbers
            if (!isInteger(userInput)) {
                System.out.println("You should enter numbers!");
                continue;
            }
            // if input is 1-3
            if (isOneToThree(userInput)) {
                int one = Integer.parseInt(userInput[0]);
                int two = Integer.parseInt(userInput[1]);

                // if cell is not occupied...
                if (!cellIsOccupied(board, one, two)) {

                    // turn here:
                    board[one - 1][two - 1] = turn ? 'X' : 'O';
                    printGrid(board);

                    // analyze game state here:
                    String win = symbol.analyzeGameState(board);
                    if (elementCounter(board) >= 5) {
                        if (win.equals("X wins") || win.equals(
                                "O wins") || win.equals("Draw")) {
                            System.out.println(win);
                            break;
                        }
                    }

                } else {
                    System.out.println("This cell is occupied! Choose another" +
                            " one!");
                }
            }  else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
        turn = !turn;

        // loop --> ask user to enter cell coordinates
        // then --> analyzes move for correctness and show grid if ok
        // finally --> ends game if WIN or DRAW --> analyzeGameState()
    }

    protected Integer elementCounter(char[][] array) {
        int counter = 0;
        for (char[] r : array) {
            for (char c : r) {
                if (c == 'X' || c == 'O') {
                    counter++;
                }
            }
        }
        return counter;
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

        /* ----------DO NOT DELETE---------- */
//        System.out.println(symbol.analyzeGameState(array));
    }


    protected boolean isInteger(String [] str) {
        int counter = 0;
        for (String s : str) {
            if (!s.matches("\\d+")) {
                counter++;
            }
        }
        return counter == 0;
    }

    protected boolean isOneToThree(String [] str) {
        int counter = 0;
        for (String s : str) {
            if (!s.matches("[1-3]")) {
                counter++;
            }
        }
        return counter == 0;
    }

    protected  boolean cellIsOccupied(char[] [] board, int i, int j) {
        return board[i-1][j-1] == 'X' || board[i-1][j-1] == 'O';
    }
}
