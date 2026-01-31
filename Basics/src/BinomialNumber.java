import java.util.Scanner;

public class BinomialNumber {
    public static int factorial(int n){
        int f =1;
        for (int i=1; i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int BinoCoefficient(int n, int r){
        int Fact_n = factorial(n);
        int Fact_r = factorial(r);
        int Fact_nr = factorial(n-r);

        int BinoCoefficient = Fact_n/(Fact_r*Fact_nr);
        return BinoCoefficient;


    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The value N: ");
        int n = x.nextInt();
        System.out.println("Enter The Value of R: ");
        int r = x.nextInt();
        System.out.println("Binomial Coefficient Of That Numbers is: "+BinoCoefficient(n,r));

    }
}
