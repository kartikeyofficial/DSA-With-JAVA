import java.util.Scanner;

public class SquarePattern {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Range Of Pattern:");
        int n = x.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
