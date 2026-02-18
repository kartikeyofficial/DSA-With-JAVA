import java.util.Scanner;

 class Strings {
    static void main(String[] args) {
        System.out.println("welcome to String User input: ");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The Name: ");
        String name = x.nextLine();
        System.out.println(name.length());
        System.out.println(name.charAt(0));
    }
}
