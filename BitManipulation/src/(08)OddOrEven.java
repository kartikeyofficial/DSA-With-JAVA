import java.util.Scanner;

class OddOrEven {
    public static void oddAndEven(int num){
        int bitmask = 1;
        if((num & bitmask)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = x.nextInt();
        oddAndEven(num);

    }
}
