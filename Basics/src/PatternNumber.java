import java.util.Scanner;

public class PatternNumber {

        static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("Welcome To Left Hand Side Triangle Number Pattern!\n");
            System.out.println("Enter The Limit Of Pattern:");
            int n = x.nextInt();
            for (int i=1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

