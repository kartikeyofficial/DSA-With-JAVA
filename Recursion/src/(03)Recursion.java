import java.util.Scanner;

 class Recursion {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number For Factorial: ");
        int num = x.nextInt();
        System.out.println(recursive(num));

    }
    public static int recursive(int num){
        if (num ==0){
            return 1 ;
        }
        return num*recursive(num-1);
    }
}
