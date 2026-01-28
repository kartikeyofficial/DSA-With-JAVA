import java.util.Scanner;

public class input {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int a = x.nextInt();
        System.out.println("Enter The Second Number: ");
        int b = x.nextInt();
        System.out.println("Addition Of Two Numbers:"+(a+b));
        System.out.println("Enter The First Name:");
        String name = x.next();
        System.out.println(name);
        System.out.println("Enter The Full Name:");
        String fullName = x.nextLine();
        System.out.println(fullName);
        System.out.println("Enter The Price Of Product:");
        float price = x.nextFloat();
        System.out.println(price);

    }
}
