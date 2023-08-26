public class Symbol {

    HandleInput input;

    public Symbol() {
        this.input = new HandleInput();
    }

    // print 3x3 grid of the numbers
    protected void printGrid() {

        char[][] array = input.multiArrayFromInput();

        System.out.println("---------");
        for (char[] r : array) {
            System.out.print("| ");
            for (char c : r) {
                System.out.print(c + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");


//        analyzeSymbol('O');
        analyzeGameState();
    }


    // check winning conditions
    protected void analyzeGameState() {

        char xSymbol = 'X';
        char oSymbol = 'O';

        boolean xIsWinning = isWinning(xSymbol);
        boolean oIsWinning = isWinning(oSymbol);

        int numberOfX = getNumberOfSymbols('X');
        int numberOfO = getNumberOfSymbols('O');

        // if difference is 2 or more
        int diffX = numberOfX - numberOfO;
        int diffO = numberOfO - numberOfX;

        if (!xIsWinning && !oIsWinning && getNumberOfSymbols('_') == 0) {
            System.out.println("Draw.");
        } else if (!xIsWinning && !oIsWinning && getNumberOfSymbols('_') > 0) {
            System.out.println("Game not finished");
        } else if (xIsWinning && oIsWinning || diffX >= 2 || diffO >= 2) {
            System.out.println("Impossible.");
        }



    }

    protected int getNumberOfSymbols(char symbol) {
        char[] symbols = input.arrayFromInput();

        int count = 0;

        for (char s : symbols) {
            if (s == symbol) {
                count++;
            }
        }
        return count;
    }

    // check if a certain letter won
    protected boolean isWinning(char letter) {

        char[] symbols = input.arrayFromInput();

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

        for (int i = 0; i < symbols.length; i++) {
            // check vertical
            if (symbols[i] == letter) {
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

        // check if it's not winning...
        // draw or game not finished

//        System.out.println("col1 x count: " + colOne);
//        System.out.println("col2 x count: " + colTwo);
//        System.out.println("col3 x count: " + colThree + "\n");
//
//        System.out.println("row1 x count: " + rowOne);
//        System.out.println("row2 x count: " + rowTwo);
//        System.out.println("row3 x count: " + rowThree + "\n");
//
//        System.out.println("diagonal1 x count: " + diagonalOne);
//        System.out.println("diagonal2 x count: " + diagonalTwo + "\n");
//
//        System.out.println("letter count: " + letterCounter);


    }


}


