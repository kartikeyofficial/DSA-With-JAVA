import java.util.Scanner;

class ArrayUtility {
    public static int[][] inputArray(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Size Of Rows: ");
        int rows = x.nextInt();
        System.out.print("Enter The Size Of Columns: ");
        int cols = x.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print("Enter The Matrix Elements ("+(i+1)+","+(j+1)+") is: ");
                matrix[i][j] = x.nextInt();
            }
        }
        return matrix;
    }
}
