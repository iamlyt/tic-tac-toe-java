public class Symbol {
    
    // check winning conditions
    protected String analyzeGameState(char[][] array) {

        boolean xIsWinning = checkWin(array, 'X');
        boolean oIsWinning = checkWin(array, 'O');

        if (xIsWinning) {
            return "X wins";
        } else if (oIsWinning) {
            return "O wins";
        } else {
            return "Draw";
        }
    }

    // turns the 2D array passed into a String
    protected String boardToString(char[][] board) {
        StringBuilder str = new StringBuilder();
        for (char[] row : board) {
            for (char c : row) {
                str.append(c);
            }
        }
        return str.toString();
    }

    // check if a certain letter won
    protected boolean checkWin(char[][] array, char letter) {
        int winNum = 3;

        int colOne = 0;
        int colTwo = 0;
        int colThree = 0;

        int rowOne = 0;
        int rowTwo = 0;
        int rowThree = 0;

        int diagonalOne = 0;
        int diagonalTwo = 0;

        boolean winning = false;

        String str = boardToString(array);
        for (int i = 0; i < str.length(); i++) {
            // check vertical
            if (str.charAt(i) == letter) {
                // check vertical
                if (i % winNum == 0) {
                    colOne++;
                }
                if (i % winNum == 1) {
                    colTwo++;
                }
                if (i % winNum == 2) {
                    colThree++;
                }
                // check horizontal
                if (i < winNum) {
                    rowOne++;
                } else if (i < 6) {
                    rowTwo++;
                } else if (i < 9) {
                    rowThree++;
                }
                // check top left to bottom right diagonal
                if (i % 4 == 0) {
                    diagonalOne++;
                }
                // check top right to bottom left diagonal
                if (i % 2 == 0 && i <= 6 && i != 0) {
                    diagonalTwo++;
                }
            }
        }
        // check 8 winning conditions here:
        if (colOne == winNum || colTwo == winNum || colThree == winNum) {
            winning = true;
        } else if (rowOne == winNum || rowTwo == winNum || rowThree == winNum) {
            winning = true;
        } else if (diagonalOne == winNum || diagonalTwo == winNum) {
            winning = true;
        }

        return winning;
    }


}


