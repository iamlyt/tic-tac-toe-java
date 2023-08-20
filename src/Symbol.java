import java.util.Scanner;

public class Symbol {

    Scanner scn = new Scanner(System.in);

    public Symbol() {
        printState();
    }

    protected void printState() {
        printGrid();
        analyzeGameState();
    }

    // print 3x3 grid of the numbers
    protected void printGrid() {
//        String[] symbols = scn.nextLine().split("");
//
//        int grid = 3;
//        System.out.println("---------");
//        for (int i = 0; i < symbols.length; i++) {
//
//            // beginning of line
//            if (i % grid == 0) {
//                System.out.print("| ");
//            }
//            System.out.print(symbols[i] + " ");
//
//            // end of line
//            if (i % grid == 2) {
//                System.out.println("|");
//            }
//        }
//        System.out.println("---------");
        System.out.println("---------");

        for (char[] r : arrayFromInput()) {
            System.out.print("| ");
            for (char c : r) {
                System.out.print(c + " ");
            }
            System.out.println("|");
        }

        System.out.println("---------");

        analyzeGameState();
    }

    // return array of char[][] from the input entered
    protected char[][] arrayFromInput() {

        String symbols = scn.nextLine();

        int row = 3;
        int col = 3;

        char[][] board = new char[row][col];

        // add the symbols onto the 3x3 board
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = symbols.charAt(count++);

            }
        }
        return board;
    }


    // check winning conditions
    // print out the game state:
    // - Game not finished
    // - Draw
    // - X wins
    // - O wins
    // - Impossible
    protected void analyzeGameState() {
        // check left diagonal

        // check right diagonal

        // check by row

        // check by col

        // check for impossibles
        // X or O difference is 2 or more, 3 X's and 3 O's
        // neither side has 3 in a row -- grid still has empty cells
        char[][] grid = arrayFromInput();
        boolean XTurn = true;

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

            }

        }


    }
}
