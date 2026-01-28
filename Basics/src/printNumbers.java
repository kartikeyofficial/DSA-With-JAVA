import java.util.Scanner;

public class printNumbers {
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Range:");
        int num = x.nextInt();
        int i =1;
        while (i<=num){
            System.out.println(i);
            i++;
        }

    }
}
