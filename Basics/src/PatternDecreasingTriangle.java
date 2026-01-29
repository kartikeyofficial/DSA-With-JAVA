import java.util.Scanner;

public class PatternDecreasingTriangle {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Decreasing Right Hand Side Triangle Pattern!\n");
        System.out.println("Enter The Limit Of Pattern:");
        int n = x.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

