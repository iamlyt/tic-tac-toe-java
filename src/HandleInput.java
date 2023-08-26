import java.util.Scanner;

public class HandleInput {

    public HandleInput(Scanner scn) {

    }

    protected String getInputString() {
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    protected char[] arrayFromInput() {
        String input = getInputString();
        return input.toCharArray();
    }

    protected char[][] multiArrayFromInput() {

        String symbols = getInputString();

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



}
