public class PatternButterfly {
    static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int k=i;k<=n-1;k++){
                System.out.print("  ");
            }
            for (int l=i;l<=n-1;l++){
                System.out.print("  ");
            }
            for (int m=1;m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {

            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int k=i;k<=n-1;k++){
                System.out.print("  ");
            }
            for(int l=i;l<=n-1;l++){
                System.out.print("  ");
            }
            for (int m=1;m<=i;m++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    }

