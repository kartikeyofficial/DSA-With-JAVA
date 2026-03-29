import java.util.Scanner;

 class FibonacciNumber {
    static void main(String[] args) {
        System.out.println("Enter The Number For Fibonacci Number: ");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        System.out.println("Fibonacci Number is: "+fibo(num));

    }
    public static int fibo(int num){
        if (num==0 || num==1){
            return num;
        }
        return  fibo(num-1)+fibo(num-2);
    }
}
