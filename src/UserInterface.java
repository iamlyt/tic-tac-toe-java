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

                if (cellIsOccupied(board, one, two)) {
                    System.out.println("This cell is occupied! Choose another" +
                            " one!");
                } else {
                    // turn here:
                    board[one - 1][two - 1] = turn ? 'X' : 'O';
                    printGrid(board);

                    // analyze game state here:
                    String win = symbol.analyzeGameState(board);
                    // the number 5 indicates the first-most possible win
                    if (elementCounter(board) >= 5) {
                        if (win.equals("X wins") || win.equals(
                                "O wins")) {
                            System.out.println(win);
                            break;
                        }
                        if (win.equals("Game not finished")) {
                            continue;
                        }
                    // if the board is finished,
                    } else if (elementCounter(board) == 9) {
                        System.out.println(win);
                    }
                    // change turns
                    turn = !turn;
                }
            }  else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }

    // counts the total number of elements there are in the 2D array
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
    
    // prints 3x3 board of the 2D array 
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
    }

    // checks if the input are integers
    protected boolean isInteger(String [] str) {
        int counter = 0;
        for (String s : str) {
            if (!s.matches("\\d+")) {
                counter++;
            }
        }
        return counter == 0;
    }

    // checks if the input are numbers from 1 to 3
    protected boolean isOneToThree(String [] str) {
        int counter = 0;
        for (String s : str) {
            if (!s.matches("[1-3]")) {
                counter++;
            }
        }
        return counter == 0;
    }

    // checks if the numbers user entered are occupied on the 3x3 board passed
    protected  boolean cellIsOccupied(char[][] board, int i, int j) {
        return board[i-1][j-1] == 'X' || board[i-1][j-1] == 'O';
    }
}
