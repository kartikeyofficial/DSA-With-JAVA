import java.util.Scanner;

public class FactorialNumber {
    public static int factorial(int n){
        int f =1;
        for (int i=1; i<=n;i++){
            f = f*i;
        }
        return f;
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = x.nextInt();
        System.out.println("Factorial Of That Number is: "+factorial(n));

    }
}
