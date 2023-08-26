public class Main {
    public static void main(String[] args) {

//        Symbol s = new Symbol();
//        s.arrayFromInput();
//        Scanner scn = new Scanner(System.in);
//        char[] s = scn.nextLine().toCharArray();
//
//        System.out.println(Arrays.toString(s));


//        Symbol s = new Symbol();
////
//        char[][] grid = s.arrayFromInput();
////        boolean XTurn = false;
////        boolean OTurn = false;
//        int xCount = 0;
//        int oCount = 0;
//        boolean gameFinished = false;

//        for (int row = 0; row < grid.length; row++) {
//
//            for (int col = 0; col < grid[row].length; col++) {
////                // left top to right bottom - diagonal
////                if (row == col) {
////                    if (grid[row][col] == 'X') {
////                        xCount++;
////                    }
////                    if (grid[row][col] == 'O') {
////                        oCount++;
////                    }
////                }
//
//                if (grid[row][col] == 'X') {
//                    xCount++;
//                }
//                if (grid[row][col] == 'O') {
//                        oCount++;
//                }
//
//                if (xCount + oCount == 9 && ) {
//                    gameFinished = true;
//                }
//
//                if (gameFinished) {
//
//                }
//            }
//        }


        // vertical, horizontal, diagonal winning conditions


//        System.out.println("x count: " + xCount);
//        System.out.println("o count: " + oCount);

//        Scanner scn = new Scanner(System.in);
//        String symbols = scn.nextLine();

//        char[] symbolsChar = symbols.toCharArray();
//        System.out.println(Arrays.toString(symbolsChar));
//
//
//        int win = 3;
//        int letterCounter = 0;
//        int colOne = 0;
//        int colTwo = 0;
//        int colThree = 0;
//
//        int rowOne = 0;
//        int rowTwo = 0;
//        int rowThree = 0;
//
//        int diagonalOne = 0;
//        int diagonalTwo = 0;
//
//        for (int i = 0; i < symbolsChar.length; i++) {
//            // check vertical
//            if (symbolsChar[i] == 'X') {
//                // count the letter for further processing
//                letterCounter++;
//
//                // check vertical
//                if (i % 3 == 0) {
//                    colOne++;
//                }
//                if (i % 3 == 1) {
//                    colTwo++;
//                }
//                if (i % 3 == 2) {
//                    colThree++;
//                }
//
//                // check horizontal
//                if (i < 3) {
//                    rowOne++;
//                } else if (i < 6) {
//                    rowTwo++;
//                } else if (i < 9) {
//                    rowThree++;
//                }
//
//                // check top left to bottom right diagonal
//                if (i % 4 == 0) {
//                    diagonalOne++;
//                }
//                // check top right to bottom left diagonal
//                if (i % 2 == 0 && i <= 6 && i != 0) {
//                    diagonalTwo++;
//                }
//            }
//        }
//
//        if (colOne == win || colTwo == win || colThree == win) {
//            System.out.println("(letter) won vertically");
//        } else if (rowOne == win || rowTwo == win || rowThree == win) {
//            System.out.println("(letter) won horizontally");
//        } else if (diagonalOne == win || diagonalTwo == win) {
//            System.out.println("(letter) won diagonally");
//        } else {
//            System.out.println("no one won");
//        }
//
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

        // check impossible, draw, game not finished, win

//        Scanner scn = new Scanner(System.in);
        Symbol s = new Symbol();
        s.printGrid();

    }
}
