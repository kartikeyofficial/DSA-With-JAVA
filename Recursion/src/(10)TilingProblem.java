import java.util.Scanner;

class TilingProblem {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome to the Tiling Problem\n");
        System.out.print("Enter The Size of Tile Length: ");
        int n = x.nextInt();
        System.out.println("Total Tile to Cover The Floor is: "+Tiling(n));

    }
    public static int Tiling(int n){
        // base Case
        if (n==1 || n==0){
            return 1;
        }
        // Vertical Choice
        int vertical = Tiling(n-1);

        // Horizontal Choice
        int horizontal = Tiling(n-2);
        int totalWay = vertical + horizontal;
        return totalWay;
    }

}
