import java.util.Scanner;

 class PatternLeftTriangle {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome To Left Hand Side Triangle Pattern!\n");
        System.out.println("Enter The Limit Of Pattern:");
        int n = x.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

