import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int totRows,int totCols){
        for (int i=1; i<=totRows;i++){
            for (int j=1;j<=totCols;j++){
                if(i==1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Rows do You want: ");
        int row = x.nextInt();
        System.out.print("Enter The Column do You Want: ");
        int col = x.nextInt();
        hollowRectangle(row,col);

    }
}
