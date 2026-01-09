

public class Main {
    public static void main(String[] args){
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };


        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******   *      *   ****      *      *   *    *     ****      ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*         *      *   *    *    *      *   *   *     *    *     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*         *      *   *     *   *      *   *  *     *      *    ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******   *      *   *     *   *      *   ***      *      *    ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      *   *      *   *     *   *      *   *  *     *      *    ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      *    *    *    *    *     *    *    *   *     *    *     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******     ****     ****        ****     *    *     ****      ");
        System.out.println();
        char[][] question = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                question[i][j] = board[i][j];
            }
        }
        solve(board);

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tQUESTION SUDOKU    ------->     SOLVED SUDOKU\n");
        printParallel(question, board);




    }

    static void printParallel(char[][] left, char[][] right) {

        for (int i = 0; i < 9; i++) {

            if (i % 3 == 0) {
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+=======+=======+=======+    ");
                System.out.println("+=======+=======+=======+");
            }

            // LEFT (Question)
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(left[i][j] + " ");
                if (j == 8) System.out.print("|");
            }

            System.out.print("    ");

            // RIGHT (Solved)
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                System.out.print(right[i][j] + " ");
                if (j == 8) System.out.print("|");
            }

            System.out.println();

            if (i == 8) {
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+=======+=======+=======+    ");
                System.out.println("+=======+=======+=======+");
            }
        }
    }


    public static boolean solve(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    for(char c='1'; c<='9'; c++){
                        if(isValid(board, i, j, c)){

                            board[i][j] = c;

                            if(solve(board)){
                                return true;
                            }

                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValid(char[][] board, int row, int col, char c){

        for(int i=0; i<9; i++){
            if(board[i][col] == c){
                return false;
            }
            if(board[row][i] == c){
                return false;
            }

            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c){
                return false;
            }
        }

        return true;
    }
}
