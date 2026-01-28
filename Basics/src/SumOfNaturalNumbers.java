import java.util.Scanner;

public class SumOfNaturalNumbers {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Range:");
        int num = x.nextInt();
        int i =1;
        int sum = 0;
        while (i<=num){
            sum +=i;
            i++;
        }
        System.out.println(sum);

    }
}
