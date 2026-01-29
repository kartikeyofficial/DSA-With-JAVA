import java.util.*;

public class PrimeOrNot {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n = x.nextInt();
        boolean isPrime = true;
        if(n<=1){
            System.out.println("Number is Not Prime");
        }
        if (n==2) {
            System.out.println("Number is Prime");

        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is Not Prime");
        }

    }
}
