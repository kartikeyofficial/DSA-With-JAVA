public class NQueens {
   public static int count;

    public static boolean isSafe(char[][] board, int row, int cols){
        // vertical up
        for (int i=row-1;i>=0;i--){
            if (board[i][cols]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for (int i=row-1, j=cols-1;i>=0 && j>=0;i--,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for (int i=row-1, j=cols+1;i>=0 && j<board.length;i--,j++){
            if (board[i][j]=='Q'){
                return  false;
            }
        }
        return  true;

        //
    }

    public static void nQueen(char[][] board, int row){

        if (row == board.length){
            printBoard(board);
            count++;
            return;
        }
        for (int j=0;j< board.length;j++){
           if (isSafe(board,row,j)){
               board[row][j] = 'Q';
               nQueen(board,row+1);
               board[row][j] = 'x';
           }
        }
    }
    public static void printBoard(char[][] board){

        System.out.println("----------- Chess Board -------------");
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }


    static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueen(board,0);
        System.out.println("\nTotal No of Ways to Solve NQueens: "+count);

    }
}
