import java.util.Scanner;

public class HandleInput {

    private final Scanner scanner;

    public HandleInput() {
        scanner = new Scanner(System.in);
    }

    protected String getInputString() {
        return scanner.nextLine();
    }

    /* POSSIBLE DELETION */
//    protected char[][] multiArrayFromInput() {
//
//        String symbols = getInputString();
//
//        int row = 3;
//        int col = 3;
//
//        char[][] board = new char[row][col];
//
//        // add the symbols onto the 3x3 board
//        int count = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                board[i][j] = input.charAt(count++);
//            }
//        }
//        return board;
//    }

}
