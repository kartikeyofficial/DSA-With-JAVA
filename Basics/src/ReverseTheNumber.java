import java.util.Scanner;

public class ReverseTheNumber {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Numbers:");
        int n = x.nextInt();
        for (int i=0;i<n;i++){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n= n/10;
        }

    }
}
