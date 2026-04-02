
import java.util.Scanner;

public class FreindsPairingProblem {
    public static int friendsPairing(int n){
//        // Base Case

        if (n ==1 || n == 2){
            return  n;
        }
        // choice
        // Single
        int fnm1 = friendsPairing(n-1);

        // pairs
        int fnm2 = friendsPairing(n-2);

        int pairsWays = (n-1) * fnm2;
        int TotalWays  = fnm1 + pairsWays;
        return  TotalWays;
//        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }

    static void main(String[] args) {
        System.out.println("Welcome to The Friends Pairing Problem!\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Total Friends int the party: ");
        int n = x.nextInt();
        System.out.println("Totals ways of Pairing the Friends: "+ friendsPairing(n));
    }
}
