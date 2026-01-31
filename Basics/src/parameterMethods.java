import java.util.Scanner;

public class parameterMethods {
    public static int SumOfTwoNumbers(int a, int b){
        int sum = a+b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number:");
        int num2 = x.nextInt();
        int sum =SumOfTwoNumbers(num1, num2);
        System.out.println("Sum Of Two Numbers Is: "+sum);


    }
}
