import java.util.Scanner;

public class SwapWithout3rdVariable {
    static void main(String[] args) {
        System.out.println("Enter The First Number: ");
        Scanner x = new Scanner(System.in);
        int num1 = x.nextInt();
        System.out.println("Enter The Second Number: ");
        int num2 = x.nextInt();

        System.out.println("Before Swapping num1= "+num1+" and num2= "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swapping num1= "+num1+" and num2= "+num2);
    }
}
