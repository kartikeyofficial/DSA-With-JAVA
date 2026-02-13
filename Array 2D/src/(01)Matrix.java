import java.util.Scanner;

class Matrix {
    public static boolean search(int[][] matrix , int key){

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                if (matrix[i][j]== key){
                    System.out.println("found at cell "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    static void main(String[] args) {
        System.out.println("Welcome to The Matrix\n");
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
        System.out.println("\nOutput of Matrix\n");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("\nEnter The Elements Do You Want To Search: ");
        int key = x.nextInt();
        boolean isAvailable = search(matrix,key);
        if (isAvailable){
            System.out.println("Element is Available!");
        }else {
            System.out.println("Element is Not Available!");
        }
    }
}
