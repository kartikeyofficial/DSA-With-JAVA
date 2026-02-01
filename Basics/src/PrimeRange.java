import java.util.Scanner;

public class PrimeRange {
    public  static boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Range for Prime: ");
        int n = x.nextInt();
        primeRange(n);

    }
}
